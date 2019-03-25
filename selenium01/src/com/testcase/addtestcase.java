package com.testcase;

import org.testng.annotations.Test;
import com.business.addbusiness;
import com.business.addclassbusiness;
import com.business.loginbusiness;

public class addtestcase
{
	@Test
	public void login() throws Exception
	{
			loginbusiness l=new loginbusiness();
			l.login();
			l.loginnb();
	}
	public void login1() throws Exception
	{
			addclassbusiness c=new addclassbusiness();
			c.newclass1();
	}
}
