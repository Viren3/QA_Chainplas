package com.chainpal.Utilities;

import com.chainpal.PageObjects.PageLoading;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public abstract class WebDriverTestBase {

    public abstract void scrollPage(WebElement element);

    public abstract void expWait(String data);

    public abstract void verifyToastMessage(String actualToastMessageXpath, String expToastMessage);
}
