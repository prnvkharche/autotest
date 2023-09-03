package com.abc.commonfunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	ChromeDriver driver;
	
	@BeforeSuite
	public void LaunchBrowser() {
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver=new ChromeDriver(); //launch the chrome
		
	  driver.navigate().to("https://www.saucedemo.com/");
	  Navigation p=driver.navigate();
	  p.to("https://www.saucedemo.com/");//optional
	  driver.manage().window().maximize();
	 
		
		
	}
	
	 
    @Test(description="Verify that user is able to login with valid credential",priority=0)
	public void TC1()   {

    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
	}
    
    @Test(description="Verify that user is unable to login with valid credential",priority=1)
	public void TC2()   {

    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
	}
    @BeforeMethod
    public void preconditon() {  //i will run before each @test method
    	//System.out.println("I am before method");
    	
    List<WebElement> menuBtn=driver.findElements(By.id("react-burger-menu-btn"));
    if(menuBtn.size()>0)
    	menuBtn.get(0).click();
    driver.findElement(By.id("logout_sidebar_link")).click();
    }
   
	@AfterSuite
	public void CloseBrowser()  {
		
		//driver.quit();
		
	}
}
