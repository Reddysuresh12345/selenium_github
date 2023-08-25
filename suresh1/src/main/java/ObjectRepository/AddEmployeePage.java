package ObjectRepository;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

	public AddEmployeePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="Firstname")
	private WebElement firstnameTextfield;
@FindBy(name="lastname")
private WebElement lastnametextfield;
@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
private WebElement EmployeeIdTextField;
@FindBy(xpath="(class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\")")
private WebElement saveButton;
public WebElement getFirstnameTextfield() {
	return firstnameTextfield;
}
public WebElement getLastnametextfield() {
	return lastnametextfield;
}
}
