package com.chainpal.TestCases;

import com.chainpal.Utilities.BaseClass;
import com.chainpal.WebAppFunctions.HomePageFunctions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC01_Home extends BaseClass {

    @Test
    public void TestCase001_HomePage() throws InterruptedException, IOException
    {
        HomePageFunctions homePageFunctions = new HomePageFunctions(webDriver);
        homePageFunctions.homeFuction();
        homePageFunctions.ligtPaperFunction();
        homePageFunctions.partnerFunction();
        homePageFunctions.escrowFunction();
        homePageFunctions.joinWaitlistFunction();
        homePageFunctions.getInTouchFunction();
        homePageFunctions.newsLetterFunction();
    }
}

