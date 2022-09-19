package com.chainpal.WebAppFunctions;

import com.chainpal.Utilities.BaseClass;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import com.chainpal.Utilities.PropertiesRead;
import com.chainpal.Utilities.SwtichBrowserTab;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class ForgotFunctions extends BaseClass{
    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();

    public  ForgotFunctions(WebDriver remoteDriver) {webDriver = remoteDriver;}

    public void forgotFunction() throws InterruptedException, IOException{
        String resetlink = propertiesRead.readProperties("link");
        String email = propertiesRead.readProperties("emailInput");
        String btnReset = propertiesRead.readProperties("btnReset");

        SwtichBrowserTab swtichBrowserTab = new SwtichBrowserTab(webDriver);
        Thread.sleep(1500);
        swtichBrowserTab.switchTab();
        Thread.sleep(4000);
        webDriver.findElement(By.xpath(resetlink)).click();
        Thread.sleep(1500);
        /*Nagative Mail*/
        webDriver.findElement(By.xpath(email)).sendKeys("plaintextaddress");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "plaintextaddress");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("@#@@##@%^%#$@#$@#.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "@#@@##@%^%#$@#$@#.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("example.email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example.email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("example@example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys(".example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", ".example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("example.@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example.@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("example…example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example…example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("おえあいう@example.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "おえあいう@example.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("example@email");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@email");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("example@-email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@-email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("example@email.web");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@email.web");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("example@111.222.333.44444");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@111.222.333.44444");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("CAT…123@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "CAT…123@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("”(),:;<>[\\]@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "”(),:;<>[\\]@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("obviously”not”correct@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "obviously”not”correct@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("example\\ is”especially”not\\allowed@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example\\ is”especially”not\\allowed@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, ");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "254 Characters");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(email)).clear();
        /*Finished*/
        webDriver.findElement(By.xpath(email)).sendKeys("viren.chauhan@adrixus.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Enter the valid Email ID", "User should be able to enter Email ID.");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(btnReset)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Rest Password Button", "User should be clickable on Rest Password Button.");
    }

    public void restpassowd() throws  InterruptedException, IOException{
        String inputPwd = propertiesRead.readProperties("inputPwd");
        String inputRConPwd = propertiesRead.readProperties("inputRConPwd");
        String btnResetPwd = propertiesRead.readProperties("btnResetPwd");
        String iconPwdVisible1 = propertiesRead.readProperties("iconPwdVisible1");
        String iconPwdVisible2 = propertiesRead.readProperties("iconPwdVisible2");
        String toastId = propertiesRead.readProperties("toastId");

        webDriver.get("https://dev.chainpals.io/reset-password?token=eyJzZWNyZXQiOiJhZTMxMTFjMTMyMzViZGQ0IiwiZXhwaXJ5RGF0ZSI6IjIwMjItMDgtMjlUMTU6MjA6MzAuMTM0WiIsImRhdGEiOiJ2aXJlbi5jaGF1aGFuQGFkcml4dXMuY29tIn0%3D");



        webDriver.findElement(By.id(inputPwd)).sendKeys("Test");
        webDriver.findElement(By.id(inputRConPwd)).sendKeys("test");

        webDriver.findElement(By.id(inputPwd)).clear();
        webDriver.findElement(By.id(inputPwd)).sendKeys("1234");
        webDriver.findElement(By.id(inputRConPwd)).clear();
        webDriver.findElement(By.id(inputRConPwd)).sendKeys("1234");
        webDriver.findElement(By.xpath(btnResetPwd)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Reset My Password Button", "Message should be displayed Unable to reset password, try again.");
        webDriver.findElement(By.id(inputPwd)).clear();
        webDriver.findElement(By.id(inputPwd)).sendKeys("test$");
        webDriver.findElement(By.id(inputRConPwd)).clear();
        webDriver.findElement(By.id(inputRConPwd)).sendKeys("test$");
        webDriver.findElement(By.xpath(btnResetPwd)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Reset My Password Button", "Message should be displayed Unable to reset password, try again.");
        webDriver.findElement(By.id(inputPwd)).clear();
        webDriver.findElement(By.id(inputPwd)).sendKeys("Test@123");
        webDriver.findElement(By.id(inputRConPwd)).clear();
        webDriver.findElement(By.id(inputRConPwd)).sendKeys("Test@123");
        webDriver.findElement(By.xpath(btnResetPwd)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Reset My Password Button", "Message should be displayed Your password has been reset successfully.");


        /*//Get text
        webDriver.switchTo().activeElement();
        String text = webDriver.findElement(By.id("toast-container")).getText();
        System.out.println(text);*/





    }
}
