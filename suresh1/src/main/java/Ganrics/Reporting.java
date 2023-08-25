package Ganrics;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GanricUtility.ListnerImplmantation;
import bsh.NameSource.Listener;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reporting 
{
	@Test
public void demo() {
	ListnerImplmantation listen=new ListnerImplmantation();
	//listen.Logger.log
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
}

	
}
