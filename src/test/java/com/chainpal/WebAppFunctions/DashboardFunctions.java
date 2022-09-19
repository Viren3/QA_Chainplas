package com.chainpal.WebAppFunctions;

import com.chainpal.Utilities.BaseClass;
import com.chainpal.Utilities.PropertiesRead;
import com.chainpal.Utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class DashboardFunctions extends BaseClass {
    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();

    public DashboardFunctions(WebDriver remoteDriver){webDriver = remoteDriver;}

    public void dashaboardFunction() throws InterruptedException, IOException {
        String buyNowBtn = propertiesRead.readProperties("btnBuynow");
        String creatTxnBtn = propertiesRead.readProperties("btnCreateTransaction");
        String urlCopyLink = propertiesRead.readProperties("urlCopylink");
        String scrollDown = propertiesRead.readProperties("dashboardScoll");
        //Positive Scenarios
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,150)", "");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(buyNowBtn)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Buy Now button", "User should be able to click on Buy Now button.");
        Thread.sleep(1500);
        webDriver.navigate().back();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Back icon in Browser ", "User should be able to click on Back icon.");
        Thread.sleep(1500);
        JavascriptExecutor jsDown = (JavascriptExecutor) webDriver;
        jsDown.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(creatTxnBtn)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Buy Create Transaction button", "User should be able to click on Create Transaction button.");
        Thread.sleep(1500);
        webDriver.navigate().back();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Back icon in Browser ", "User should be able to click on Back icon.");
        Thread.sleep(1500);
        JavascriptExecutor jsUp = (JavascriptExecutor) webDriver;
        jsUp.executeScript("window.scrollBy(0,-250)","");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(urlCopyLink)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Copy Icon", "User should be able to click on Copy Icon and Link should be copy.");
        Thread.sleep(1500);
    }

    public void sildMenuFunction() throws InterruptedException,IOException{
        String sBtnRedeemToken = propertiesRead.readProperties("sBtnRedeemToken");
        String sBtnTtHistory = propertiesRead.readProperties("sBtnTtHistory");
        String sBtnMyTransactions = propertiesRead.readProperties("sBtnMyTransactions");
        String sBtnMydisput = propertiesRead.readProperties("sBtnMydisput");
        String sBtnReferral = propertiesRead.readProperties("sBtnReferral");
        String sBtnTransactoinRR = propertiesRead.readProperties("sBtnTransactoinRR");
        String sBtnEditProfile = propertiesRead.readProperties("sBtnEditProfile");
        String sBtnNotification = propertiesRead.readProperties("sBtnNotification");
        String sBtnWcb = propertiesRead.readProperties("sBtnWcb");
        String sideArrow = propertiesRead.readProperties("sideArrow");
        String topNotificationIcon = propertiesRead.readProperties("topNotificationIcon");

        Thread.sleep(1500);
        webDriver.findElement(By.xpath(sBtnRedeemToken)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Redeem Option", "User should be able to click on Redeem Option.");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(sBtnTtHistory)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Token Transactions History Option", "User should be able to click on Token Transactions History Option.");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(sBtnMyTransactions)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on My Transaction Option", "User should be able to click on My Transaction Option.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(sBtnMydisput)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on My Dispute  Option", "User should be able to click on My Dispute Option.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(sBtnReferral)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Referral Option", "User should be able to click on My Referral Option.");
        Thread.sleep(100);
        JavascriptExecutor jsDown = (JavascriptExecutor) webDriver;
        jsDown.executeScript("window.scrollBy(0,400)", "");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Scroll Down", "User should be able to Scroll Down.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(sBtnTransactoinRR)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Transaction Referral Rewards Option", "User should be able to click on Transaction Referral Rewards Option.");
        Thread.sleep(1000);
        JavascriptExecutor jsDown1 = (JavascriptExecutor) webDriver;
        jsDown1.executeScript("window.scrollBy(0,400)", "");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Scroll Down", "User should be able to Scroll Down.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(sBtnEditProfile)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Edit Profile Option", "User should be able to click on Edit Profile Option.");
        Thread.sleep(1000);
        JavascriptExecutor jsDown2 = (JavascriptExecutor) webDriver;
        jsDown2.executeScript("window.scrollBy(0,400)", "");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Scroll Down", "User should be able to Scroll Down.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(sBtnNotification)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Notification Option", "User should be able to click on Notification Option.");
        Thread.sleep(1000);
        JavascriptExecutor jsDown3 = (JavascriptExecutor) webDriver;
        jsDown3.executeScript("window.scrollBy(0,400)", "");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Scroll Down", "User should be able to Scroll Down.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(sBtnWcb)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on What is Chainpals Beta? Option", "User should be able to click on What is Chainpals Beta? Option.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(sideArrow)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on close Navbar icon", "User should be able to click on close Navbar icon.");
        Thread.sleep(2500);
        webDriver.findElement(By.xpath(topNotificationIcon)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Notification Bell icon", "User should be able to click on Notification Bell icon.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(sideArrow)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on close Navbar icon", "User should be able to click on close Navbar icon.");
        Thread.sleep(1000);
    }
}
