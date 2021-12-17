package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketingObjectRepo {
	
	@FindBy(linkText = "Marketing")
	public WebElement market;
	@FindBy(xpath="//span[text()='Create Campaign']")
	public WebElement cCampaign;
	@FindBy(xpath="//input[@id='Campaign_name']")
	public WebElement campaignName;
	@FindBy(xpath="//input[@id='save-button']")
	public WebElement createButton;

}
