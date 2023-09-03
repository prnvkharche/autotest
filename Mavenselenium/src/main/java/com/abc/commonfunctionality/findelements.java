package com.abc.commonfunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
		//register the driver

		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome

		driver.navigate().to("https:demoqa.com/text-box");
		Navigation p=driver.navigate();
		p.to("https://demoqa.com/text-box");//optional

		driver.manage().window().maximize();

		List<WebElement> listofWebelements=driver.findElements(By.tagName("input"));

		System.out.println("No of elements"+listofWebelements.size());

	}

}
