package com.abc.commonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	public static void main(String[] args) {
		//register the driver
		
				System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver(); //launch the chrome
				
			   driver.navigate().to("https:demoqa.com/text-box");
			  Navigation p=driver.navigate();
			  p.to("https://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=Cj0KCQiAkMGcBhCSARIsAIW6d0AwU6chIBNVCl_TjlDcNNNVvz-LyVeRJRvA4r4Y-mKgLg6J6xGgJdYaAu5eEALw_wcB");//optional
			   
			  driver.manage().window().maximize();
			  WebElement username=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
			  username.sendKeys("123545");
			  if(username.getAttribute("value").length()>0) {
				  System.out.println("User is able to enter the mobile number");
			  } else {
				  System.out.println("User is unable to enter the mobile number");
			  }
			  }
			  

	}         


