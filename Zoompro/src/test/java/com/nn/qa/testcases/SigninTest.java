  package com.nn.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nn.qa.base.TestBase;
import com.nn.qa.pages.SigninPage;

public class SigninTest extends TestBase {
	
	SigninPage signinpage;
	
	public SigninTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		init_prop();
		signinpage=new SigninPage();
		
		//registerpage= homepage.Acc();       //     registerpage=new RegisterPage();
											//     homepage.Acc();
	}	
	@Test
	public void VerifyRegisterTitleTest() {
	String SigninTitle=signinpage.validateRegistertitle();
	Assert.assertEquals(SigninTitle, "Sign In | Zoom");
    System.out.println("title is "+SigninTitle);
	}
	@Test
	public void firsttry() {
		signinpage.cookiesclick();
		System.out.println("hello");
		signinpage.EnterFirst();
		signinpage.EnterPwd();
		signinpage.Signbtn();
	}
		
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
