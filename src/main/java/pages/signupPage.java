package pages;

import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blaze.base.Base;

public class signupPage extends Base{

	private UUID randomUUID = UUID.randomUUID();
	
	public signupPage() throws IOException {
		super();
	}
	
	@FindBy (id = "signin2")
	private WebElement homeSignup;
	
	@FindBy (id = "sign-username")
	private WebElement usernameElement;
	
	@FindBy (id = "sign-password")
	private WebElement passwordElement;
	
	@FindBy (xpath = "//button[contains(text(),'Sign up')]")
	private WebElement signup;
	
	
	public void clickhomeSignup() {
		homeSignup.click();
	}
	
	public void insertUsername() {
		usernameElement.sendKeys(randomUUID.toString());
	}
	
	public void insertPassword() {
		passwordElement.sendKeys(randomUUID.toString());
	}
	
	public void clickSignup() {
		signup.click();
	}
	
	public void waitforElement() throws InterruptedException {
		Thread.sleep(300);
	}
	
	public String getAlertmessage() throws InterruptedException {
		return driver.switchTo().alert().getText();
	}
	
	public void closeAlert() throws InterruptedException {
		driver.switchTo().alert().accept();;
	}

}
