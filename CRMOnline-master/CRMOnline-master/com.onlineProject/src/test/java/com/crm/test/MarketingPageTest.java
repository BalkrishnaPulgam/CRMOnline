package com.crm.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.crm.pages.MarketingPage;

public class MarketingPageTest extends BaseClass {
	
	public WebDriver driver;
	public MarketingPage mp;
	
	
	@BeforeMethod
	public void setup() {
		driver = initialization();
		reportInit();

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

		@Test
	public void marketModule() {
	    mp = new MarketingPage(driver);
		mp.marketLink();
		
	}
		@Test
	public void campaignModule() {
		mp.campaignLink();
	}
		@Test
		public void campName() {
			mp.enterName("New Campaign");
		}
		@Test
		public void cButton() {
			mp.clickCreate();
		}

}
