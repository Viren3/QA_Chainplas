package com.chainpal.WebAppFunctions;

import com.chainpal.Utilities.*;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import com.relevantcodes.extentreports.LogStatus;
import com.chainpal.PageData.LoginPageData;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import com.chainpal.Utilities.SwtichBrowserTab;
import com.chainpal.Utilities.NagativeMailList;
import com.chainpal.Utilities.WebLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;
import org.testng.Assert;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.html5.LocalStorage;

public class LoginPageFunctions extends BaseClass {

    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();
    TestBase testBase = new TestBase();


    public LoginPageFunctions(WebDriver remoteDriver) {
        webDriver = remoteDriver;
    }

    public void metaMaskConfig() throws IOException, InterruptedException {

        String userId = propertiesRead.readProperties("userId");
        String userPassword = propertiesRead.readProperties("userPassword");
        String textBoxEmailAddress = propertiesRead.readProperties("emailAddressTextBox");
        String textBoxPassword = propertiesRead.readProperties("enterPasswordTextBox");
        String AccessApp = propertiesRead.readProperties("clickOnAccessAppButton");
        String buttonSubmit = propertiesRead.readProperties("clickOnSubmit");

        /*MetaMask*/
        String startBtn = propertiesRead.readProperties("starteBtn");
        String importWallet = propertiesRead.readProperties("walletImport");
        String agreebtn = propertiesRead.readProperties("agree");
        String txt1 = propertiesRead.readProperties("txt1");
        String txt2 = propertiesRead.readProperties("txt2");
        String txt3 = propertiesRead.readProperties("txt3");
        String txt4 = propertiesRead.readProperties("txt4");
        String txt5 = propertiesRead.readProperties("txt5");
        String txt6 = propertiesRead.readProperties("txt6");
        String txt7 = propertiesRead.readProperties("txt7");
        String txt8 = propertiesRead.readProperties("txt8");
        String txt9 = propertiesRead.readProperties("txt9");
        String txt10 = propertiesRead.readProperties("txt10");
        String txt11 = propertiesRead.readProperties("txt11");
        String txt12 = propertiesRead.readProperties("txt12");

        String input1 = propertiesRead.readProperties("input1");
        String input2 = propertiesRead.readProperties("input2");
        String input3 = propertiesRead.readProperties("input3");
        String input4 = propertiesRead.readProperties("input4");
        String input5 = propertiesRead.readProperties("input5");
        String input6 = propertiesRead.readProperties("input6");
        String input7 = propertiesRead.readProperties("input7");
        String input8 = propertiesRead.readProperties("input8");
        String input9 = propertiesRead.readProperties("input9");
        String input10 = propertiesRead.readProperties("input10");
        String input11 = propertiesRead.readProperties("input11");
        String input12 = propertiesRead.readProperties("input12");
        String inputNewPwd = propertiesRead.readProperties("inputNewPwd");
        String inputConPwd = propertiesRead.readProperties("inputConPwd");

        String metaNewPwd = propertiesRead.readProperties("metaNewPwd");
        String metaConPwd = propertiesRead.readProperties("metaConPwd");
        String metaCheckBox = propertiesRead.readProperties("metaCheckBox");
        String metaImpButton = propertiesRead.readProperties("metaImpButton");
        String metaAllDoneButton = propertiesRead.readProperties("metaAllDone");

        String metaNext = propertiesRead.readProperties("metaNext");
        String metaRemind = propertiesRead.readProperties("metaRemind");
        String welcomeTxt = propertiesRead.readProperties("welcomeTxt");
        String unlockBtn = propertiesRead.readProperties("unlockBtn");
        String welcomePwd = propertiesRead.readProperties("welcomePwd");

//        swtichBrowserTab.switchTab();
//        Set<String> w = webDriver.getWindowHandles();
//        // window handles iterate
//        Iterator<String> t = w.iterator();
//        String ch = t.next();
//        String pw = t.next();
//        // switching child window
////        webDriver.switchTo().window(ch);
//        //close the child browser window
//         //webDriver.close();
//         webDriver.switchTo().window(pw);
//        // switching parent window
////      webDriver.switchTo().window(pw);
//        Thread.sleep(6000);
//        webDriver.findElement(By.xpath(AccessApp)).click();
//        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on AccessApp Button", "User should be able to click on AccessApp Button.");
//        Thread.sleep(1500);
//        webDriver.switchTo().window(ch);
//        Thread.sleep(1500);
//        //--First time metamask configuration--//
//            //        webDriver.findElement(By.xpath(startBtn)).click();
//            //        Thread.sleep(2000);
//            //        webDriver.findElement(By.xpath(importWallet)).click();
//            //        Thread.sleep(2000);
//            //        webDriver.findElement(By.xpath(agreebtn)).click();
//            //        Thread.sleep(2000);
//            //        webDriver.findElement(By.xpath(txt1)).sendKeys(input1);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt2)).sendKeys(input2);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt3)).sendKeys(input3);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt4)).sendKeys(input4);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt5)).sendKeys(input5);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt6)).sendKeys(input6);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt7)).sendKeys(input7);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt8)).sendKeys(input8);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt9)).sendKeys(input9);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt10)).sendKeys(input10);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt11)).sendKeys(input11);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(txt12)).sendKeys(input12);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(metaNewPwd)).sendKeys(inputNewPwd);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(metaConPwd)).sendKeys(inputConPwd);
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(metaCheckBox)).click();
//            //        Thread.sleep(1000);
//            //        webDriver.findElement(By.xpath(metaImpButton)).click();
//            //        Thread.sleep(2000);
//            //        webDriver.findElement(By.xpath(metaAllDoneButton)).click();
//            //        Thread.sleep(2000);
//        //--END--//
//
//        Thread.sleep(1500);
//        webDriver.findElement(By.xpath(welcomeTxt)).sendKeys(welcomePwd);
//        Thread.sleep(1500);
//        webDriver.findElement(By.xpath(unlockBtn)).click();
//        Thread.sleep(1500);
//        //--This is optional--//
//        //        webDriver.findElement(By.xpath(metaNext)).click();
//        //        Thread.sleep(2000);
//        //        webDriver.findElement(By.xpath(metaRemind)).click();
//        //        Thread.sleep(2000);
//        //--END--//
//        webDriver.close();
//        webDriver.switchTo().window(pw);
//        Thread.sleep(1500);
    }

    public void loginFunctionality() throws IOException, InterruptedException{
        String userId = propertiesRead.readProperties("userId");
        String userPassword = propertiesRead.readProperties("userPassword");
        String textBoxEmailAddress = propertiesRead.readProperties("emailAddressTextBox");
        String textBoxPassword = propertiesRead.readProperties("enterPasswordTextBox");
        String buttonSubmit = propertiesRead.readProperties("clickOnSubmit");
        String CreateAccount = propertiesRead.readProperties("clickOnCreateAccount");
        String LogoutBtn = propertiesRead.readProperties("signOutButton");
        String metaMaskPopup = propertiesRead.readProperties("metaMaskPopup");

        SwtichBrowserTab swtichBrowserTab = new SwtichBrowserTab(webDriver);
        NagativeMailList ng = new NagativeMailList(webDriver);
        Thread.sleep(1500);
        swtichBrowserTab.switchTab();
        Thread.sleep(1500);
        ng.mailFunction();
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys(userId);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on Email ID", "User should be able to entered on Register Email ID.");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(textBoxPassword)).sendKeys(userPassword);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on Password", "User should be able to entered on Valid Password.");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(buttonSubmit)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Login Button", "User should be able to click on Login Button.");
        Thread.sleep(3000);
        /*using local storage for wallet popup*/
        WebStorage webStorage = (WebStorage) new Augmenter().augment(webDriver);
        LocalStorage localStorage = webStorage.getLocalStorage();
        String item  =  localStorage.getItem("WEB3_CONNECT_CACHED_PROVIDER");
//        System.out.println("item:-" + item);
        if(item != null){
            item  = item.replaceAll("\"","");
            System.out.println(item.equals("injected"));
        }
        System.out.println(item ==null);
       if (item == null || !item.equals("injected")){
           webDriver.findElement(By.xpath(metaMaskPopup)).click();
           Thread.sleep(1000);
       }
    }

    public void logoutFunctionality() throws IOException, InterruptedException {
        String LogoutBtn = propertiesRead.readProperties("signOutButton");
        JavascriptExecutor jsDown = (JavascriptExecutor) webDriver;
        jsDown.executeScript("window.scrollBy(0,500)", "");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on ScollDown Icon", "User should be able to click on ScollDown.");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(LogoutBtn)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Logout Button", "User should be able to click on Logout Button.");
        Thread.sleep(1500);
    }

}