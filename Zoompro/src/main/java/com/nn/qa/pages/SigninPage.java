package com.nn.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nn.qa.base.TestBase;

public class SigninPage extends TestBase  {
	

	@FindBy(id="email")
	WebElement emailid1;
	@FindBy(id="password")
	WebElement passwordtxtbx;
		@FindBy(xpath="//*[@id=\"js_btn_login\"]/span")
	WebElement signbtn;
		@FindBy(xpath="//button[@class='onetrust-close-btn-handler ot-close-icon banner-close-button']")
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
				 Actions action=new Actions(driver);
				 action.moveToElement(cookies).click().build().perform();
				/* JavascriptExecutor ex=(JavascriptExecutor)driver;
				 ex.executeScript("arguments[0].click()",cookies);*/
				 System.out.println("hello1");
				// cookies.click();
			 }
			 public void EnterFirst() {
				 Actions action=new Actions(driver);
				 action.moveToElement(emailid1).click().build().perform();
				 /*JavascriptExecutor ex=(JavascriptExecutor)driver;
				 ex.executeScript("arguments[0].click()",emailid1);*/
				 emailid1.sendKeys("sophiakarthik06@gmail.com");
				 System.out.println("hello2");
			 }
			 public void EnterPwd() {
				 Actions action=new Actions(driver);
				 action.moveToElement(passwordtxtbx).click().build().perform();
				 /*JavascriptExecutor ex=(JavascriptExecutor)driver;
				 ex.executeScript("arguments[0].click()",passwordtxtbx);*/
				 passwordtxtbx.sendKeys("Anushka@123");
				 System.out.println("hello3");
			 }
			
			 public void Signbtn() {
				signbtn.click();			 }
			 }
	
	
