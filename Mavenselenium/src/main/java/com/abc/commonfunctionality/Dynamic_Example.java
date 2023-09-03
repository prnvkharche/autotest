package com.abc.commonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome
		
	   //driver.navigate().to("https:demoqa.com/text-box");
	  Navigation p=driver.navigate();
	  p.to("https://demoqa.com/select-menu");//optional
	   
	  driver.manage().window().maximize();
	  WebElement oldMenu=driver.findElement(By.xpath("//div[@id='withOptGroup']"));
	  oldMenu.click();
	  driver.findElement(By.id("react-select-2-option-1-0")).click();

	}

}
