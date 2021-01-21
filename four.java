package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class four
{
	public static void main(String[] args)
	{
		four assignment = new four();
		assignment.LaunchBrowser();
		assignment.Login();
		assignment.PrintResult();
		assignment.PrintNthProduct();
		assignment.PrintAllProducts();
		//assignment.PrintAllWithScroll();
	}

	FirefoxDriver driver;
	
	public void LaunchBrowser()
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "//D:/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	
	public void Login()
	{
		// TODO Auto-generated method stub
		driver.findElement(By.id("gh-ac")).sendKeys("Apple watch");
		Select category = new Select(driver.findElement(By.id("gh-cat")));
		category.selectByVisibleText("Consumer Electronics");
		driver.findElement(By.id("gh-btn")).click();
	}

	public void PrintResult()
	{
		String result = driver.findElement(By.className("srp-controls__count-heading")).getText();
		System.out.println("Result: "+result);
	}

	public void PrintNthProduct()
	{
		String xpathex = resultNth(10);
		String nth = driver.findElement(By.xpath(xpathex)).getText();
		System.out.println(nth);
	}

	static String resultNth(int prNum)
	{
		String xpathex = String.format("//div[@class=\"srp-river-results clearfix\"]/ul/li[%d]", prNum);
		return xpathex;
	}
	
	public void PrintAllProducts()
	{
		
	}
}