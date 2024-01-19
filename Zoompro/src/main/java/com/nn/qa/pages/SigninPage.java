package com.nn.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nn.qa.base.TestBase;

public class SigninPage extends TestBase  {
	
	@FindBy(xpath ="//*[@id=\"app\"]/div/div[2]/div/div[1]/form/div[1]/div/div/label")
	WebElement emailid;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement emailid1;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[1]/form/div[2]/div/div/label")
	WebElement password;
		@FindBy(xpath="//*[@id=\"js_btn_login\"]/span")
	WebElement signbtn;
		@FindBy(xpath="2//*[@id=\"onetrust-banner-sdk\"]/div/div/div[1]/button")
WebElement cookies;
	//intialising the page objects8
			public SigninPage() {
				PageFactory.initElements(driver,this);
			}
			//Actions:
			 public String validateRegistertitle() {
				 return driver.getTitle();
			 }
			 public void cookiesclick() {
				 cookies.click();
			 }
			 public void EnterFirst() {
				 System.out.println("hello1");
				 emailid.click();
				 
				emailid1.sendKeys("sophiakarthik06@gmail.com");
				 System.out.println("hello2");
			 }
			 public void EnterPwd() {
				 password.click();
				 //password.sendKeys("Anushka@123");
				 System.out.println("hello3");
			 }
			
			 public void Signbtn() {
				signbtn.click();			 }
			 }
	
	
