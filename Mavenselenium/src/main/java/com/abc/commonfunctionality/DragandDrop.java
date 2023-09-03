package com.abc.commonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome
		
	   driver.navigate().to("https:demoqa.com/text-box");
	  Navigation p=driver.navigate();
	  p.to("https://demoqa.com/droppable");//optional
	   
	  driver.manage().window().maximize();
	 WebElement src= driver.findElement(By.id("draggable"));
	 
	 WebElement target= driver.findElement(By.id("droppable"));
	 
	 Actions act= new Actions(driver);
	 act.dragAndDrop(src, target).perform();
	 
	 
	 

	}

}
