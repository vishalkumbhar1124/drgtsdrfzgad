package com.Mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import com.Mystore.actiondriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static Properties prop;
	public static WebDriver driver;
	
	
		@BeforeTest
        public void loadConfig() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getenv("C:\\Users\\ASUS\\eclipse-workspace\\My_Store\\Configuration\\config.properties"));
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
}
//		public static WebDriver getDriver() {
//			// Get Driver from threadLocalmap
//			return driver.get();
//		}

		public static void launchApp() {

			WebDriverManager.chromedriver().setup();
			String browserName = prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("FireFox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}else if(browserName.equalsIgnoreCase("IE")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			Action.implicitWait(driver, 10);
			Action.pageLoadTimeOut(driver, 30);
			driver.get(prop.getProperty("url"));;
			
			
			
		}
} 