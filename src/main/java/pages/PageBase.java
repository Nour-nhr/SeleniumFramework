package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase {

	public JavascriptExecutor jse ; 
	public Select select ; 
	public Actions action ; 

	// create constructor 
	public PageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	protected static void clickButton(WebElement button) 
	{
		button.click();
	}

	protected static void selectFromDropDown(WebElement list, String value)
	{
		Select select = new Select(list);
		select.selectByVisibleText(value);

	}
	
	protected static void setTextElementText(WebElement textElement , String value) 
	{
		textElement.isDisplayed();
		textElement.sendKeys(value);
	}


	protected static void verifyElemetnDisplayed(WebElement element) {
		element.isDisplayed();
		
	}

	protected static void verifyElementText(WebElement textElement , String value)
	{
		textElement.getText().contains(value);

	}

}
