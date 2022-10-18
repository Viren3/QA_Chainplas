package com.chainpal.TestCases;

import com.chainpal.Utilities.BaseClass;
import com.chainpal.WebAppFunctions.LoginPageFunctions;
import org.testng.annotations.Test;

import java.io.IOException;


public class TC02_Login extends BaseClass {

    @Test
    public void TestCase002_UserLogin() throws InterruptedException, IOException {
        LoginPageFunctions loginPageFunctions = new LoginPageFunctions(webDriver);
        loginPageFunctions.loginFunctionality();
        loginPageFunctions.logoutFunctionality();
    }
}
