package com.chainpal.Utilities;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import com.chainpal.Utilities.ExtendReport.ExtentTestManager;

import com.chainpal.WebAppFunctions.DashboardFunctions;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SwtichBrowserTab extends BaseClass{
    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();
    TestBase testBase = new TestBase();

    public SwtichBrowserTab(WebDriver remoteDriver) {webDriver = remoteDriver;}

    public void switchTab() throws InterruptedException, IOException {
        String AccessApp = propertiesRead.readProperties("clickOnAccessAppButton");
        String unlockBtn = propertiesRead.readProperties("unlockBtn");
        String welcomeTxt = propertiesRead.readProperties("welcomeTxt");
        String welcomePwd = propertiesRead.readProperties("welcomePwd");

        Set<String> w = webDriver.getWindowHandles();
        /* window handles iterate */
        Iterator<String> t = w.iterator();
        String ch = t.next();
        String pw = t.next();
        /* switching child window */
//        webDriver.switchTo().window(ch);
        /* close the child browser window */
        //webDriver.close();
        webDriver.switchTo().window(pw);
        /* switching parent window */
//      webDriver.switchTo().window(pw);

        /*Login Page*/
        Thread.sleep(5000);
        webDriver.findElement(By.xpath(AccessApp)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on AccessApp Button", "User should be able to click on AccessApp Button.");
        Thread.sleep(1500);
        webDriver.switchTo().window(ch);
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(welcomeTxt)).sendKeys(welcomePwd);
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(unlockBtn)).click();
        Thread.sleep(1500);
        webDriver.close();
        webDriver.switchTo().window(pw);
    }
}
