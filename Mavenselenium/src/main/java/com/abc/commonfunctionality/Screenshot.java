package com.abc.commonfunctionality;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Mavenselenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome
		
	   driver.navigate().to("https://demoqa.com/tabs");
	  Navigation p=driver.navigate();
	  p.to("https://demoqa.com/tabs");//optional
	   
	  driver.manage().window().maximize();
	  
	 TakesScreenshot obj=(TakesScreenshot)driver;
	  Date dateobj=new Date();
	 System.out.println(dateobj);
	 SimpleDateFormat formatobj= new SimpleDateFormat("yyyMMddHHmmss");
	System.out.println(formatobj.format(dateobj));
	 File resultfile=obj.getScreenshotAs(OutputType.FILE);
	  File result=new File("C:\\Users\\Admin\\eclipse-workspace\\Mavenselenium\\Result\\"+dateobj+".png");
	   //FileUtils.copyFile(resultfile, result);
	   
	   
	  }

}
