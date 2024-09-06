package Dealsdray_Task_2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Automation_Test_02_Functional_TestingCase {

	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","F:\\Eclips_java\\New_Selenium\\All_Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(" https://demo.dealsdray.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='sidenavHoverShow css-1s178v5']")).click();
		driver.findElement(By.xpath("(//span[@class='sidenavHoverShow MuiBox-root css-i9zxpg'])[2]")).click();
		driver.findElement(By.xpath("//button[.='Add Bulk Orders']")).click();
	    driver.findElement(By.id("mui-7")).sendKeys("C:\\Users\\Nikhil Durve\\Downloads\\demodata.xlsx");
		driver.findElement(By.xpath("//button[.='Import']")).click();
		driver.findElement(By.xpath("//button[.='Validate Data']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp =ts.getScreenshotAs(OutputType.FILE);
		File per=new File("C:\\\\Users\\\\Nikhil Durve\\\\Desktop\\\\Screenshot\\\\task2Screenshot1.jpeg");
		FileHandler.copy(temp,per);
		driver.close();
		

	}

	

}
