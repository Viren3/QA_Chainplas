package com.chainpal.TestCases;
import com.chainpal.Utilities.BaseClass;
import com.chainpal.WebAppFunctions.EditProfileFunctions;
import com.chainpal.WebAppFunctions.LoginPageFunctions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC09_EditProfile extends BaseClass {
    @Test
    public void TestCase009_EditProfile() throws InterruptedException,IOException{

        LoginPageFunctions loginPageFunctions = new LoginPageFunctions(webDriver);
        EditProfileFunctions editProfileFunctions = new EditProfileFunctions(webDriver);
        loginPageFunctions.loginFunctionality();
        editProfileFunctions.editProfileFunction();
        editProfileFunctions.chanagePasswordFuncation();
        editProfileFunctions.myAddressFunction();
        loginPageFunctions.logoutFunctionality();

    }
}
