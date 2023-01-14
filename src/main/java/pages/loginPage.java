package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blaze.base.Base;


public class loginPage extends Base{

	public loginPage() throws IOException {
		super();
	}
	
	@FindBy (id = "login2")
	private WebElement homeLogin;
	
	@FindBy (id = "loginusername")
	private WebElement usernameElement;
	
	@FindBy (id = "loginpassword")
	private WebElement passwordElement;
	
	@FindBy (xpath = "//button[contains(text(),'Log in')]")
	private WebElement login;
	
	@FindBy (id = "nameofuser")
	private WebElement nameofuser;
	
	
	public void clickhomeLogin() {
		homeLogin.click();
	}
	
	public void insertUsername(String username) {
		usernameElement.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		passwordElement.sendKeys(password);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void waitforElement() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	public Boolean isNameofuserdisplayed() {
		return nameofuser.isDisplayed();
		
	}
	

}
