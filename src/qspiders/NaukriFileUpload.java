package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriFileUpload 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		WebElement uploadCV=driver.findElement(By.id("input_resumeParser"));
		Thread.sleep(2000);
		uploadCV.sendKeys("C:\\Jyotiprakash Mohanty.doc");
		/*Thread.sleep(5000);
		driver.close();*/
	}
}