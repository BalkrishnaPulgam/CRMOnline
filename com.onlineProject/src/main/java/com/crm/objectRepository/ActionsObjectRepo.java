package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionsObjectRepo {
	@FindBy(xpath = "//span[text()='More']")
	public WebElement moreTab;

	@FindBy(xpath = "//ul[@class='open']//a[text()='Actions']")
	public WebElement actionLink;

	@FindBy(xpath = "//a[@title='Clear Filters']")
	public WebElement clearFilter;

	@FindBy(xpath = "//a[@title='Columns']")
	public WebElement columns;

	@FindBy(xpath = "//a[@title='Auto-resize columns']")
	public WebElement autoResizeColumn;

	@FindBy(xpath = "//a[text()='Switch to List']")
	public WebElement switchToList;

	@FindBy(xpath ="//div[@class='portlet-content']//a[text()='All My Actions']")
	public WebElement allMyActionsLink;

	@FindBy(xpath = "//div[@class='portlet-content']//a[text()='Create Action']")
	public WebElement createActionLink;
	
	@FindBy(xpath = "//select[@id='dropdown-show-actions']")
	public WebElement showActionsDropDown;
	
	@FindBy(xpath = "//tr//td[10]")
	public WebElement completeList;
	
	@FindBy(xpath = "//tr//td[11]")
	public WebElement assignedTo;
	
	@FindBy(xpath = "yjtdyutdyu")
	public WebElement das5;
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "dyutyu")
	public List<WebElement> d7;
}
