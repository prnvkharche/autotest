package com.abc.commonfunctionality;

//import java.util.Set;
//import java.util.logging.Handler;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtab_example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome
		
	   //driver.navigate().to("https:demoqa.com/text-box");
	  Navigation p=driver.navigate();
	  p.to("https://demoqa.com/browser-windows");//optional
	   
	 /* driver.manage().window().maximize();
	  String parentwindow=driver.getWindowHandle();
	  driver.findElement(By.id("tabButton")).click();
	  Set <String> windowhandles=driver.getWindowHandles();
	  Iterator<String> iterator= windowhandles.iterator();
	 
	     while(iterator.hasnext())  {
		 String handler=iterator.next();
		 if(Handler.equalsIgnoreCase(parentWindow))  {
			 driver.switchTo().window(handler);
			 
		 }
	 }*/
		 // driver.switch
	 System.out.println(driver.findElement(By.id("samplwHeading")).getText());
	  

	}

}
