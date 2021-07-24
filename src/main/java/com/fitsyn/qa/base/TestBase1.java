package com.fitsyn.qa.base;


import java.io.File;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestBase1 {
	
	public static  WebDriver driver;
 public static Properties pro;
	
	

public  static void initialization() throws Exception {
// 	File src=new File("./src/main/java/com/fitsyn/qa/config/config.properties");
// 	FileInputStream fis=new FileInputStream(src);
// 	Properties pro=new  Properties();
// 	pro=new Properties();
// 	pro.load(fis);
	System.setProperty("webdriver.chrome.driver","/usr/bin/chromdedriver"); 
	driver=new ChromeDriver();
	  driver.get("https://demo.fitsyn.com" +18.117*.152+ ":" + 8080 + "/wd/hub");
			Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]/input")).sendKeys("admin@uat.com");
//		driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("fitsyn@wcg");//action
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div/label/span[1]/input")).click();//action
//		driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();//action}
	}

public static void setIntialization() throws Exception {
// 	File src=new File("./src/main/java/com/fitsyn/qa/config/config.properties");
// 	FileInputStream fis=new FileInputStream(src);
// 	Properties pro=new  Properties();
// 	pro=new Properties();
// 	pro.load(fis);
// String filepath="/Fitsyn/CSVFile";
// HashMap<String,Object> chromepref=new HashMap<String,Object>();
// chromepref.put("profile.default_content_setting.popups",0);
// chromepref.put("download.default_directory",filepath);
ChromeOptions options=new ChromeOptions();
	options.addArguments("headless");
// options.setExperimentalOption("prefs",chromepref);
System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver_linux64"); 
  driver=new ChromeDriver(options);
driver.get("https://demo.fitsyn.com" +18.117*.152+ ":" + 8080 + "/wd/hub");
Thread.sleep(5000);
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]/input")).sendKeys("admin@uat.com");
//driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("fitsyn@wcg");//action
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div/label/span[1]/input")).click();//action
//driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();//action}
}
}

