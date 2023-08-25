package GanricUtility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import Practice.IAutoconstants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotUtility implements IAutoconstants {
public void takeingScreenshot(String screenshotname) throws IOException {
	//WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	TakesScreenshot ts= (TakesScreenshot) driver;
	 File photo = ts.getScreenshotAs(OutputType.FILE);
	String path = DIRECTORY+SSPATH+screenshotname+" "+TIME+".png";
	 File file=new File(screenshotname);
	try {
		FileUtils.copyFile(photo, file);
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	
	return;
}
}

