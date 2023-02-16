package com.actitime.genericlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver = null ;
	
	@BeforeSuite
	public void beforeSuitMethod() {
		System.out.println("================@BeforeSuite executed========================");
	}
	
	@BeforeClass
	public void launchBrowser() throws Throwable {
		System.out.println("============launchBrowser========@BeforeClass executed=============");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@BeforeMethod
	public void loginApplication() throws Throwable {
		System.out.println("============loginApplication==========@BeforeMethod Executed===========");
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void logOutApplication() {
		
		System.out.println("============logOutApplication==========@AfterMethod Executed===========");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("============CloseBrowser========@AfterClass Executed=============");
		//driver.close();
	}
	
	
	}

}
