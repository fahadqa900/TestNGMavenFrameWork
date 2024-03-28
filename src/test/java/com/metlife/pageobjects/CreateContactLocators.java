package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class CreateContactLocators
{
    public static By createNewContact=By.xpath("//button[text()='New']");
    public static By selectSalutation=By.xpath("//button[@name='salutation']");
    public static By enterLastNameContact=By.xpath("//input[@name='lastName']");
    public static By clickOnSave=By.xpath("//button[text()='Save']");
    public static By closeUpdatedContactWindow=By.xpath("//button[@title='Close Firdous | Contact']");

}
