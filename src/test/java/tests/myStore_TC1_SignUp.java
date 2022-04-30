package tests;

import data.LoadProperties;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import pages.myStoreHomePage;
import pages.myStoreSignUpPage;

// this is the register test case
public class myStore_TC1_SignUp extends TestBase {

    myStoreHomePage homeObject ;
    myStoreSignUpPage registerObject ;

    // read values from properties file
    String generatedEmail = RandomStringUtils.randomAlphabetic(7)+LoadProperties.userData.getProperty("emailPart");

    String firstName = LoadProperties.userData.getProperty("firstname");
    String lastName = LoadProperties.userData.getProperty("lastname");
    String pass = LoadProperties.userData.getProperty("password");
    String addr = LoadProperties.userData.getProperty("address");
    String cityF = LoadProperties.userData.getProperty("city");
    String stateSelect = LoadProperties.userData.getProperty("state");
    String postCode = LoadProperties.userData.getProperty("postalCode");
    String countrySelect = LoadProperties.userData.getProperty("country");
    String phone = LoadProperties.userData.getProperty("mobile");
    String aliasField = LoadProperties.userData.getProperty("alias");
    // start the test for user registration
    @Test(priority=1,alwaysRun=true)
    public void UserCanRegisterSuccssfully()
    {
        homeObject = new myStoreHomePage(driver);
        homeObject.openSignInPage();
        registerObject = new myStoreSignUpPage(driver);
        registerObject.userSignUp(generatedEmail);
        registerObject.userSignUpSteps(firstName,lastName,pass,addr,cityF,stateSelect,postCode,countrySelect,phone,aliasField);


    }
}
