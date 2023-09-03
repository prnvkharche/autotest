package com.abc.commonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome
		
	  // driver.navigate().to("https:demoqa.com/text-box");
	  Navigation p=driver.navigate();
	  p.to("https://demoqa.com/frames");//optional
	   
	  driver.manage().window().maximize();
	  WebElement frame=driver.findElement((By.xpath("//iframe[@id='frame1'][@src='/sample']")));
	  driver.switchTo().frame(frame);
	  System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
	  

	}

}
