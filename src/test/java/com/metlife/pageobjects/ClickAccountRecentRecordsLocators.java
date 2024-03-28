package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class ClickAccountRecentRecordsLocators
{
    public static By hoverClickRecentRecord=By.xpath("//a[text()='FahadAccount5']");
    public static By createNewContact=By.xpath("//button[text()='New']");
    public static By selectSalutation=By.xpath("//button[@name='salutation']");
    public static By enterLastNameContact=By.xpath("//input[@name='lastName']");
    public static By clickOnSave=By.xpath("//button[text()='Save']");
    public static By detailTabContact=By.xpath("(//a[@id='detailTab__item'])[2]");
    public static By editMobileContact=By.xpath("//button[@title='Edit Mobile']");
    public static By enterMobileContact=By.xpath("//input[@name='MobilePhone']");
    public static By closeUpdatedContactWindow=By.xpath("//button[@title='Close Fahad | Contact']");
    public static By quitUpdatedContactWindow=By.xpath("//button[@title='Close FahadAccount5 | Account']");
}
