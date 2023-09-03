package com.abc.commonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) {
		//register the driver
		
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launch the chrome
		
	   driver.navigate().to("https:demoqa.com/text-box");
	  Navigation p=driver.navigate();
	  p.to("https://demoqa.com/text-box");//optional
	   
	  driver.manage().window().maximize();
	   
	   //we will find the element and perform the operation
	   //8ways---->
	   WebElement fullNametxt=driver.findElement(By.id("userName"));
	   fullNametxt.sendKeys("Testing");
	   
	   
	   WebElement emailTxt=driver.findElement(By.xpath("//input[@type='email']"));
	   emailTxt.sendKeys("abc@text.com");
	   
	   
	   //WebElement currentaddresstxt=driver.findElement(By.xpath(")
	   
	   
	   driver.findElement(By.id("currentAddress")).sendKeys("Current Address1");  //method chaining
	   driver.findElement(By.id("permanentAddress")).sendKeys("Permanent Address1"); 
	   fullNametxt.clear();
	   fullNametxt.sendKeys("secondtext");
	   
	   WebElement fullNamelbl=driver.findElement(By.id("userName-label"));
	   WebElement submitbtn=driver.findElement(By.id("submit"));
	   
	   
	    submitbtn.getLocation().getY();
	  
	   System.out.println(fullNamelbl.isDisplayed());
	   System.out.println(fullNamelbl.getText());
	   
	   JavascriptExecutor exe= (JavascriptExecutor) driver;
	   
	   exe.executeScript("window.scrollBy(0,"+  submitbtn.getLocation().getY()  +")");
	   
	  // driver.executeScript("arguments[0].scrollintoview(),",submitbtn);
	   
	   
	   driver.findElement(By.id("submit")).click();
	    
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

	   
		

	}

}
