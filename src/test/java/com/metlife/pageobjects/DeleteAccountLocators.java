package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class DeleteAccountLocators
{
    public static By clickOnAccountCheckBox=By.xpath("(//div[@class='slds-grid slds-grid--align-spread slds-align_absolute-center checkbox-container slds-checkbox uiInput forceVirtualCheckbox uiInput--default'])[3]");
    public static By OpenAccountEditDelete=By.xpath("(//a[@href='javascript:void(0);'])[14]");
    public static By deleteAccountContactButton1=By.xpath("//a[@title='Delete']");
    public static By DeleteAccountButton=By.xpath("//button[@title='Delete']");

}
