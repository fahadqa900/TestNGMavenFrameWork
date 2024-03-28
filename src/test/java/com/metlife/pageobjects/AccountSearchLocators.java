package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class AccountSearchLocators
{
    public static By showNavigationMenu= By.xpath("//button[@title='Show Navigation Menu']");
    public static By selectAccountOption=By.xpath("//span[text()='Accounts']");
    public static By AccountSearch=By.xpath("//input[@name='Account-search-input']");
    public static By enterPressEvent=By.xpath("//div[@class='appName slds-context-bar__label-action slds-context-bar__app-name']");
}
