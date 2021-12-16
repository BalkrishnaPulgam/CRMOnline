package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewProfilePageObjectRepo {
	
	@FindBy(xpath = "//span[text()='More']")
	public WebElement moreTab;

	@FindBy(xpath = "//ul[@class='open']//a[text()='Actions']")
	public WebElement actionLink;
	
}
