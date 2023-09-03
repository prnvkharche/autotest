package com.abc.commonfunctionality;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertexample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome
		
	   //driver.navigate().to("https:demoqa.com/text-box");
	  Navigation p=driver.navigate();
	  p.to("https://demoqa.com/alerts");//optional
	   
	  driver.manage().window().maximize();
	  
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //old method
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement clickmebtn= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	  clickmebtn.click();
	
	 // Thread.sleep(6000);   //we pause our script for 6 second
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.alertIsPresent());
	  
	  Alert obj=driver.switchTo().alert();
	  obj.accept();
	  
		  
		
		

	}

}
