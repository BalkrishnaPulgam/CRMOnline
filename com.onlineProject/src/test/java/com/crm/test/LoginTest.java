package com.crm.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.base.BaseClass;
import com.crm.pages.LoginPage;
import com.crm.pages.ViewProfilePage;

public class LoginTest extends BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public ViewProfilePage vp;

	@BeforeMethod
	public void setup() {
		driver = initialization();
		lp = loadLoginPage();
		reportInit();

	}

	/*@AfterMethod
	public void tearDown() {
		driver.close();
	}*/

	@Test(priority = 1)
	public void ValidateTitle() {
		String title = lp.verifyBrowserTitle();
		Assert.assertEquals(title, "CRM Tech - Login");

	}

	@Test(priority = 2)
	public void verifyValidLogin() {
		vp = lp.verifyValidLogin(driver);

		// DriverUtility.waitForTitleVisible("CRM Tech - View Profile");

		Assert.assertEquals(driver.getTitle(), "CRM Tech - View Profile");
	}

}
