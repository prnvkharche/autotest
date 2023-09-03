package com.abc.commonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class radiobutton {

	public static void main(String[] args) {
		//register the driver

		System.setProperty("Webdriver.edge.driver","C:\\Users\\Admin\\eclipse-workspace\\Tronsoftech\\drivers\\msedgedriver.exe");
		//		ChromeOptions options = new ChromeOptions();
		//		options.addArguments("--remote-allow-origins-*");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https:demoqa.com/text-box");
		Navigation p=driver.navigate();
		p.to("https://demoqa.com/radio-button");//optional
		driver.manage().window().maximize();
		WebElement yesRadioButton= driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yesRadioButton.click();

		 System.out.println(yesRadioButton.isSelected());


		  WebElement noRadioButton= driver.findElement(By.xpath("//input[@id='noRadio']"));
	  if(noRadioButton.isEnabled())  {
		  System.out.println("Test case is fail radio button is enable");
	  } else {
		  System.out.println("Test case is pass radio button is disable");
		    }
	} 

}
