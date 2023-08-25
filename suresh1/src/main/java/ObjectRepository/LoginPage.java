
package ObjectRepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="username")
	private WebElement UsernameTextfield;
	@FindBy(name="password")
	private WebElement passWordTextField;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	public WebElement getUsernameTextfield() {
		return UsernameTextfield;
	}
	public WebElement getPassWordTextField() {
		return passWordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void loginToApplication(String username,String password) {
		getUsernameTextfield().sendKeys(username);
		getPassWordTextField().sendKeys(password);
		getLoginButton().click();
	}
}
	
	

	


