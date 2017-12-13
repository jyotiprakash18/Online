package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/upload/");
		WebElement browse=driver.findElement(By.id("uploadfile_0"));
		browse.sendKeys("C:/GBNG00440040000002113 (1).pdf");
		Thread.sleep(5000);
		WebElement terms=driver.findElement(By.id("terms"));
		terms.click();
		WebElement submitFile=driver.findElement(By.id("submitbutton"));
		submitFile.click();
		Thread.sleep(8000);
		//driver.close();
	}
}