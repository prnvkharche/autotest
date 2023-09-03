package com.abc.commonfunctionality;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browserlaunch {

//}

//step 1= downlaod the respective driver---->chromedriver
//step 2= unzip the folder and copied that chromedriver.exe in main resources folder
//step 3= register the driver

public static void main(String[]args) {
	
	  //when want to run only one driver
    String browsername="CHROME";
    if(browsername.equalsIgnoreCase("chrome")) {
    	
    //register the driver---->System.setproperty
	
	System.setProperty("webdriver.crome.driver","C:\\Users\\Admin\\eclipse-workspace\\Mavenselenium\\src\\main\\resources\\chromedriver.exe");
    ChromeDriver chromedriver=new ChromeDriver();
    chromedriver.get("https://demoqa.com/text-box");
    System.out.println(chromedriver.getCurrentUrl());
    if(chromedriver.getTitle().equalsIgnoreCase("ToolsQA")) {
    	System.out.println("Browser launch successfully, Test step is pass");
    }else {
    	System.out.println("test step is failed");
    }
    System.out.println(chromedriver.getTitle());
    chromedriver.navigate().refresh();
    chromedriver.navigate().back();
    System.out.println(chromedriver.getPageSource());
    //chromedriver.close();
    }else if (browsername.equalsIgnoreCase("edge")) {
    //Launch the edge driver
    System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\eclipse-workspace\\Mavenselenium\\src\\main\\resources\\msedgedriver.exe");
    EdgeDriver obj1=new EdgeDriver();
    obj1.get("");
    
    
    
 
    
    
    
    
    

} 

}}