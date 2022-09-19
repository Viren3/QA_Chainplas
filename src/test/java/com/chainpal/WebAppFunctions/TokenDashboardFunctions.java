package com.chainpal.WebAppFunctions;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.chainpal.Utilities.BaseClass;
import com.chainpal.Utilities.PropertiesRead;
import com.chainpal.Utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.element.Element;
import java.io.IOException;
public class TokenDashboardFunctions extends BaseClass{
    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();
    TestBase testBase = new TestBase();

    public TokenDashboardFunctions(WebDriver remoteDriver){webDriver = remoteDriver;}

    public void tokenFunction() throws InterruptedException,IOException {
        String navTokenDashboard = propertiesRead.readProperties("navTokenDashboard");
        String btnBuyToken = propertiesRead.readProperties("btnBuyToken");
        Thread.sleep(1500);
        WebElement hoverable = webDriver.findElement(By.xpath(navTokenDashboard));
        Thread.sleep(1000);
        Actions action = new Actions(webDriver);
        action.moveToElement(hoverable).perform();
        webDriver.findElement(By.xpath(navTokenDashboard)).click();
        Thread.sleep(2000);
        JavascriptExecutor jsDown = (JavascriptExecutor) webDriver;
        jsDown.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(btnBuyToken)).click();
        Thread.sleep(1500);
        webDriver.navigate().back();
    }
}
