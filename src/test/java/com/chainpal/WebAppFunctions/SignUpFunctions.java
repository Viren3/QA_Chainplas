package com.chainpal.WebAppFunctions;

import com.chainpal.Utilities.BaseClass;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import com.chainpal.Utilities.NagativeMailList;
import com.chainpal.Utilities.PropertiesRead;
import com.chainpal.Utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.Select;
import com.chainpal.Utilities.NagativeMailList;

import java.util.Iterator;
import java.util.Set;

public class SignUpFunctions extends BaseClass {
    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();
    TestBase testBase = new TestBase();
    public SignUpFunctions(WebDriver remoteDriver){ webDriver = remoteDriver;}

    public void signupFunction() throws  InterruptedException, IOException{
        String AccessApp = propertiesRead.readProperties("clickOnAccessAppButton");
        String CreateAccount = propertiesRead.readProperties("clickCreateAccount");
        String FirstName = propertiesRead.readProperties("fName");
        String LastName = propertiesRead.readProperties("lName");
        String UserName = propertiesRead.readProperties("uName");
        String ConfirmPwd = propertiesRead.readProperties("confirmPwd");
        String ReferralCode = propertiesRead.readProperties("referralCode");
        String textBoxEmailAddress = propertiesRead.readProperties("emailAddressTextBox");
        String textBoxPassword = propertiesRead.readProperties("enterPasswordTextBox");
        String clickOnMetaWalletBtn = propertiesRead.readProperties("clickOnMetaWalletBtn");
        String clickOnMetaPopup = propertiesRead.readProperties("clickOnMetaPopup");
        String txtReferralCode = propertiesRead.readProperties("txtReferralCode");
        String userPassword = propertiesRead.readProperties("userPassword");
        String confirmPassword = propertiesRead.readProperties("confirmPassword");
        String welcomeTxt = propertiesRead.readProperties("welcomeTxt");
        String unlockBtn = propertiesRead.readProperties("unlockBtn");
        String welcomePwd = propertiesRead.readProperties("welcomePwd");
        String clickOnIcon = propertiesRead.readProperties("clickOnIcon");
        String clickOnCreateAccount = propertiesRead.readProperties("clickOnCreateAccount");
        String inputAccount = propertiesRead.readProperties("inputAccount");
        String btnCreate = propertiesRead.readProperties("btnCreate");
        String btnSupCreateAc = propertiesRead.readProperties("btnSupCreateAc");
        String clickOnDropSignup = propertiesRead.readProperties("clickOnDropSignup");
        String selectDropValue = propertiesRead.readProperties("selectDropValue");
        String btnWalletConnect = propertiesRead.readProperties("btnWalletConnect");
        String inputWalletPwd = propertiesRead.readProperties("inputWalletPwd");
        String btnUnlock = propertiesRead.readProperties("btnUnlock");
        String metaMaskPopup = propertiesRead.readProperties("metaMaskPopup");

        String clickOnNewAc = propertiesRead.readProperties("clickOnNewAc");
        String inputWalltName = propertiesRead.readProperties("inputWalltName");
        String btnNcancel = propertiesRead.readProperties("btnNcancel");
        String btnNacSave = propertiesRead.readProperties("btnNacSave");
        String btnMnext = propertiesRead.readProperties("btnMnext");
        String btnConnect = propertiesRead.readProperties("btnConnect");

        NagativeMailList ng = new NagativeMailList(webDriver);
        Set<String> w = webDriver.getWindowHandles();
        // window handles iterate
        Iterator<String> t = w.iterator();
        String ch = t.next();
        String pw = t.next();
        // switching child window
        Set<String> ThrT_windows = webDriver.getWindowHandles();
        System.out.println("=> Open Metamask windows Third time and window opened is/are : "+ThrT_windows.size());
        webDriver.switchTo().window(pw);
        Thread.sleep(10000);
        webDriver.findElement(By.xpath(AccessApp)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Access App Button", "User should be able to click on AccessApp Button.");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(CreateAccount)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Create Account Button", "User should be able to click on Create Account Button.");
        Thread.sleep(1000);
        webDriver.switchTo().window(ch);
        Thread.sleep(1500);
//        webDriver.findElement(By.xpath(welcomeTxt)).sendKeys(welcomePwd);
//        Thread.sleep(1500);
//        webDriver.findElement(By.xpath(unlockBtn)).click();
//        Thread.sleep(5000);
//        webDriver.findElement(By.xpath(clickOnIcon)).click();
//        Thread.sleep(3000);
//        webDriver.findElement(By.xpath(clickOnCreateAccount)).click();
//        Thread.sleep(3000);
//        webDriver.findElement(By.xpath(inputAccount)).sendKeys("M_Wallet-9");
//        Thread.sleep(3000);
//        webDriver.findElement(By.xpath(btnCreate)).click();
//        Thread.sleep(3000);
        webDriver.close();
        Thread.sleep(3000);
        Set<String> windows = webDriver.getWindowHandles();
        System.out.println("=> Open Metamask windows Third time and window opened is/are : "+windows.size());
        webDriver.switchTo().window(pw);
        Thread.sleep(1000);
//        webDriver.findElement(By.xpath(clickOnMetaWalletBtn)).click();

//        webDriver.findElement(By.xpath(clickOnMetaPopup)).click();
//        Thread.sleep(1000);
        WebStorage webStorage = (WebStorage) new Augmenter().augment(webDriver);
        LocalStorage localStorage = webStorage.getLocalStorage();
        String item  =  localStorage.getItem("users");
        System.out.println("item:-" + item);
        webStorage.getLocalStorage().clear();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(btnWalletConnect)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Wallet Connect Button", "User should be able to Wallet Connect Button.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(metaMaskPopup)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Meta Mask Wallet", "User should be able to open Meta Mask Wallet Connect Button.");
        Thread.sleep(2000);
        Set<String> m = webDriver.getWindowHandles();
        // window handles iterate
        Iterator<String> t1 = m.iterator();
        String ch1 = t1.next();
        String pw1 = t1.next();
        // switching child window
        Set<String> windowsM = webDriver.getWindowHandles();
        System.out.println("=> Open Metamask windows Third time and window opened is/are : "+windowsM.size());
        webDriver.switchTo().window(pw1);
        Thread.sleep(2000);
        webDriver.findElement(By.id(inputWalletPwd)).sendKeys("Test@123");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter the Metamask wallet password", "User should be able to enter Metamask wallet password.");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath(btnUnlock)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Unlock Button from the Metamask", "User should be able to click on the Unlock Button.");
        Thread.sleep(10000);
        webDriver.findElement(By.xpath(clickOnNewAc)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on New Account from the Metamask", "User should be able to click on the New Account option.");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath(inputWalltName)).clear();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Clear default account name from the Metamask", "User should be able to Clear default account name.");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath(inputWalltName)).sendKeys("New_Wallet-6");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter the New Wallet name from the Metamask", "User should be able to Enter the New Wallet name.");
        Thread.sleep(5000);
//        webDriver.findElement(By.xpath(btnNcancel)).click();
        webDriver.findElement(By.xpath(btnNacSave)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save Button from the Metamask", "User should be able to Click on the Save Button.");
        Thread.sleep(7000);
        webDriver.findElement(By.xpath(btnMnext)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Next Button from the Metamask", "User should be able to Click on the Next Button.");
        Thread.sleep(7000);
        webDriver.findElement(By.xpath(btnConnect)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Connect Button from the Metamask", "User should be able to Click on the Connect Button.");
        Thread.sleep(7000);
        webDriver.switchTo().window(ch1);
        Thread.sleep(5000);
        webDriver.findElement(By.xpath(FirstName)).sendKeys("Automation");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on First Name", "User should be able to entered on First Name.");

        webDriver.findElement(By.xpath(LastName)).sendKeys("Demo");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on First Name", "User should be able to entered on Last Name.");

        webDriver.findElement(By.xpath(UserName)).sendKeys("AutoDemo");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on User Name", "User should be able to entered on User Name.");

        webDriver.findElement(By.id(clickOnDropSignup)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Country Drop Down", "User should be able to click on the Country Drop Down.");

        webDriver.findElement(By.xpath(selectDropValue)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Country from the Country Drop Down", "User should be able to Select Country from the Country Drop Down.");
        ng.mailFunction();
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("autodemo@yopmail.com");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on Email ID", "User should be able to entered on Register Email ID.");

        webDriver.findElement(By.xpath(textBoxPassword)).sendKeys(userPassword);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on Password", "User should be able to entered on Valid Password.");

        webDriver.findElement(By.xpath(ConfirmPwd)).sendKeys(confirmPassword);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on Confirm Password", "User should be able to entered on Confirm Password.");
        Thread.sleep(500);
        webDriver.findElement(By.xpath(btnSupCreateAc)).submit();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Create Account", "User should be able to Click on Create Account.");
        Thread.sleep(500);


    }
}
