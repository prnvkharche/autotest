package com.abc.commonfunctionality;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {

	public static void main(String[] args) {

		//register the driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Mavenselenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome

		driver.get("https://demoqa.com/checkbox");
		WebElement Homecheckbox=driver.findElement(By.xpath("//label[@for='tree-node-home']"));
		Homecheckbox.click();

		List<WebElement> result=driver.findElements(By.xpath("//div[@id='result']"));
		if(result.size()>0)  {
			System.out.println("user is able to select the checkbox");
		}else {
			System.out.println("user is unable to select the checkbox");  
		}

		WebElement Commandcheckbox=driver.findElement(By.xpath("//label[@for='tree-node-commands']"));
		Commandcheckbox.click();
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//label[@for='tree-node-home']/preceding-sibling::button"));
		button.click(); 
		WebDriverWait waitobj= new WebDriverWait(driver, Duration.ofSeconds(10));

		final WebElement Desktopcheckbox=driver.findElement(By.xpath("//label[@for='tree-node-desktop']"));
		waitobj.until(ExpectedConditions.elementToBeClickable(Desktopcheckbox));

		waitobj.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return Desktopcheckbox.isDisplayed();
			}

		});

	}
	// Desktopcheckbox.click();



};








