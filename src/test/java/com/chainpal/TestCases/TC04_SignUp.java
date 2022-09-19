package com.chainpal.TestCases;

import com.chainpal.Utilities.BaseClass;
import com.chainpal.WebAppFunctions.SignUpFunctions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC04_SignUp extends BaseClass{
    @Test
    public void TetCase004_SignUp() throws InterruptedException,IOException{
        SignUpFunctions signUpFunctions = new SignUpFunctions(webDriver);
        signUpFunctions.signupFunction();

    }
}
