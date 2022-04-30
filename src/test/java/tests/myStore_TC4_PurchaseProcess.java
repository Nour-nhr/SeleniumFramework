package tests;

import data.LoadProperties;
import org.testng.annotations.Test;
import pages.myStoreHomePage;
import pages.myStoreSignUpPage;

// this is the register test case
public class myStore_TC4_PurchaseProcess extends TestBase {

    myStoreHomePage homeObject ;
    myStoreSignUpPage registerObject ;

    String email = LoadProperties.userData.getProperty("email");
    String Password = LoadProperties.userData.getProperty("password");


    // start the test for user registration
    @Test(priority=1,alwaysRun=true)
    public void UserCanLoginSuccssfully()
    {
        homeObject = new myStoreHomePage(driver);
        registerObject = new myStoreSignUpPage(driver);
        homeObject.openSignInPage();
        registerObject.userLogin(email,Password);
        homeObject.purchaseProcess();
    }
}
