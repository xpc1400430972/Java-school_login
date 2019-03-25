package com.business;

import com.page.addclass;
import com.page.addtestpage;
import com.page.loginpage;
import com.util.loginutil;

public class loginbusiness extends addtestpage
{
	public void login() throws Exception
	{
		loginutil l=new loginutil();
		l.setUp();
	}
	public void loginnb() throws InterruptedException
	{
		loginpage page=new loginpage();
		page.openurl();
		page.setusername();
		page.selectlx();
		page.click();
	}
	public void add()
	{
		addtestpage a=new addtestpage();
		a.switchtoleft();
		a.xztk();
		a.switchtoright();
		a.sacnner();
	}
	public void newclass1()
	{
		addclass b=new addclass();
		b.fh();
		b.switchto();
		b.student();
		b.switchto1();
		b.newclass();
	}
}
