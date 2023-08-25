package GanricUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.AddEmployeePage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.Pimpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static PropertyUtility property;
	public LoginPage login;
	public static HomePage home;
	public Pimpage pimpage;
	public AddEmployeePage addemployeepage;

	@BeforeClass
	public void Launchingbrowser() throws IOException {
		property=new PropertyUtility();
		if(property.readingDataFromPropertyFile("browser").equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(property.readingDataFromPropertyFile("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void navigatingToApplication() throws IOException {
		login=new LoginPage(driver);
		home=new HomePage(driver);
		driver.get(property.readingDataFromPropertyFile("url"));
		pimpage = new Pimpage(driver);
		 addemployeepage=new AddEmployeePage(driver);
		 driver.get(property.readingDataFromPropertyFile(null));
		login.loginToApplication(property.readingDataFromPropertyFile("username"),property.readingDataFromPropertyFile("password"));
	}
	@AfterMethod
	public void signOutFromApplication() {
		home.loggingOut();
		System.out.println("signout");
	}
	@AfterClass
	public void closingTheBrowser() {
		driver.quit();
	}
}