package com.abc.commonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launch the chrome
		
	   //driver.navigate().to("https:demoqa.com/text-box");
	  Navigation p=driver.navigate();
	  p.to("https://demoqa.com/select-menu");//optional
	   
	  driver.manage().window().maximize();
	  WebElement oldmenu=driver.findElement(By.id("oldSelectMenu"));
	  Select obj=new Select(oldmenu);
	// obj.selectByIndex(3);
	 // obj.selectByVisibleText("Black");
	  obj.selectByValue("Red");
	  

	}

	
	}

	
	

