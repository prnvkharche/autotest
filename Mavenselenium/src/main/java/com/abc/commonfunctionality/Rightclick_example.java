package com.abc.commonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome
		
	   driver.navigate().to("https:demoqa.com/text-box");
	  Navigation p=driver.navigate();
	  p.to("https://demoqa.com/buttons");//optional
	   
	  driver.manage().window().maximize();
	  
	 WebElement clickmebtn= driver.findElement(By.id("rightClickBtn"));
	 
	 Actions act=new Actions(driver);
	 act.contextClick(clickmebtn).perform();
	}

}
