package com.chainpal.WebAppFunctions;


import com.chainpal.Utilities.BaseClass;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import com.chainpal.Utilities.PropertiesRead;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class ImportWalletFunctions extends BaseClass {

    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();

    public ImportWalletFunctions(WebDriver remoteDriver){
        webDriver = remoteDriver;
    }
    public void metaMaskConfig() throws IOException, InterruptedException {
        String AccessApp = propertiesRead.readProperties("clickOnAccessAppButton");

        /*MetaMask*/
        String startBtn = propertiesRead.readProperties("starteBtn");
        String btnAgree = propertiesRead.readProperties("btnAgree");
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
        String closeButton = propertiesRead.readProperties("btnMClose");


        Set<String> w = webDriver.getWindowHandles();
        /*--window handles iterate--*/
        Iterator<String> t = w.iterator();
        String ch = t.next();
        String pw = t.next();
        /*--switching child window--*/
        webDriver.switchTo().window(ch);
        /*--First time metamask configuration--*/
        webDriver.findElement(By.xpath(startBtn)).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(btnAgree)).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(importWallet)).click();
        Thread.sleep(1000);
//        webDriver.findElement(By.xpath(agreebtn)).click();
//        Thread.sleep(2000);
        webDriver.findElement(By.id(txt1)).sendKeys("civil");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt2)).sendKeys("proof");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt3)).sendKeys("visa");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt4)).sendKeys("sphere");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt5)).sendKeys("purity");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt6)).sendKeys("jelly");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt7)).sendKeys("battle");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt8)).sendKeys("hill");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt9)).sendKeys("frog");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt10)).sendKeys("display");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt11)).sendKeys("farm");
        Thread.sleep(1000);
        webDriver.findElement(By.id(txt12)).sendKeys("brand");
        Thread.sleep(1000);
        webDriver.findElement(By.id(metaNewPwd)).sendKeys(inputNewPwd);
        Thread.sleep(1000);
        webDriver.findElement(By.id(metaConPwd)).sendKeys(inputConPwd);
        Thread.sleep(1000);
        webDriver.findElement(By.id(metaCheckBox)).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(metaImpButton)).click();
        Thread.sleep(5000);
        webDriver.findElement(By.xpath(metaAllDoneButton)).click();
        Thread.sleep(5000);
        webDriver.findElement(By.xpath(closeButton)).click();
        Thread.sleep(2000);
        /*--END--*/
        /*--switching parent window--*/
        webDriver.switchTo().window(pw);
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(AccessApp)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on AccessApp Button", "User should be able to click on AccessApp Button.");
        Thread.sleep(1500);
//        webDriver.findElement(By.xpath(welcomeTxt)).sendKeys(welcomePwd);
//        Thread.sleep(1500);
//        webDriver.findElement(By.xpath(unlockBtn)).click();
//        Thread.sleep(1500);
        //--This is optional--//
        //        webDriver.findElement(By.xpath(metaNext)).click();
        //        Thread.sleep(2000);
        //        webDriver.findElement(By.xpath(metaRemind)).click();
        //        Thread.sleep(2000);
        //--END--//

    }


}
