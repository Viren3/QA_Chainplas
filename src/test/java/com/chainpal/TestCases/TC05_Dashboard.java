package com.chainpal.TestCases;
import com.chainpal.Utilities.BaseClass;
import com.chainpal.WebAppFunctions.DashboardFunctions;
import com.chainpal.WebAppFunctions.LoginPageFunctions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC05_Dashboard extends BaseClass {
    @Test
    public void TestCase005_Dashboard() throws InterruptedException, IOException
    {
        LoginPageFunctions loginPageFunctions = new LoginPageFunctions(webDriver);
        DashboardFunctions dashboardFunctions = new DashboardFunctions(webDriver);
        loginPageFunctions.loginFunctionality();
        dashboardFunctions.dashaboardFunction();
        dashboardFunctions.sildMenuFunction();
        loginPageFunctions.logoutFunctionality();
    }
}
