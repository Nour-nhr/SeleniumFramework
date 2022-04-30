package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myStoreSignUpPage extends PageBase
{
	public myStoreSignUpPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input[id=\"email\"]")
	WebElement loginEmailField;

	@FindBy(css = "input[id=\"passwd\"]")
	WebElement loginPasswordField;

	@FindBy(css = "button[id=\"SubmitLogin\"]")
	WebElement loginBtn;

	@FindBy(css = "div[class=\"row addresses-lists\"]")
	WebElement myAccountOptions;

	@FindBy(css = "input[id=\"email_create\"]")
	WebElement signUpEmailField;

	@FindBy(css = "button[id=\"SubmitCreate\"]")
	WebElement signUpBtn;

	@FindBy(css = "form[id=\"account-creation_form\"]")
	WebElement signUpForm;

//
	@FindBy(css = "input[id=\"customer_firstname\"]")
	WebElement firstNameField;

	@FindBy(css = "input[id=\"customer_lastname\"]")
	WebElement lastNameField;

	@FindBy(css = "input[id=\"passwd\"]")
	WebElement passField;

	@FindBy(css = "input[id=\"address1\"]")
	WebElement addressField;

	@FindBy(css = "input[id=\"city\"]")
	WebElement cityField;

	@FindBy(css = "select[id=\"id_state\"]")
	WebElement stateSelect;

	@FindBy(css = "input[id=\"postcode\"]")
	WebElement postCodeField;

	@FindBy(css = "select[id=\"id_country\"]")
	WebElement countrySelect;

	@FindBy(css = "input[id=\"phone_mobile\"]")
	WebElement phoneField;

	@FindBy(css = "input[id=\"alias\"]")
	WebElement aliasField;

	@FindBy(css = "button[id=\"submitAccount\"]")
	WebElement registerButton;

	@FindBy(css = "p[class=\"info-account\"]")
	WebElement accountMessage;

	@FindBy(css = "div[class=\"alert alert-danger\"] li")
	WebElement loginErrorMsg;


	//Register page steps
	public void userLogin(String email , String password)
	{
		setTextElementText(loginEmailField,email);
		setTextElementText(loginPasswordField,password);
		clickButton(loginBtn);
		verifyElemetnDisplayed(myAccountOptions);
	}

	public void userLoginInvalid(String email , String password)
	{
		setTextElementText(loginEmailField,email);
		setTextElementText(loginPasswordField,password);
		clickButton(loginBtn);
		verifyElemetnDisplayed(loginErrorMsg);
		verifyElementText(loginErrorMsg,"Authentication failed.");
	}

	public void userSignUp(String email)
	{
		setTextElementText(signUpEmailField,email);
		clickButton(signUpBtn);
		verifyElemetnDisplayed(signUpForm);
	}
	public void userSignUpSteps(String firstName, String lastName, String pass, String address, String city, String state, String postCode, String country, String phone, String alias)
	{
		setTextElementText(firstNameField,firstName);
		setTextElementText(lastNameField,lastName);
		setTextElementText(passField,pass);
		setTextElementText(addressField,address);
		setTextElementText(cityField,city);
		selectFromDropDown(stateSelect,state);
		setTextElementText(postCodeField,postCode);
		selectFromDropDown(countrySelect,country);
		setTextElementText(phoneField,phone);
		setTextElementText(aliasField,alias);
		clickButton(registerButton);
		verifyElemetnDisplayed(accountMessage);
		verifyElementText(accountMessage,"Welcome to your account. Here you can manage all of your personal information and orders.");
	}

}
