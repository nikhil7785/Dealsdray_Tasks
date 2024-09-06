package Dealsdray_Task_1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class Automation_Test_01_UI_Testing_On_Firefox {

	private static org.openqa.selenium.OutputType OutputType;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver","F:\\Eclips_java\\New_Selenium\\All_Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.get("https://www.getcalley.com/");
		//driver.get("https://www.getcalley.com/calley-lifetime-offer/");
		driver.get("https://www.getcalley.com/calley-pro-features/\r\n"
				+ "");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tem =  ts.getScreenshotAs(OutputType.FILE);
		File per = new File("C:\\Users\\Nikhil Durve\\Desktop\\Screenshot\\getcally1.jpeg");
		FileHandler.copy(tem, per);
		driver.close();

	}

}
