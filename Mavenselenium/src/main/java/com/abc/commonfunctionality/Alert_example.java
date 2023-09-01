package com.abc.commonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver= new ChromeDriver(options);
		WebDriver driver=new ChromeDriver(); 
		driver.get("https:demoqa.com/text-box");//launch the chrome
		
//	   //driver.navigate().to("https:demoqa.com/text-box");
//	  Navigation p=driver.navigate();
//	  p.to("https://demoqa.com/alerts");//optional
//	   
//	  driver.manage().window().maximize();
//	 WebElement clickmebtn= driver.findElement(By.xpath("//button[@id='promtButton']"));
//	  clickmebtn.click();
//	  //Thread.sleep(3000);
//	 Alert obj=driver.switchTo().alert();
//	  obj.dismiss();
//	  
	}

}
