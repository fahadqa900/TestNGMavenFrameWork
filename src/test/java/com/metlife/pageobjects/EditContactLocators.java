package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class EditContactLocators
{
    public static By editContact=By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']");
    public static By clickOnEdit=By.xpath("//a[@title='Edit']");
    public static By editContactTitle=By.xpath("//input[@name='Title']");
    public static By clickOnSave=By.xpath("//button[text()='Save']");
}
