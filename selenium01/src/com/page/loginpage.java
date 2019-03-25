package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.util.loginutil;

	public class loginpage extends loginutil
	{
		public void openurl()
		{
		chrome.get(Url);	
		}
		//用户名输入
		public void setusername()
		{		  
			  //定位并输入帐号
			  chrome.findElement(By.name("username")).sendKeys("hujianming");
			  //定位并输入密码
			  chrome.findElement(By.name("userpass")).sendKeys("hujianming123");
		}
		//选择类型
		public void selectlx()
		{
			  //选择下拉框
			  WebElement a=chrome.findElement(By.name("usertype"));
			  Select s=new Select(a);
			  s.selectByVisibleText("管理员");
		}
		public void click() throws InterruptedException
		{
			  Thread.sleep(8000);
			  chrome.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
			  Thread.sleep(2000);
		}
} 
