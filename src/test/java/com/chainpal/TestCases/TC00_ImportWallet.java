package com.chainpal.TestCases;

import com.chainpal.Utilities.BaseClass;
import org.testng.annotations.Test;
import java.io.IOException;
import com.chainpal.WebAppFunctions.ImportWalletFunctions;
import com.chainpal.WebAppFunctions.LoginPageFunctions;

public class TC00_ImportWallet extends BaseClass {

    @Test
    public void TestCases00_ImportWallet() throws InterruptedException, IOException{

        ImportWalletFunctions iw = new ImportWalletFunctions(webDriver);
        LoginPageFunctions lg = new LoginPageFunctions(webDriver);
        iw.metaMaskConfig();
//        lg.loginFunctionality();
    }

}
