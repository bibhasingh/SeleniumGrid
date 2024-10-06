package com.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AmazonOnGrid {
	WebDriver driver;
	
	@Parameters({"bname"})

	@Test
  public void testOnRemoteMachine(String bname) throws MalformedURLException, InterruptedException
  {
		if (bname.equals("chrome")) {
		ChromeOptions option =new ChromeOptions();
	WebDriver driver =new RemoteWebDriver(new URL ("http://localhost:4444"),option);
	} 
		else if (bname.equals("edge")) {
			EdgeOptions option =new EdgeOptions();
		WebDriver driver =new RemoteWebDriver(new URL ("http://localhost:4444"),option);
		} 
		else if (bname.equals("firefox")) {
			FirefoxOptions option =new FirefoxOptions();
		WebDriver driver =new RemoteWebDriver(new URL ("http://localhost:4444"),option);
		} 
	  
	  Thread.sleep(10000);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(30000);
	  System.out.println("Application title is:"+ driver.getTitle());
	  driver.quit();
	  
	  
  }
}
