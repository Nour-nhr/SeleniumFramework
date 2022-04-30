package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class myStoreHomePage extends PageBase
{
	public myStoreHomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}
	//Home page Selectors
	@FindBy(css="div a[class=\"login\"]")
	WebElement signIn ;

	@FindBy(css="ul[id=\"homefeatured\"] li:nth-child(5)")
	WebElement printedSummerDress ;

	@FindBy(css="input[id=\"quantity_wanted\"]")
	WebElement quantityField ;

	@FindBy(css="select[id=\"group_1\"]")
	WebElement selectSize ;

	@FindBy(css="div[class=\"attribute_list\"] li:nth-child(3)")
	WebElement blueColor ;

	@FindBy(css="p[id=\"add_to_cart\"] button[type=\"submit\"]")
	WebElement addToCartBtn ;

	@FindBy(css="a[title=\"Proceed to checkout\"]")
	WebElement proceedBtn ;

	@FindBy(css="p[class=\"cart_navigation clearfix\"] a[title=\"Proceed to checkout\"]")
	WebElement proceedCheckoutBtn ;

	@FindBy(css="button[type=\"submit\"][name=\"processAddress\"]")
	WebElement proceedAddress ;

	@FindBy(css="button[type=\"submit\"][name=\"processCarrier\"]")
	WebElement proceedCarrier ;

	@FindBy(css="p[class=\"checkbox\"] label")
	WebElement checkBox ;

	@FindBy(css="div a[class=\"bankwire\"]")
	WebElement bankWire ;

	@FindBy(css="p[id=\"cart_navigation\"] button[type=\"submit\"] span")
	WebElement confirmOrderBtn ;

	@FindBy(css="div[class=\"box\"] p")
	WebElement confirmOrderMsg ;

	@FindBy(css="div[id=\"header_logo\"]")
	WebElement homeLogo ;


	//Home page steps
	public void openSignInPage()
	{
		clickButton(signIn);
	}

	public void purchaseProcess()
	{
		clickButton(homeLogo);
		clickButton(printedSummerDress);
		setTextElementText(quantityField,"2");
		selectFromDropDown(selectSize,"M");
		clickButton(blueColor);
		clickButton(addToCartBtn);
		clickButton(proceedBtn);
		clickButton(proceedCheckoutBtn);
		clickButton(proceedAddress);
		clickButton(checkBox);
		clickButton(proceedCarrier);
		clickButton(bankWire);
		clickButton(confirmOrderBtn);
		verifyElemetnDisplayed(confirmOrderMsg);
		verifyElementText(confirmOrderMsg, "Your order on My Store is complete.");


	}

}
