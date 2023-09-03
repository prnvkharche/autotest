package com.abc.commonfunctionality;



import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public Practice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Mavenselenium\\src\\main\\resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/text-box");
		//driver.manage().window().maximize();
		Navigation p = driver.navigate();
		p.to("https://demoqa.com/text-box");
		driver.close();

	}

}
