package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class DeleteContactLocators
{
    public static By editContact=By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']");
    public static By deleteContact=By.xpath("//a[@title='Delete']");
    public static By deleteAccountContactButton=By.xpath("//span[text()='Delete']");
}
