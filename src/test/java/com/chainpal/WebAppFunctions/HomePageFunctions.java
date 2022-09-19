package com.chainpal.WebAppFunctions;

import com.chainpal.Utilities.BaseClass;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import com.chainpal.Utilities.PropertiesRead;
import com.chainpal.Utilities.TestBase;
import com.chainpal.Utilities.NagativeMailList;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePageFunctions extends BaseClass {
    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();
    TestBase testBase = new TestBase();
    NagativeMailList nagativeMailList = new NagativeMailList(webDriver);
    public HomePageFunctions(WebDriver remoteDriver) {webDriver = remoteDriver;}

    public void homeFuction() throws InterruptedException, IOException{
        String clickOnChainpal = propertiesRead.readProperties("wChainpal");
        String clickOnTokenomics = propertiesRead.readProperties("tokenomics");
        String clickOnRoadmap = propertiesRead.readProperties("roadmap");
        String clickOnAbout = propertiesRead.readProperties("about");
        String clickOnUpArrow = propertiesRead.readProperties("scrollUpArrow");


        Set<String> w = webDriver.getWindowHandles();
        /* window handles iterate */
        Iterator<String> t = w.iterator();
        String ch =  t.next();
        String pw =  t.next();
        /* switching child window */
        webDriver.switchTo().window(ch);
        /* close the child browser window */
        webDriver.close();
        Thread.sleep(1000);
        /* switching parent window */
        webDriver.switchTo().window(pw);
        Thread.sleep(8000);
        webDriver.findElement(By.xpath(clickOnTokenomics)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Tokenomics", "User should be able to click on Tokenomics.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(clickOnUpArrow)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on ScollUp Icon", "User should be able to click on ScollUp.");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(clickOnRoadmap)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Roadmap", "User should be able to click on Roadmap.");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(clickOnUpArrow)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on ScollUp Icon", "User should be able to click on ScollUp.");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(clickOnAbout)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on About", "User should be able to click on About.");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(clickOnChainpal)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on What is Chainpals?", "User should be able to click on What is Chainpals?.");
        Thread.sleep(1500);
    }

    public void getInTouchFunction() throws IOException, InterruptedException {
        String gScrollDown = propertiesRead.readProperties("gScrollDown");
        String gName = propertiesRead.readProperties("gName");
        String gEmail = propertiesRead.readProperties("gEmail");
        String gDescription = propertiesRead.readProperties("gDescription");
        String gAccept = propertiesRead.readProperties("gAccept");
        String gSubmit = propertiesRead.readProperties("gSubmit");
        String gtxtName = propertiesRead.readProperties("gtxtName");
        String gtxtEmail = propertiesRead.readProperties("gtxtEmail");
        String gtxtDes = propertiesRead.readProperties("gtxtDes");

//        testBase.scrollPage(webDriver.findElement(By.xpath(gScrollDown)));
        JavascriptExecutor jsDown = (JavascriptExecutor) webDriver;
        jsDown.executeScript("window.scrollBy(0,3000)", "");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(gName)).sendKeys(gtxtName);
        ExtentTestManager.getTest().log(LogStatus.PASS,"Enter Name", "User should be able to enter the name.");
        Thread.sleep(1500);
        NagativeMailList nagativeMailList = new NagativeMailList(webDriver);
        nagativeMailList.mailFunction();
        webDriver.findElement(By.xpath(gEmail)).sendKeys(gtxtEmail);
        ExtentTestManager.getTest().log(LogStatus.PASS,"Enter the valid Email ID", "User should be able to enter the Email Address.");
        Thread.sleep(500);
        webDriver.findElement(By.xpath(gDescription)).sendKeys(gtxtDes);
        ExtentTestManager.getTest().log(LogStatus.PASS,"Enter Description", "User should be able to enter the Description.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(gSubmit)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Submit Button", "User should be able to Click on the Submint Button.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(gAccept)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Accept Checkbox", "User should be able to Click on the Checkbox.");
        Thread.sleep(500);
        webDriver.findElement(By.xpath(gSubmit)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Submit Button", "User should be able to Click on the Submint Button.");
        Thread.sleep(1000);
    }

    public void ligtPaperFunction() throws InterruptedException, IOException{
        String clicnOnbtnLigtPaper = propertiesRead.readProperties("btnLigtPaper");
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(clicnOnbtnLigtPaper)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Light Paper Button", "User should be able to click on Light Paper Button.");
        Thread.sleep(3000);
        Set<String> w = webDriver.getWindowHandles();
        // window handles iterate
        Set<String> handlesSet = webDriver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        webDriver.switchTo().window(handlesList.get(1));
        webDriver.close();
        Thread.sleep(3000);
        webDriver.switchTo().window(handlesList.get(0));
    }

    public void partnerFunction() throws IOException, InterruptedException {
        String clicklearnbtn = propertiesRead.readProperties("clicklearnbtn");
        String scrollPdown = propertiesRead.readProperties("scrollPdown");
//        TestBase p = new TestBase();
        Thread.sleep(4000);
        testBase.scrollPage(webDriver.findElement(By.xpath(scrollPdown)));
        Thread.sleep(3000);
        webDriver.findElement(By.xpath(clicklearnbtn)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Learn Button", "User should be navigated on Join the Chainpals Partner Program page.");
        Thread.sleep(1500);
        webDriver.navigate().back();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Browser Backicon", "User should be navigated on Home page.");
        Thread.sleep(1000);
    }

    public void escrowFunction() throws IOException, InterruptedException {
        String clickElearbtn = propertiesRead.readProperties("clickElearbtn");
        String scrollEdown = propertiesRead.readProperties("scrollEdown");
        Thread.sleep(1500);
//        TestBase p = new TestBase();
        testBase.scrollPage(webDriver.findElement(By.xpath(scrollEdown)));
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(clickElearbtn)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Learn Button", "User should be navigated on Join the Escrow Manager Program page.");
        Thread.sleep(1500);
    }

    public void joinWaitlistFunction() throws IOException, InterruptedException {
        String scrollDownJoin = propertiesRead.readProperties("scrollDownJoin");
        String emailJoinWait = propertiesRead.readProperties("emailJoinWait");
        String submitBtnJoin = propertiesRead.readProperties("submitBtnJoin");

        testBase.scrollPage(webDriver.findElement(By.xpath(scrollDownJoin)));
        ExtentTestManager.getTest().log(LogStatus.PASS,"Scroll Down", "User should be able to Scroll Down.");
        Thread.sleep(500);
        /*Nagative Mail*/
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("plaintextaddress");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "plaintextaddress");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("@#@@##@%^%#$@#$@#.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "@#@@##@%^%#$@#$@#.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("example.email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example.email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("example@example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys(".example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", ".example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("example.@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example.@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("example…example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example…example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("おえあいう@example.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "おえあいう@example.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("example@email");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@email");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("example@-email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@-email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("example@email.web");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@email.web");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("example@111.222.333.44444");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@111.222.333.44444");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("CAT…123@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "CAT…123@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("”(),:;<>[\\]@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "”(),:;<>[\\]@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("obviously”not”correct@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "obviously”not”correct@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("example\\ is”especially”not\\allowed@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example\\ is”especially”not\\allowed@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, ");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "254 Characters");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(emailJoinWait)).clear();
        /*Finished*/
        webDriver.findElement(By.xpath(emailJoinWait)).sendKeys("viren.chauhan@adrixus.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Enter the valid Email ID", "User should be able to enter Email ID.");
        Thread.sleep(500);
        webDriver.findElement(By.xpath(submitBtnJoin)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Email Inputbox & Enter the Email ID", "User should be able to enter Email ID.");
        webDriver.navigate().back();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Browser Backicon", "User should be navigated on Home page.");
        Thread.sleep(500);
    }

    public void newsLetterFunction() throws IOException, InterruptedException {
        String scrollerDown = propertiesRead.readProperties("scrollerDown");
        String newsEmail = propertiesRead.readProperties("newsEmail");
        String newsSubmit = propertiesRead.readProperties("newsSubmit");

        testBase.scrollPage(webDriver.findElement(By.xpath(scrollerDown)));
        ExtentTestManager.getTest().log(LogStatus.PASS,"Scroll Down", "User should be able to Scroll Down.");
        Thread.sleep(500);
        /*Nagative Mail*/
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("plaintextaddress");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "plaintextaddress");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("@#@@##@%^%#$@#$@#.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "@#@@##@%^%#$@#$@#.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("example.email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example.email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("example@example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys(".example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", ".example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("example.@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example.@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("example…example@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example…example@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("おえあいう@example.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "おえあいう@example.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("example@email");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@email");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("example@-email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@-email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("example@email.web");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@email.web");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("example@111.222.333.44444");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example@111.222.333.44444");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("CAT…123@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "CAT…123@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("”(),:;<>[\\]@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "”(),:;<>[\\]@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("obviously”not”correct@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "obviously”not”correct@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("example\\ is”especially”not\\allowed@email.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "example\\ is”especially”not\\allowed@email.com");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, ");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Nagative Mail", "254 Characters");
        Thread.sleep(100);
        webDriver.findElement(By.xpath(newsEmail)).clear();
        /*Finished*/
        webDriver.findElement(By.xpath(newsEmail)).sendKeys("viren.chauhan@adrixus.com");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Enter the valid Email ID", "User should be able to enter Email ID.");
        Thread.sleep(500);
        webDriver.findElement(By.xpath(newsSubmit)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Submit Button", "User should be able to click on the Submit Button.");
        webDriver.navigate().back();
        Thread.sleep(500);
    }
}
