package com.chainpal.Utilities;

import com.relevantcodes.extentreports.LogStatus;
import com.chainpal.PageObjects.PageLoading;
import com.chainpal.Utilities.ExtendReport.ExtentManager;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver webDriver;
    public WebDriver getDriver() {
        return webDriver;
    }

    @BeforeClass
    public void setup() throws IOException {

        PropertiesRead propertiesRead = new PropertiesRead();
        String url = propertiesRead.readProperties("URL");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addExtensions(new File("./Data/nkbihfbeogaeaoehlefnkodbefgpgknn-10.16.1-Crx4Chrome.com.crx"));
        chromeOptions.addArguments("user-data-dir=/Users/Viren/Library/Application Support/Google/Chrome/Profile 1");
        chromeOptions.addArguments("--profile-directory= Profile 1");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.get(url);
    }

    public void waitForLoadingIconDisappear() throws InterruptedException {
        PageLoading pageLoading = new PageLoading(webDriver);
        int count = 0;
        while (pageLoading.getLoadingIcon().size() != 0 && count < 8) {
            Thread.sleep(5000);
            count++;
        }
    }

    public static void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception {
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }

    @BeforeMethod
    public void beforeMethod(Method method) {
        ExtentTestManager.startTest("Method Name: " + method.getName());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("TEST STARTED # " + method.getAnnotation(Test.class).description());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @AfterMethod
    public void afterMethod(ITestResult result, Method method) throws Exception {
        String fileName;
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        String testSRes;
        Date endDateTime;
        String testDescription;
        String dateEndInString;
        if (result.getStatus() == 2) {
            endDateTime = new Date();
            DateFormat shortDf = DateFormat.getDateTimeInstance(3, 3);
            testDescription = shortDf.format(endDateTime).replace("/", "_");
            testDescription = testDescription.replace(" ", "_");
            testDescription = testDescription.replace(":", "_");
            dateEndInString = "SC_error__" + testDescription;
            fileName = "./Reports/Failure_Screenshots/" + dateEndInString + ".png" ;
            takeSnapShot(webDriver, fileName);
            ExtentTestManager.getTest().log(LogStatus.FAIL, "Error Screenshot" + ExtentTestManager.getTest().addScreenCapture("failure_screenshots\\" + dateEndInString + ".png"));
            ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable().getMessage());
            ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed");
            testSRes = "FAIL";
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
            testSRes = "SKIP";
        } else {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
            testSRes = "PASS";
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("TEST COMPLETED # [ " + testSRes + " ] " + method.getAnnotation(Test.class).description());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
        ExtentManager.getReporter().flush();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Browser Closed");
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }
}