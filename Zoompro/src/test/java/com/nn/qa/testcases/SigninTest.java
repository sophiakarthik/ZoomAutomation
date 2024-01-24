  package com.nn.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nn.qa.base.TestBase;
import com.nn.qa.pages.SigninPage;
import com.nn.qa.util.LoggerLoad;

public class SigninTest extends TestBase {
	
	SigninPage signinpage;
	
	public SigninTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		init_prop();
		signinpage=new SigninPage();
		
	}	
	@Test
	public void VerifyRegisterTitleTest() {
	String SigninTitle=signinpage.validateRegistertitle();
	Assert.assertEquals(SigninTitle, "Sign In | Zoom");
    System.out.println("title is "+SigninTitle);
	}
	@Test
	public void firsttry(){
	    signinpage.cookiesclick();
	    LoggerLoad.info("-------Testing Info------");;
		System.out.println("hello");
		signinpage.EnterFirst();
		 //LoggerLoad.info("-------Testing Info------");
		System.out.println("hello");
		signinpage.EnterPwd();
		 //LoggerLoad.info("-------Testing Info------");
		signinpage.Signbtn();
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}
