package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class CreateAccountLocators
{
    public static By newAccountClick=By.xpath("//a[@title='New']");
    public static By enterAccountName=By.xpath("//input[@name='Name']");
    public static By clickOnSave=By.xpath("//button[text()='Save']");
    public static By closeNewAccountWindow=By.xpath("//button[@title='Close Dev1Account | Account']");

}
