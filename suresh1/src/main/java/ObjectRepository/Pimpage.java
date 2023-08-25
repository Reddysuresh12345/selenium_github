package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.xml.sax.helpers.ParserFactory;

import Ganrics.WebDriverUtility;

public class Pimpage {

	public Pimpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(linkText = "Employee List")
	private WebElement EmpoyeeListButton;
	
	@FindBy(linkText="Add Employee")
	private WebElement AddEmployeeButton;

	public WebElement getEmpoyeeListButton() {
		return EmpoyeeListButton;
	}

	public WebElement getAddEmployeeButton() {
		return AddEmployeeButton;
	}
	
	@FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")
	private WebElement pimbutton;
	public WebElement getPimButton() {
		return pimbutton;
		
		
	}

}
