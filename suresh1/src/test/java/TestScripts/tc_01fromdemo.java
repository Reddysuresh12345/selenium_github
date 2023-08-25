package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class tc_01fromdemo {
	@Test
public void demo() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	LoginPage page=new LoginPage(driver);
	driver.navigate().refresh();
	page.getUsernameTextfield();
	page.getPassWordTextField();
	page.getLoginButton().click();
}
}
