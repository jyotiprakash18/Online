package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleElementsLinks 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.gsmarena.com/nokia-phones-1.php");
		Thread.sleep(10000);
		List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
		Thread.sleep(10000);
		int linkcount=alllinks.size();
		System.out.println(linkcount);
		for(int i=0;i<=linkcount-1;i++)
		{
			String linkText=alllinks.get(i).getText();
			Thread.sleep(5000);
			System.out.println(linkText);
		}
	}
}