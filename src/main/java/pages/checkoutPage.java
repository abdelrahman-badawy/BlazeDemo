package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blaze.base.Base;

public class checkoutPage extends Base{

	public checkoutPage() throws IOException {
		super();
	}
	
	@FindBy (linkText = "Cart")
	private WebElement cartElement;
	
	@FindBy (xpath = "//button[text()='Place Order']")
	private WebElement placeOrderElement;
	
	@FindBy (id = "name")
	private WebElement nameElement;
	
	@FindBy (id = "country")
	private WebElement countryElement;
	
	@FindBy (id = "city")
	private WebElement cityElement;
	
	@FindBy (id = "card")
	private WebElement cardElement;
	
	@FindBy (id = "month")
	private WebElement monthElement;
	
	@FindBy (id = "year")
	private WebElement yearElement;
	
	@FindBy (xpath = "//button[text()='Purchase']")
	private WebElement purchaseElement;
	
	@FindBy (xpath = "//h2[text()='Thank you for your purchase!']")
	private WebElement thankyouElement;
	
	public void clickCart() {
		cartElement.click();
	}
	
	public void clickPlaceOrder() {
		placeOrderElement.click();
	}
	
	public void insertName(String Name) {
		nameElement.sendKeys(Name);
	}
	
	public void insertCountry(String Country) {
		countryElement.sendKeys(Country);
	}
	
	public void insertCity(String City) {
		cityElement.sendKeys(City);
	}
	
	public void insertCard(String Card) {
		cardElement.sendKeys(Card);
	}
	
	public void insertMonth(String Month) {
		monthElement.sendKeys(Month);
	}
	
	public void insertYear(String Year) {
		yearElement.sendKeys(Year);
	}
	
	public void clickPurchase() {
		purchaseElement.click();
	}
	
	public Boolean isThankyouDisplayed() {
		return thankyouElement.isDisplayed();
	}

}
