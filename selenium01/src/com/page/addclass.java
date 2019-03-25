package com.page;

import org.openqa.selenium.By;

import com.util.loginutil;

public class addclass extends loginutil
{
	public void fh()
	{
		chrome.findElement(By.xpath("//*[@id=\"tm_lnk_back\"]")).click();
	}
	public void switchto()
	{
		  chrome.switchTo().defaultContent();
		  chrome.switchTo().frame("menu");
	}
	public void student()
	{
		chrome.findElement(By.linkText("学生管理")).click();
		chrome.findElement(By.linkText("班级管理")).click();
	}
	public void switchto1()
	{
		  chrome.switchTo().defaultContent();
		  chrome.switchTo().frame("main");
	}
	public void newclass()
	{
		chrome.findElement(By.linkText("新增班级")).click();
		chrome.findElement(By.name("b_name")).sendKeys("测试4班");
		chrome.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
}
