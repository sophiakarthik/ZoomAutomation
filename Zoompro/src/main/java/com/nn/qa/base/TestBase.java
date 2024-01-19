package com.nn.qa.base;

//import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.nn.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
public TestBase() {
	
	try {
		prop=new Properties();
		FileInputStream ip= new FileInputStream( "./src/main/java/com/nn/qa/config/config.properties");
        prop.load(ip);	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	//return prop;	
}

public static void init_prop() {
String browserName=prop.getProperty("browser");	
 	if (browserName.equals("chrome")) {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	} else if (browserName.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	} 
 	 else if (browserName.equals("edge")) {
 		WebDriverManager.edgedriver().setup();		
 		driver=new EdgeDriver();
	} 
	  else {
		System.out.println("Please pass the correct browser value: " + browserName);
	}

	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));


}
}
