package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

public class addtestpage extends loginutil
{
	public void switchtoleft()
	{
		  chrome.switchTo().frame("menu");
	}
	public void xztk()
	{
		  chrome.findElement(By.linkText("题库管理")).click();
		  chrome.findElement(By.linkText("新增题库")).click();
	}
	public void switchtoright()
	{
		  chrome.switchTo().defaultContent();
		  chrome.switchTo().frame("main");
	}
	public void sacnner()
	{
		  chrome.findElement(By.name("d_name")).sendKeys("JAVA基础");
		  WebElement a=chrome.findElement(By.name("d_status"));
		  Select s=new Select(a);
		  s.selectByVisibleText("关闭");
		  chrome.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
}
