package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class EditAddAccountLocators
{
    public static By clickOnAccountCheckBox=By.xpath("(//div[@class='slds-grid slds-grid--align-spread slds-align_absolute-center checkbox-container slds-checkbox uiInput forceVirtualCheckbox uiInput--default'])[1]");
    public static By openAccountEditDelete=By.xpath("(//a[@href='javascript:void(0);'])[12]");
    public static By clickOnEdit=By.xpath("//a[@title='Edit']");
    public static By enterAccountName=By.xpath("//input[@name='Name']");
    public static By saveUpdate=By.xpath("//button[@name='SaveEdit']");
    public static By newAccountClick=By.xpath("//a[@title='New']");
    public static By clickOnSave=By.xpath("//button[text()='Save']");
    public static By closeUpdateAccountWindow1=By.xpath("//button[@title='Close Dev3Account | Account']");
    public static By closeUpdateAccountWindow2=By.xpath("//button[@title='Close Dev4Account | Account']");

}
