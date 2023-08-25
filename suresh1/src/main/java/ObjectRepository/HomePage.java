package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Paul Collings']")
	private WebElement userDropdownIcon;
	@FindBy(linkText="Logout")
	private WebElement LogoutButton;

	public WebElement getUserDropdownIcon() {
		return userDropdownIcon;

	}
	public  WebElement getLogoutButton() {
		return LogoutButton;
	}
	public void loggingOut() {
		getUserDropdownIcon().click();
		getLogoutButton().click();
	}
}
