package com.chainpal.WebAppFunctions;

import com.chainpal.Utilities.BaseClass;
import com.chainpal.Utilities.PropertiesRead;
import com.chainpal.Utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import com.chainpal.Utilities.ExtendReport.ExtentTestManager;
import org.openqa.selenium.*;

import java.io.IOException;


public class EditProfileFunctions extends BaseClass {
    WebDriver webDriver;
    PropertiesRead propertiesRead = new PropertiesRead();
    TestBase testBase = new TestBase();

    public EditProfileFunctions(WebDriver remoteDriver) {
        webDriver = remoteDriver;
    }

    public void editProfileFunction() throws InterruptedException, IOException {
        String sBtnEditProfile = propertiesRead.readProperties("sBtnEditProfile");
        String editIcon = propertiesRead.readProperties("editIcon");
        String choosfile = propertiesRead.readProperties("choosfile");
        String fnInput = propertiesRead.readProperties("fnInput");
        String lnInput = propertiesRead.readProperties("lnInput");
        String btnCancel = propertiesRead.readProperties("btnCancel");
        String btnSave = propertiesRead.readProperties("btnSave");
        String btnClose = propertiesRead.readProperties("btnClose");


        Thread.sleep(1500);
        JavascriptExecutor jsDown = (JavascriptExecutor) webDriver;
        jsDown.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath(sBtnEditProfile)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Edit Option", "User should be able to click on Edit Option.");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath(editIcon)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Edit Icon", "User should be able to click on Edit Icon");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(btnClose)).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(editIcon)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Edit Icon", "User should be able to click on Edit Icon");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(fnInput)).clear();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(fnInput)).sendKeys("Automation");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(lnInput)).clear();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(lnInput)).sendKeys("Name.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(btnCancel)).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(editIcon)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Edit Icon", "User should be able to click on Edit Icon");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(fnInput)).clear();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(fnInput)).sendKeys("VIREN");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(lnInput)).clear();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(lnInput)).sendKeys("CHAUHAN");
        Thread.sleep(1000);
        /*Profile Pic*/
//        webDriver.findElement(By.xpath(choosfile)).click();
//        webDriver.findElement(By.xpath(choosfile)).sendKeys("/Users/Viren/Work/Automation/old_chainpal_automation/Data/Men.jpg");
//        Thread.sleep(1000);

//        WebElement selectpic = webDriver.findElement(By.xpath(choosfile));
//        selectpic.sendKeys("/Users/Viren/Work/Automation/old_chainpal_automation/Data/Men.jpg");

        webDriver.findElement(By.xpath(btnSave)).click();
        Thread.sleep(1000);
    }

    public void chanagePasswordFuncation() throws InterruptedException, IOException {
        String changePwdIcon = propertiesRead.readProperties("changePwdIcon");
        String crntPwdInput = propertiesRead.readProperties("crntPwdInput");
        String eyeIcon1 = propertiesRead.readProperties("eyeIcon1");
        String newPwdInput = propertiesRead.readProperties("newPwdInput");
        String eyeIcon2 = propertiesRead.readProperties("eyeIcon2");
        String confPwdInput = propertiesRead.readProperties("confPwdInput");
        String eyeIcon3 = propertiesRead.readProperties("eyeIcon3");
        String btnSubmit = propertiesRead.readProperties("btnSubmit");

        /*NegativeScenario*/
        webDriver.findElement(By.xpath(changePwdIcon)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Change Password Icon", "User should be able to click on Change Password Icon");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(crntPwdInput)).sendKeys("Test@1234");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on Current Password Icon", "User should be able to Enter Current Password.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(newPwdInput)).sendKeys("Test@1234");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on Current Password Icon", "User should be able to Enter Current Password.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(confPwdInput)).sendKeys("Test@123");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on Current Password Icon", "User should be able to Enter Current Password.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(eyeIcon1)).click();
        Thread.sleep(1500);
        webDriver.findElement(By.xpath(eyeIcon2)).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath(eyeIcon3)).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath(crntPwdInput)).clear();
        Thread.sleep(500);
        webDriver.findElement(By.xpath(newPwdInput)).clear();
        Thread.sleep(500);
        webDriver.findElement(By.xpath(confPwdInput)).clear();
        Thread.sleep(500);
        /*PositiveScenario*/
//        webDriver.findElement(By.xpath(changePwdIcon)).click();
//        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on Change Password Icon", "User should be able to click on Change Password Icon");
//        Thread.sleep(1000);
        webDriver.findElement(By.xpath(crntPwdInput)).sendKeys("Test@123");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on Current Password Icon", "User should be able to Enter Current Password.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(newPwdInput)).sendKeys("Test@123");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on New Password Icon", "User should be able to Enter New Password.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(confPwdInput)).sendKeys("Test@1234");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on Confirm Password Icon", "User should be able to Confirm Current Password.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(confPwdInput)).clear();
        webDriver.findElement(By.xpath(confPwdInput)).sendKeys("Test@123");
        webDriver.findElement(By.xpath(btnSubmit)).submit();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Submit Button", "User should be able to click on Submit Button.");
        Thread.sleep(1000);
    }

    public void myAddressFunction() throws InterruptedException, IOException {
        String btnAdd = propertiesRead.readProperties("btnAdd");
        String flnInput = propertiesRead.readProperties("flnInput");
        String streetInput = propertiesRead.readProperties("streetInput");
        String street2Input = propertiesRead.readProperties("street2Input");
        String countryInput = propertiesRead.readProperties("countryInput");
        String stateInput = propertiesRead.readProperties("stateInput");
        String cityInput = propertiesRead.readProperties("cityInput");
        String postInput = propertiesRead.readProperties("postInput");
        String defaultAddCheckbox = propertiesRead.readProperties("defaultAddCheckbox");
        String btnAsave = propertiesRead.readProperties("btnAsave");
        String btnClose = propertiesRead.readProperties("btnClose");
        String btnCancel = propertiesRead.readProperties("btnCancel");
        String btnDelete = propertiesRead.readProperties("btnDelete");
        String btnEdit = propertiesRead.readProperties("btnEdit");
        String btnDeleteConfir = propertiesRead.readProperties("btnDeleteConfir");


        webDriver.findElement(By.xpath(btnAdd)).click();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(btnClose)).click();
        Thread.sleep(100);
//        webDriver.findElement(By.xpath(btnAdd)).click();
//        webDriver.findElement(By.xpath(btnCancel)).click();
        for (int i = 0; i <= 1; i++) {
            webDriver.findElement(By.xpath(btnAdd)).click();
            ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Button", "User Should be able to click on Add Button.");
            Thread.sleep(1000);
            webDriver.findElement(By.xpath(flnInput)).sendKeys("Viren Chauhan");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Name", "User should be able to Enter Name.");
            Thread.sleep(1000);
            webDriver.findElement(By.xpath(streetInput)).sendKeys("Vihav Trade center");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Street 1", "User should be able to Enter Street 1.");
            Thread.sleep(1000);
            webDriver.findElement(By.xpath(street2Input)).sendKeys("Nr. Waves Club, Nr. Essar Petrol");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Enter StreThread.sleep(1000);et 2", "User should be able to Enter Street 2.");
            Thread.sleep(1000);
            webDriver.findElement(By.xpath(countryInput)).sendKeys("India");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Country", "User should be able to Enter Country.");
            Thread.sleep(1000);
            webDriver.findElement(By.xpath(stateInput)).sendKeys("Guajarat");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Enter State/Province", "User should be able to State/Province.");
            Thread.sleep(1000);
            webDriver.findElement(By.xpath(cityInput)).sendKeys("Vadodara");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Enter City", "User should be able to State/Province.");
            Thread.sleep(1000);
            webDriver.findElement(By.xpath(postInput)).sendKeys("391410");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Postal Code", "User should be able to Postal Code.");
            Thread.sleep(1000);
            webDriver.findElement(By.xpath(defaultAddCheckbox)).click();
            ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Check Box", "User should be able to click on Set as a default Address.");
            Thread.sleep(1000);
            webDriver.findElement(By.xpath(btnAsave)).click();
            Thread.sleep(1000);
        }
        /*Edit*/
        JavascriptExecutor jsDown1 = (JavascriptExecutor) webDriver;
        jsDown1.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
        webDriver.findElement(By.id(btnEdit)).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(streetInput)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(streetInput)).sendKeys("An der Alster 80");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Street 1", "User should be able to Enter Street 1.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(street2Input)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(street2Input)).sendKeys("17226 Neustrelitz");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter StreThread.sleep(1000);et 2", "User should be able to Enter Street 2.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(countryInput)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(countryInput)).sendKeys("German");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Country", "User should be able to Enter Country.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(stateInput)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(stateInput)).sendKeys("Germany");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter State/Province", "User should be able to State/Province.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(cityInput)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(cityInput)).sendKeys("Germany1");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter City", "User should be able to State/Province.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(postInput)).clear();
        Thread.sleep(100);
        webDriver.findElement(By.xpath(postInput)).sendKeys("10293458");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Postal Code", "User should be able to Postal Code.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(defaultAddCheckbox)).click();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Check Box", "User should be able to click on Set as a default Address.");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(btnAsave)).click();
        Thread.sleep(1000);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save Button", "User should be able to click on Save Button.");
        JavascriptExecutor jsDown = (JavascriptExecutor) webDriver;
        jsDown.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
        webDriver.findElement(By.id(btnDelete)).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath(btnDeleteConfir)).click();
        Thread.sleep(500);
    }
}
