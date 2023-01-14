package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blaze.base.Base;

public class removeitemPage extends Base{

	public removeitemPage() throws IOException {
		super();
	}
	
	@FindBy (linkText = "Cart")
	private WebElement cartElement;
	
	@FindBy (linkText = "Delete")
	private WebElement deleteElement;
	
	@FindBy (id = "totalp")
	private WebElement totalElement;
	
	public void clickCart() {
		cartElement.click();
	}
	
	public void clickDelete() {
		deleteElement.click();
	}
	
	public void waitforElement() throws InterruptedException {
		Thread.sleep(300);
	}
	
	public Boolean isTotalElementdisplayed() {
		return totalElement.isDisplayed();
		
	}

}
