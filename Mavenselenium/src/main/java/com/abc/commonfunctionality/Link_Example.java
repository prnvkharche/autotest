package com.abc.commonfunctionality;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class Link_Example {

	public static void main(String[] args) {
		//register the driver
		
		System.setProperty("Webdriver.edge.driver","C:\\Users\\Admin\\eclipse-workspace\\Mavenselenium\\drivers\\msedgedriver.exe");
		//		ChromeOptions options = new ChromeOptions();
		//		options.addArguments("--remote-allow-origins-*");
		WebDriver driver=new EdgeDriver();
	 // driver.navigate().to("https:demoqa.com/text-box");
	  Navigation p=driver.navigate();
	  p.to("https://demoqa.com/links");//optional
	  driver.manage().window().maximize();
	  
	  WebElement homelink=driver.findElement(By.linkText("Home"));
	  homelink.click();
	  
	  
	 
	 
	  

	}

}
