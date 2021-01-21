package com.selenium.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class seven
{
	public static void main(String[] args)
	{
		seven assignment = new seven();
		assignment.LaunchBrowser();
		assignment.Login();
	}

	FirefoxDriver driver;

	public void LaunchBrowser()
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "//D:/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
	}
	
	public void Login()
	{
		// TODO Auto-generated method stub
		//driver.findElementByXPath("//div[@class='_2IX_2- VJZDxU']//form//input[@type='text']").sendKeys("sonatiwari123@live.com");
	}
}