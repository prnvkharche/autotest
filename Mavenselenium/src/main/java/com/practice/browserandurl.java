package com.practice;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browserandurl {

	public void LauchBowser(String browsername, String url) {
		if(browsername.equalsIgnoreCase("chrome")) {
			//register the driver
			System.out.println("webdriver.crome.driver\",\"C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Mavenselenium\\\\src\\\\main\\\\resources\\\\chromedriver.exe");
		
	 ChromeDriver driver= new ChromeDriver();
	 
	 driver.get(url); } else if (browsername.equalsIgnoreCase("edge")) {
		    //Launch the edge driver
		    System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\eclipse-workspace\\Mavenselenium\\src\\main\\resources\\msedgedriver.exe");
		    EdgeDriver obj1=new EdgeDriver();
		    obj1.get(url);
		    

		   
		    


		    
		
	 
			 }
	}}


