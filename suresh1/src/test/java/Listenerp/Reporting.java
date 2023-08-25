package Listenerp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListnerImplement.class)

public class Reporting {
@Test
	public void demo() {
	ListnerImplement listen=new ListnerImplement();
	listen.logger.log(Status.PASS,"it is passed");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	assertEquals(false, true);
}

}
