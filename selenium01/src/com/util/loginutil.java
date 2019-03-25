package com.util;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

public class loginutil
{
	  public static WebDriver chrome;
	  public static String Url;
	  String title1;
	  @BeforeClass
	  public static void setUp() throws Exception 
	  {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	    chrome = new ChromeDriver();
//	    DesiredCapabilities a=DesiredCapabilities.chrome();
//	    WebDriver chrome=new RemoteWebDriver(new URL("http://192.168.193.1:5555/wd/hub"),a);
	    Url="http://localhost:8080/examsys/login.thtml";
	  }
}
