package Dealsdray_Task_1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Automation_Test_01_UI_Testing_On_Chrome {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Eclips_java\\New_Selenium\\All_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.get("https://www.getcalley.com/");
		driver.get("https://www.getcalley.com/calley-lifetime-offer/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tem =  ts.getScreenshotAs(OutputType.FILE);
		File per = new File("C:\\Users\\Nikhil Durve\\Desktop\\Screenshot\\getcally.jpeg");
		FileHandler.copy(tem, per);
		driver.close();


	}

}
