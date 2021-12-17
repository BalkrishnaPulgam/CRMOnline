package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.objectRepository.MarketingObjectRepo;
import com.utility.ActionUtility;

public class MarketingPage extends MarketingObjectRepo {
	WebDriver driver;
		
	public MarketingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void marketLink() {
		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(market).click().perform();
		 */
		ActionUtility.moveAndClickElement(market);
	}
	public void campaignLink() {
		cCampaign.click();
	}
	public void enterName(String text) {
		campaignName.sendKeys(text);
	}
	public void clickCreate() {
		createButton.click();
	}

}
