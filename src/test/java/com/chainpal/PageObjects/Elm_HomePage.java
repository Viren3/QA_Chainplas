package com.chainpal.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elm_HomePage {
    WebDriver localDriver;

    public Elm_HomePage(WebDriver remoteDriver){
        localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver,this);
    }

    @FindBy(xpath ="//div[contains(text(),'CREATE TRANSACTION')]")
    WebElement btnCreateTxn;

    @FindBy(xpath = "//button[@class='button-large button-outlined button-primary button-rounded']")
    WebElement btnLightPaper;

    @FindBy(xpath = "//a[normalize-space()='View Chainpals Smart Contract']")
    WebElement linkSmartContract;
}
