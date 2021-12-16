package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.objectRepository.ActionsObjectRepo;

public class ActionsPage extends ActionsObjectRepo{
	WebDriver driver;

	public ActionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyTitle() {
		String actTitle = driver.getTitle();
		String expTitle = "CRM Tech - Actions";
		if (actTitle.equals(expTitle))
			return true;
		else
			return false;

	}
}
