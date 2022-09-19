package com.chainpal.Utilities;

//import com.chainpal.PageData.RoleManagementData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

import static com.chainpal.Utilities.BaseClass.webDriver;

public class TestBase extends WebDriverTestBase {


    @Override
    public void scrollPage(WebElement element) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Override
    public void expWait(String data) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(600));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(data)));
    }

    @Override
    public void verifyToastMessage(String actualToastMessageXpath, String expToastMessage) {
        expWait(actualToastMessageXpath);
        String actualToastMessage = webDriver.findElement(By.xpath(actualToastMessageXpath)).getText();
        Assert.assertEquals(actualToastMessage, expToastMessage);
    }

    public void clickJavaScriptExecutor(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
    }
}
