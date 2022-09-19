package com.chainpal.Utilities;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class NagativeMailList extends BaseClass {
    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();
    TestBase testBase = new TestBase();

    public NagativeMailList(WebDriver remoteDriver) {webDriver = remoteDriver;}

    public void mailFunction() throws InterruptedException, IOException{
        String textBoxEmailAddress = propertiesRead.readProperties("emailAddressTextBox");

        /*Nagative Mail*/
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("plaintextaddress");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "plaintextaddress");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("@#@@##@%^%#$@#$@#.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "@#@@##@%^%#$@#$@#.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("example.email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example.email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("example@example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys(".example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", ".example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("example.@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example.@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("example…example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example…example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("おえあいう@example.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "おえあいう@example.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("example@email");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@email");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("example@-email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@-email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("example@email.web");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@email.web");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("example@111.222.333.44444");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@111.222.333.44444");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("CAT…123@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "CAT…123@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("”(),:;<>[\\]@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "”(),:;<>[\\]@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("obviously”not”correct@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "obviously”not”correct@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("example\\ is”especially”not\\allowed@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example\\ is”especially”not\\allowed@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, ");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "254 Characters");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(textBoxEmailAddress)).clear();
        /*Finished*/
    }
}
