package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blaze.base.Base;

public class additemPage extends Base{

	public additemPage() throws IOException {
		super();
	}
	
	@FindBy (linkText = "Samsung galaxy s6")
	private WebElement phoneItem;
	
	@FindBy (linkText = "Add to cart")
	private WebElement addToCart;
	
	public void addPhoneItem() {
		phoneItem.click();
	}
	
	public void clickAddToCart() {
		addToCart.click();
	}
	
	public void waitforElement() throws InterruptedException {
		Thread.sleep(300);
	}
	
	public String getAlertmessage() throws InterruptedException {
		return driver.switchTo().alert().getText();
	}
	
	public void closeAlert() throws InterruptedException {
		driver.switchTo().alert().accept();
	}

}
