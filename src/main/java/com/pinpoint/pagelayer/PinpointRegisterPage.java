package com.pinpoint.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinpointRegisterPage {


	public PinpointRegisterPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
@FindBy (xpath="//input[@placeholder='Name']")
private WebElement name;

@FindBy (xpath="//input[@placeholder='Company']")
private WebElement company;

@FindBy (xpath="//input[@placeholder='Email']")
private WebElement email;

@FindBy (xpath = "//button[text()='Create Account']")
private WebElement account;

public void enterValidName(String Name) {
	name.sendKeys(Name);
	
	}
public void enterValidCompany(String Companyname) {
	company.sendKeys(Companyname);
	
	}
public void enterValidEmail(String EmailId) {
	email.sendKeys(EmailId);
	
	}
public void clickOnCreateAccount() {
	account.click();
	
	}


}
