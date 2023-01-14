package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blaze.base.Base;

public class itemsInCategoriesPage extends Base{

	public itemsInCategoriesPage() throws IOException {
		super();
	}
	
	@FindBy (linkText = "Phones")
	private WebElement phonesCategory;
	
	@FindBy (linkText = "Samsung galaxy s6")
	private WebElement samsunGalaxyS6;
	
	@FindBy (linkText = "Laptops")
	private WebElement laptopsCategory;
	
	@FindBy (linkText = "Sony vaio i5")
	private WebElement sonyvaioi5;
	
	@FindBy (linkText = "Monitors")
	private WebElement monitorsCategory;
	
	@FindBy (linkText = "ASUS Full HD")
	private WebElement asusFullHD;
	
	public void clickPhonesCategory() {
		phonesCategory.click();
	}
	
	public Boolean isSamsungGalaxyS6displayed() {
		return samsunGalaxyS6.isDisplayed();
	}
	
	public void clickLaptopsCategory() {
		laptopsCategory.click();
	}
	
	public Boolean isSonyVaioi5displayed() {
		return sonyvaioi5.isDisplayed();
	}
	
	public void clickMonitorsCategory() {
		monitorsCategory.click();
	}
	
	public Boolean isAsusFullHDdisplayed() {
		return asusFullHD.isDisplayed();
	}

}
