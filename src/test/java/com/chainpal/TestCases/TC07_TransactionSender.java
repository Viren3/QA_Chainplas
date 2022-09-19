package com.chainpal.TestCases;
import com.chainpal.Utilities.BaseClass;
import com.chainpal.WebAppFunctions.LoginPageFunctions;
import com.chainpal.WebAppFunctions.MyTransactionFunctions;
import org.testng.annotations.Test;
import java.io.IOException;

public class TC07_TransactionSender extends BaseClass  {
    @Test
    public void TC007_TransactionSender () throws InterruptedException, IOException{
        LoginPageFunctions loginPageFunctions = new LoginPageFunctions(webDriver);
        MyTransactionFunctions myTransactionFunctions = new MyTransactionFunctions(webDriver);
        loginPageFunctions.loginFunctionality();
        myTransactionFunctions.mytransactionFunction();
        myTransactionFunctions.transactionInformation();
        loginPageFunctions.logoutFunctionality();
//        myTransactionFunctions.transactionForSender();
    }
}

