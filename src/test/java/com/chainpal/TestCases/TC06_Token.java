package com.chainpal.TestCases;
import com.chainpal.Utilities.BaseClass;
import com.chainpal.WebAppFunctions.LoginPageFunctions;
import com.chainpal.WebAppFunctions.TokenDashboardFunctions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC06_Token extends BaseClass{
    @Test
    public void TestCase006_TokenDashboard() throws InterruptedException, IOException
    {
        LoginPageFunctions loginPageFunctions = new LoginPageFunctions(webDriver);
        TokenDashboardFunctions tokenDashboardFunctions = new TokenDashboardFunctions(webDriver);
        loginPageFunctions.loginFunctionality();
        tokenDashboardFunctions.tokenFunction();
        loginPageFunctions.logoutFunctionality();
    }
}
