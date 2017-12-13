package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://uploadfiles.io/");
		//driver.findElement(By.xpath("//div[@id='dropzone']")).click();
		System.out.println("Hiiii");
		driver.findElement(By.xpath("//div[@id='dropzone']")).sendKeys("C:/GBNG00440040000002113 (1).pdf");
		System.out.println("hello");
		Thread.sleep(8000);		
	}
}