package com.testcase;

import org.testng.annotations.Test;
import com.business.loginbusiness;

public class logintestcase
{
@Test
public void login() throws Exception
{
		loginbusiness l=new loginbusiness();
		l.login();
		l.loginnb();
		l.add();
		l.newclass1();
}
}
