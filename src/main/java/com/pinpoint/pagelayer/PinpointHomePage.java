package com.pinpoint.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinpointHomePage {
	
	public PinpointHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
@FindBy (xpath="//span[text()='Try for Free']")
private WebElement tryNow;

public void clickOntryNoWbtn() {
	tryNow.click();
}

}
