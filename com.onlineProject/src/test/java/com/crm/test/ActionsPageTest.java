package com.crm.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.crm.pages.ActionsPage;

public class ActionsPageTest extends BaseClass {
	
	WebDriver driver;

	public ActionsPage ap;

	@BeforeSuite
	public void setUp() {
		driver = initialization();
		ap = new ActionsPage(driver);
		log.info("Driver is initialised");
		log.info("Login Page is Displayed");
		reportInit();
	}

	@AfterSuite
	public void closebrswer() {
		driver.close();
		log.info("Driver closed");
	}
	@Test
	public void verfiyTitle(){
		
	}
	@Test
	public void verfiyTitle1(){
		
	}
	@Test
	public void verfiyTitle2(){
		
	}
	@Test
	public void verfiyTitle4(){
		
	}
	@Test
	public void verfiyTitle5(){
		
	}
	
}
