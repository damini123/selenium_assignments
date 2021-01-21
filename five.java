package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class five
{
	public static void main(String[] args)
	{
		five assignment = new five();
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
		driver.get("http://www.snapdeal.com");
	}
	
	public void Login()
	{
		// TODO Auto-generated method stub
		driver.findElement(By.className("accountUserName col-xs-12 reset-padding")).click();
	}

}
