package com.metlife.utility;

import com.metlife.pageobjects.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import java.time.Duration;

public class WebDriverUtils
{
static Actions action;
static WebDriver driver;
public static void initialize()
{
switch (PropertyUtils.getProperty("browser"))
{
case "Firefox":
driver = new FirefoxDriver();
break;
case "Edge":
driver = new EdgeDriver();
break;
default:
driver = new ChromeDriver();
break;
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
public static void launchUrl(String url) throws IOException
{
driver.get(url);
ScreenShots.getScreenShot(driver,"HomePage");
}
public static void type(By locator, String value)
{
WebElement e = driver.findElement(locator);
e.clear();
e.sendKeys(value);
}
public static void click(By locator) throws IOException
{
driver.findElement(locator).click();
}
public static void navigateToCommerce() throws InterruptedException, IOException
{
driver.findElement(NavigateCommerceLocators.hambergerClick).click();
driver.findElement(NavigateCommerceLocators.viewAllClick).click();
Thread.sleep(3000);
driver.findElement(NavigateCommerceLocators.searchCommerce).sendKeys("Commerce");
driver.findElement(NavigateCommerceLocators.commerceLinkClick).click();
ScreenShots.getScreenShot(driver,"NavigateCommerce");
}
public static void navigateToAccount() throws IOException
{
driver.findElement(NavigateAccountLocators.showNavigationMenu).click();
ScreenShots.getScreenShot(driver,"NavigateAccount1");
driver.findElement(NavigateAccountLocators.selectAccountOption).click();
ScreenShots.getScreenShot(driver,"NavigateAccount2");
}
public static void createNewAccount() throws InterruptedException, IOException
{
driver.findElement(CreateAccountLocators.newAccountClick).click();
driver.findElement(CreateAccountLocators.enterAccountName).sendKeys("Dev1Account");
ScreenShots.getScreenShot(driver,"CreateAccount");
driver.findElement(CreateAccountLocators.clickOnSave).click();
Thread.sleep(5000);
driver.findElement(CreateAccountLocators.closeNewAccountWindow).click();
Thread.sleep(5000);
driver.navigate().refresh();
}
public static void viewAllRecentRecords() throws InterruptedException, IOException
{
driver.findElement(ViewAllRecentRecordsLocators.showNavigationMenu).click();
try
{
driver.findElement(ViewAllRecentRecordsLocators.homeNavigation).click();
}
catch (StaleElementReferenceException e)
{
driver.findElement(ViewAllRecentRecordsLocators.homeNavigation).click();
}
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(5000);
driver.findElement(ViewAllRecentRecordsLocators.viewAllRecentRecords).click();
ScreenShots.getScreenShot(driver,"ViewRecentRecords");
Thread.sleep(5000);
driver.findElement(ViewAllRecentRecordsLocators.closeRecentRecordsWindow).click();
driver.findElement(ViewAllRecentRecordsLocators.showNavigationMenu).click();
driver.findElement(ViewAllRecentRecordsLocators.selectAccountOption).click();
}
public static void editaddAccount() throws InterruptedException, IOException
{
driver.findElement(EditAddAccountLocators.clickOnAccountCheckBox).click();
Thread.sleep(5000);
driver.findElement(EditAddAccountLocators.openAccountEditDelete).click();
ScreenShots.getScreenShot(driver,"EditAddAccount");
driver.findElement(EditAddAccountLocators.clickOnEdit).click();
driver.findElement(EditAddAccountLocators.enterAccountName).clear();
driver.findElement(EditAddAccountLocators.enterAccountName).sendKeys("Dev2Account");
driver.findElement(EditAddAccountLocators.saveUpdate).click();
driver.findElement(EditAddAccountLocators.newAccountClick).click();
driver.findElement(EditAddAccountLocators.enterAccountName).sendKeys("Dev3Account");
driver.findElement(EditAddAccountLocators.clickOnSave).click();
driver.findElement(EditAddAccountLocators.closeUpdateAccountWindow1).click();
driver.findElement(EditAddAccountLocators.newAccountClick).click();
driver.findElement(EditAddAccountLocators.enterAccountName).sendKeys("Dev4Account");
driver.findElement(EditAddAccountLocators.clickOnSave).click();
driver.findElement(EditAddAccountLocators.closeUpdateAccountWindow2).click();
Thread.sleep(5000);
driver.navigate().refresh();
}
public static void viewUpdatedRecentRecords() throws InterruptedException, IOException
{
driver.findElement(ViewUpdatedRecentRecordsLocators.showNavigationMenu).click();
driver.findElement(ViewUpdatedRecentRecordsLocators.homeNavigation).click();
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(5000);
driver.findElement(ViewUpdatedRecentRecordsLocators.viewAllRecentRecords).click();
ScreenShots.getScreenShot(driver,"ViewUpdatedRecent");
Thread.sleep(5000);
driver.findElement(ViewUpdatedRecentRecordsLocators.closeRecentRecordsWindow).click();
}
public static void hoverOnAccountInRecentRecord() throws InterruptedException, IOException
{
WebElement element=driver.findElement(HoverAccountRecentRecordsLocators.hoverClickRecentRecord);
Thread.sleep(5000);
action=new Actions(driver);
action.moveToElement(element).build().perform();
ScreenShots.getScreenShot(driver,"HoverInRecent");
}
public static void clickOnAccountInRecentRecord() throws InterruptedException, IOException
{
driver.findElement(ClickAccountRecentRecordsLocators.hoverClickRecentRecord).click();
ScreenShots.getScreenShot(driver,"ClickInRecent");
driver.findElement(ClickAccountRecentRecordsLocators.createNewContact).click();
driver.findElement(ClickAccountRecentRecordsLocators.selectSalutation).click();
driver.findElement(ClickAccountRecentRecordsLocators.enterLastNameContact).sendKeys("Fahad");
driver.findElement(ClickAccountRecentRecordsLocators.clickOnSave).click();
driver.findElement(ClickAccountRecentRecordsLocators.detailTabContact).click();
driver.findElement(ClickAccountRecentRecordsLocators.editMobileContact).click();
driver.findElement(ClickAccountRecentRecordsLocators.enterMobileContact).sendKeys("9876543210");
driver.findElement(ClickAccountRecentRecordsLocators.clickOnSave).click();
Thread.sleep(5000);
driver.findElement(ClickAccountRecentRecordsLocators.closeUpdatedContactWindow).click();
Thread.sleep(5000);
driver.findElement(ClickAccountRecentRecordsLocators.quitUpdatedContactWindow).click();
}
public static void accountSearch() throws IOException
{
driver.findElement(AccountSearchLocators.showNavigationMenu).click();
driver.findElement(AccountSearchLocators.selectAccountOption).click();
WebElement search1= driver.findElement(AccountSearchLocators.AccountSearch);
search1.sendKeys("Dev2Account");
WebElement element=driver.findElement(AccountSearchLocators.enterPressEvent);
action=new Actions(driver);
action.doubleClick(element).build().perform();
ScreenShots.getScreenShot(driver,"AccountSearch");
search1.clear();
WebElement search2= driver.findElement(AccountSearchLocators.AccountSearch);
search2.sendKeys("Dev3Account");
action=new Actions(driver);
action.doubleClick(element).build().perform();
ScreenShots.getScreenShot(driver,"AccountSearch");
search2.clear();
driver.navigate().refresh();
}
public static void deleteAccountFeature() throws IOException
{
driver.findElement(DeleteAccountLocators.clickOnAccountCheckBox).click();
driver.findElement(DeleteAccountLocators.OpenAccountEditDelete).click();
driver.findElement(DeleteAccountLocators.deleteAccountContactButton1).click();
ScreenShots.getScreenShot(driver,"DeleteAccount");
driver.findElement(DeleteAccountLocators.DeleteAccountButton).click();
}
public static void navigateToContacts() throws IOException
{
driver.findElement(NavigateContactLocators.showNavigationMenu).click();
driver.findElement(NavigateContactLocators.clickOnContact).click();
ScreenShots.getScreenShot(driver,"NavigateContacts");
}
public static void createContact() throws InterruptedException, IOException
{
driver.navigate().refresh();
Thread.sleep(5000);
driver.findElement(CreateContactLocators.createNewContact).click();
driver.findElement(CreateContactLocators.selectSalutation).click();
driver.findElement(CreateContactLocators.enterLastNameContact).sendKeys("Firdous");
ScreenShots.getScreenShot(driver,"CreateContacts");
driver.findElement(CreateContactLocators.clickOnSave).click();
Thread.sleep(5000);
driver.findElement(CreateContactLocators.closeUpdatedContactWindow).click();
Thread.sleep(5000);
driver.navigate().refresh();
}
public static void listIntelligence() throws InterruptedException, IOException
{
Thread.sleep(5000);
driver.findElement(ListIntelligenceLocators.listView).click();
ScreenShots.getScreenShot(driver,"ListIntelligence");
Thread.sleep(5000);
driver.findElement(ListIntelligenceLocators.intelligenceView).click();
ScreenShots.getScreenShot(driver,"ListIntelligence");
}
public static void markContactClick() throws InterruptedException, IOException
{
Thread.sleep(5000);
driver.findElement(MarkContactLocators.markContact).click();
ScreenShots.getScreenShot(driver,"MarkContact");
Thread.sleep(5000);
driver.findElement(MarkContactLocators.markContact).click();
ScreenShots.getScreenShot(driver,"MarkContact");
}
public static void editContact() throws IOException
{
driver.findElement(EditContactLocators.editContact).click();
driver.findElement(EditContactLocators.clickOnEdit).click();
driver.findElement(EditContactLocators.editContactTitle).sendKeys("Test Title");
ScreenShots.getScreenShot(driver,"EditContact");
driver.findElement(EditContactLocators.clickOnSave).click();
}
public static void deleteContact() throws IOException
{
driver.findElement(DeleteContactLocators.editContact).click();
driver.findElement(DeleteContactLocators.deleteContact).click();
driver.findElement(DeleteContactLocators.deleteAccountContactButton).click();
ScreenShots.getScreenShot(driver,"DeleteContact");
}
public static void switchClassicView() throws InterruptedException, IOException
{
try
{
driver.findElement(SwitchToClassicViewLocators.logoutImage).click();
}
catch (StaleElementReferenceException e)
{
driver.findElement(SwitchToClassicViewLocators.logoutImage).click();
}
driver.findElement(SwitchToClassicViewLocators.switchToClassic).click();
ScreenShots.getScreenShot(driver, "SwitchClassicView");
}
public static void switchToLightView() throws InterruptedException,IOException
{
driver.findElement(SwitchToLightViewLocators.switchToLight).click();
ScreenShots.getScreenShot(driver, "SwitchLightView");
}
public static void getSalesForceLogout()throws InterruptedException,IOException
{
try
{
driver.findElement(LogoutLocators.logoutImage).click();
Thread.sleep(3000);
driver.findElement(LogoutLocators.logoutLink).click();
ScreenShots.getScreenShot(driver, "getSalesForceLogout");
}
catch (StaleElementReferenceException ex)
{
driver.findElement(LogoutLocators.logoutImage).click();
Thread.sleep(3000);
driver.findElement(LogoutLocators.logoutLink).click();
ScreenShots.getScreenShot(driver, "getSalesForceLogout");
}
}
}
