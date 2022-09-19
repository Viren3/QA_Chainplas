package com.chainpal.WebAppFunctions;
import com.chainpal.Utilities.BaseClass;
import com.chainpal.Utilities.PropertiesRead;
import com.chainpal.Utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import org.openqa.selenium.*;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import static com.chainpal.Utilities.BaseClass.webDriver;

public class MyTransactionFunctions extends BaseClass {
    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();

    public MyTransactionFunctions(WebDriver remoteDriver) {
        webDriver = remoteDriver;
    }

    public void mytransactionFunction() throws InterruptedException, IOException {
        String sBtnMyTransactions = propertiesRead.readProperties("sBtnMyTransactions");
        String btnCreateTran = propertiesRead.readProperties("btnCreateTran");
        String selectSender = propertiesRead.readProperties("selectSender");
        String inputEmail = propertiesRead.readProperties("inputEmail");
        String selectService = propertiesRead.readProperties("selectService");
        String addUrl = propertiesRead.readProperties("addUrl");
        String iconDropdown = propertiesRead.readProperties("iconDropdown");
        String selectProduct = propertiesRead.readProperties("selectProduct");
        String btnNext = propertiesRead.readProperties("btnNext");


        JavascriptExecutor jsDown = (JavascriptExecutor) webDriver;
        jsDown.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(sBtnMyTransactions)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on My Transaction Option", "User should be able to Click on My Transaction Option.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(btnCreateTran)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Create Transaction Button", "User should be able to Click on Create Transaction Button.");
        Thread.sleep(1000);
        /*------------------------------*/

        webDriver.findElement(By.xpath(selectSender)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select on sender option", "User should be able to Select on sender option.");
        Thread.sleep(1000);

        if(webDriver.findElement(By.id(inputEmail)).isDisplayed()){
            webDriver.findElement(By.id(inputEmail)).clear();
            ExtentTestManager.getTest().log(LogStatus.PASS, "Clear email ID", "User should be able to Clear email ID.");
//conditions
        }
        else {
            webDriver.findElement(By.id(inputEmail)).sendKeys("viren.chauhan@adrixus.com");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Enter email ID", "User should be able to Enter email ID.");
//conditions
        }

        webDriver.findElement(By.id(inputEmail)).sendKeys("viren.chauhan@adrixus.com");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter email ID", "User should be able to Enter email ID.");
        Thread.sleep(1500);
        JavascriptExecutor jsDown1 = (JavascriptExecutor) webDriver;
        jsDown1.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(iconDropdown)).click();
        Thread.sleep(1500);
//        webDriver.findElement(By.xpath(selectProduct)).click();
//        Select psDropDown = new Select(webDriver.findElement(By.xpath(selectService)));
//        psDropDown.selectByValue("Service");
        webDriver.findElement(By.xpath(selectService)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Service from the Drop Down", "User should be able to Select Service from the Drop Down.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(addUrl)).sendKeys("dev.chaipals.io");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter URL", "User should be able to Enter URL.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//span[@class='slider round']")).click();
        Thread.sleep(1000);
        WebElement test = new WebDriverWait(webDriver, Duration.ofSeconds(60)).until(webDriver1 -> webDriver.findElement(By.xpath(btnNext)));
        test.click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on the Next Button", "User should be able to Click on the Next Button.");
        Thread.sleep(1000);

//        webDriver.findElement(By.xpath(btnNext)).click();
//        Thread.sleep(1000);
        /*------------------------------*/
    }

    public void transactionInformation() throws InterruptedException, IOException {
        String inputTitle = propertiesRead.readProperties("inputTitle");
        String inputDescription = propertiesRead.readProperties("inputDescription");
        String inputTerm = propertiesRead.readProperties("inputTerm");
        String clickOnDropDown = propertiesRead.readProperties("clickOnDropDown");
        String inputTranAmount = propertiesRead.readProperties("inputTranAmount");
        String selectUSDT = propertiesRead.readProperties("selectUSDT");
        String btnStartTxn = propertiesRead.readProperties("btnStartTxn");
        String btnUpload = propertiesRead.readProperties("btnUpload");
        String btnMConfirm = propertiesRead.readProperties("btnMConfirm");
        String clickOnData = propertiesRead.readProperties("clickOnData");
        String clickOnDetails = propertiesRead.readProperties("clickOnDetails");
        String btnApprove = propertiesRead.readProperties("btnApprove");
        String btnDoItLater = propertiesRead.readProperties("btnDoItLater");
        String btnEditTxn = propertiesRead.readProperties("btnEditTxn");
        String btnMakePay = propertiesRead.readProperties("btnMakePay");
        String btnCancelTxn = propertiesRead.readProperties("btnCancelTxn");
        String btnOk = propertiesRead.readProperties("btnOk");
        String btnComPay = propertiesRead.readProperties("btnComPay");
        String btnCompletPayment = propertiesRead.readProperties("btnCompletPayment");
        String btnMfConfirm = propertiesRead.readProperties("btnMfConfirm");
        String btnShowTxn = propertiesRead.readProperties("btnShowTxn");


        webDriver.findElement(By.xpath(inputTitle)).sendKeys("6.6 Transaction");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Transaction Title", "User should be able to Enter Transaction Title.");
        Thread.sleep(200);
        webDriver.findElement(By.id(inputDescription)).sendKeys("Test");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description Details", "User should be able to Enter Description Details.");
        Thread.sleep(200);
        webDriver.findElement(By.id(inputTerm)).sendKeys("Test 123");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Terms & Condition", "User should be able to Enter Terms & Condition Details.");
        Thread.sleep(200);
//        webDriver.findElement(By.xpath(clickOnDropDown)).click();
//        webDriver.findElement(By.xpath(selectUSDT)).click();
        webDriver.findElement(By.id(inputTranAmount)).sendKeys("1004");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Transaction Amount", "User should be able to Enter Transaction Amount.");
        Thread.sleep(200);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(1000);
        WebElement slider = webDriver.findElement(By.xpath("//span[@aria-label='ngx-slider']"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the day for Lock-up Period", "User should be able to Select the day for Lock-up Period.");
        Thread.sleep(1000);
        Actions actions = new Actions(webDriver);
        Thread.sleep(1000);
        actions.dragAndDropBy(slider,-200, 0).release().build().perform();
        Thread.sleep(1000);
        slider.click();
//        webDriver.findElement(By.xpath(btnUpload)).click();
//        webDriver.findElement(By.xpath(btnUpload)).sendKeys("/Users/Viren/Work/Automation/old_chainpal_automation/Data/sample.pdf");
        Thread.sleep(2000);
        TestBase testBase = new TestBase();
        testBase.expWait(btnStartTxn);
        webDriver.findElement(By.xpath(btnStartTxn)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Start Transaction Button Option", "User should be able to click on Start Transaction Button.");
        Thread.sleep(10000);
        Set<String> meta_windows = webDriver.getWindowHandles();
        System.out.println("=> The total Meta windows opened is/are : "+meta_windows.size());
        /* window handles iterate */
        Set<String> Fst_windows = webDriver.getWindowHandles();
        System.out.println("=> Open Metamask windows first time and window opened is/are : "+Fst_windows.size());
        Set<String> w = webDriver.getWindowHandles();
        Thread.sleep(10000);
        Iterator<String> t = w.iterator();
        Thread.sleep(500);
        String ch = t.next();
        Thread.sleep(500);
        String pw = t.next();
        Thread.sleep(500);
        webDriver.switchTo().window(pw);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Switch to Prent page", "Switch to Prent page.");
        Thread.sleep(500);
        webDriver.findElement(By.xpath(clickOnData)).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath(clickOnDetails)).click();
        Thread.sleep(500);
        JavascriptExecutor jsm = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        jsm.executeScript("window.scrollBy(0,500)");
//        Thread.sleep(1000);
//        WebElement Element = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div[1]"));
        WebElement Element = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div[2]/div"));
        Thread.sleep(5000);
        jsm.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(3000);
        webDriver.findElement(By.xpath(btnMConfirm)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Confirm Button from the Metamask", "User should be able to click on Confirm Button.");
        Thread.sleep(5000);
        webDriver.switchTo().window(ch);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Switch to child page", "Switch to child page.");
        Thread.sleep(25000);
//        webDriver.findElement(By.xpath(btnCompletPayment)).click();
//        Thread.sleep(5000);
//        JavascriptExecutor j = (JavascriptExecutor) webDriver;
//        j.executeScript("window.scrollBy(0,2500)");
//        Thread.sleep(3000);
//        webDriver.findElement(By.xpath(btnDoItLater)).click();
//        Thread.sleep(2500);
//        JavascriptExecutor j1 = (JavascriptExecutor) webDriver;
//        j1.executeScript("window.scrollBy(0,700)");
//        Thread.sleep(3000);
//        webDriver.findElement(By.xpath(btnMakePay)).click();
//        Thread.sleep(3000);
//        JavascriptExecutor jsm1 = (JavascriptExecutor) webDriver;
//        jsm1.executeScript("window.scrollBy(0,700)");
//        Thread.sleep(20000);
//        testBase.expWait(btnApprove);

//        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(6000));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(btnApprove)));
//        element.click();
//

        webDriver.findElement(By.xpath(btnApprove)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Approve Button", "User should be able to click on Approve Button.");
        Thread.sleep(10000);
        Set<String> SecT_windows = webDriver.getWindowHandles();
        System.out.println("=> Open Metamask windows second time and window opened is/are : "+SecT_windows.size());
        /* window handles iterate */
        Set<String> ws = webDriver.getWindowHandles();
        Thread.sleep(10000);
        Iterator<String> v = ws.iterator();
        Thread.sleep(1000);
        String chi = v.next();
        Thread.sleep(1000);
        String pew = v.next();
        Thread.sleep(1000);
        webDriver.switchTo().window(pew);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Switch to Prent page", "Switch to Prent page.");
        Thread.sleep(1000);
        JavascriptExecutor jsm3 = (JavascriptExecutor) webDriver;
        Thread.sleep(3000);
        jsm3.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(3000);
        WebElement Element1 = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div[7]/div[2]/div"));
        Thread.sleep(3000);
        jsm.executeScript("arguments[0].scrollIntoView();", Element1);
        Thread.sleep(5000);
        webDriver.findElement(By.xpath(btnMfConfirm)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Confirm Button from the Metamask", "User should be able to click on Confirm Button.");
        Thread.sleep(5000);
        webDriver.switchTo().window(chi);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Switch to child page", "Switch to child page.");
        Thread.sleep(5000);
        testBase.expWait(btnComPay);
        webDriver.findElement(By.xpath(btnComPay)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Complete Payment Button", "User should be able to click on Complete Payment Button.");
        Thread.sleep(20000);
        Set<String> ThrT_windows = webDriver.getWindowHandles();
        System.out.println("=> Open Metamask windows Third time and window opened is/are : "+ThrT_windows.size());
        /* window handles iterate */ /* Complete Payment */
        Set<String> w2 = webDriver.getWindowHandles();
        Iterator<String> t2 = w2.iterator();
        Thread.sleep(10000);
        String ch2 = t2.next();
        Thread.sleep(1000);
        String pw2 = t2.next();
        Thread.sleep(1000);
        webDriver.switchTo().window(pw2);
        Thread.sleep(1000);
        JavascriptExecutor jsm4 = (JavascriptExecutor) webDriver;
        Thread.sleep(3000);
        jsm4.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(3000);
        WebElement Element2 = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div[2]"));
        Thread.sleep(3000);
        jsm.executeScript("arguments[0].scrollIntoView();", Element2);
        Thread.sleep(3000);
        webDriver.findElement(By.xpath(btnMConfirm)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Confirm Button from the Metamask", "User should be able to click on Confirm Button.");
        Thread.sleep(5000);
        webDriver.switchTo().window(ch2);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Switch to child page", "Switch to child page.");
        Thread.sleep(5000);
        webDriver.findElement(By.xpath(btnOk)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Ok Button", "User should be able to click on Ok Button.");
        Thread.sleep(5000);
        webDriver.findElement(By.xpath(btnShowTxn)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Show Transaction Button", "User should be able to click on Show Transaction Button.");
        Thread.sleep(5000);


    }
}
