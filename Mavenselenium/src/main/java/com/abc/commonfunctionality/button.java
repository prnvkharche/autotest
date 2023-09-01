package com.abc.commonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) {
		//register the driver
		
				System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver(); //launch the chrome
				
			   driver.navigate().to("https:demoqa.com/text-box");
			  Navigation p=driver.navigate();
			  p.to("https://demoqa.com/buttons");//optional
			   
			  driver.manage().window().maximize();
			 WebElement clickmebtn= driver.findElement(By.xpath("//button[text()='Click Me']"));
			  clickmebtn.click();
			  
			  
			  

	}

}
