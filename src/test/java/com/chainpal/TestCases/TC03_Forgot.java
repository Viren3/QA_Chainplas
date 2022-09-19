package com.chainpal.TestCases;
import com.chainpal.Utilities.BaseClass;
import com.chainpal.WebAppFunctions.ForgotFunctions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class TC03_Forgot extends BaseClass{

    @Test
    public void TestCase003_Forgot() throws InterruptedException, IOException {
        ForgotFunctions forgotFunctions = new ForgotFunctions(webDriver);
        forgotFunctions.forgotFunction();
        forgotFunctions.restpassowd();
    }
}
