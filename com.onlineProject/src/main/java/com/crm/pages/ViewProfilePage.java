package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.objectRepository.ViewProfilePageObjectRepo;
import com.utility.ActionUtility;
import com.utility.DriverUtility;


public class ViewProfilePage  extends ViewProfilePageObjectRepo{
	WebDriver driver;
	public ViewProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ActionsPage navigateToActionsPage(WebDriver driver) {
		ActionUtility.moveAndClickElement(moreTab);
		DriverUtility.elementToBeClickable(actionLink);
		actionLink.click();
		return new ActionsPage(driver);
	}
	
	

}
