package tests;

import data.LoadProperties;
import org.testng.annotations.Test;
import pages.myStoreHomePage;
import pages.myStoreSignUpPage;

// this is the register test case
public class myStore_TC3_SignIn_InvalidCredentials extends TestBase {

    myStoreHomePage homeObject ;
    myStoreSignUpPage registerObject ;

    String email = LoadProperties.userData.getProperty("email");
    String Password = LoadProperties.userData.getProperty("invalidPassword");


    // start the test for user registration
    @Test(priority=1,alwaysRun=true)
    public void UserCantLoginWithInvalidCreds()
    {
        homeObject = new myStoreHomePage(driver);
        homeObject.openSignInPage();
        registerObject = new myStoreSignUpPage(driver);
        registerObject.userLoginInvalid(email,Password);

    }
}
