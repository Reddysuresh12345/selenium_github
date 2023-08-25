package Ganrics;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class WebDriverUtility 
{
public void enteringDataInto(WebDriver driver,WebElement element) {
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("argument[0].click()", element);
}
public void switchingToFrom(WebDriver driver,int index)	{
driver.switchTo().frame(index);	
}
public void switchToFrom(WebDriver driver,String name)
{
	driver.switchTo().frame(name);
}
public void switchToFrame(WebDriver driver,WebElement element) {
	driver.switchTo().frame(element);
}
public void switchingBackFromFrame(WebDriver driver) {
	driver.switchTo().defaultContent();
}
public Alert SwitchingToAlert(WebDriver driver) {
	return driver.switchTo().alert();
}
/*
 * this method is used to perform mouse overing on particular element
 */
public void mouseHoverOnElement(WebDriver driver,WebElement element)
{
 Actions action=new Actions(driver);
 action.moveToElement(element).perform();
}
/*
 * this method is used to handle the dropdown with reference of index
 */
public void handlingDropDown(WebElement dropdown,String value)
{
	Select select=new Select(dropdown);
	try {
	select.selectByValue(value);
}catch(NoSuchElementException e) {
	select.selectByVisibleText(value);
}
}
public void handlingDropDown(WebElement dropdown,int value)
{
	Select select=new Select(dropdown);
	select.selectByIndex(value);
}
public void switchToWindow(WebDriver driver,String parentwindowId,Set<String> alWindowId,String title)
{
alWindowId.remove(parentwindowId);
for(String id:alWindowId) {
	
}
}
}
	
