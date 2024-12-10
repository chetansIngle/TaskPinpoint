package com.pinpoint.testlayer;

import org.testng.annotations.Test;

import com.pinpoint.pagelayer.PinpointHomePage;
import com.pinpoint.pagelayer.PinpointRegisterPage;
import com.pinpoint.testbase.TestbaseClass;

public class Registerusertestpage extends TestbaseClass{
	
	@Test
	public void verifyRegisterFun() {
		
		PinpointHomePage home = new PinpointHomePage(driver);
		home.clickOntryNoWbtn();
		PinpointRegisterPage reg = new PinpointRegisterPage(driver);
		reg.enterValidName("xyz");
		reg.enterValidCompany("chetan");
		reg.enterValidEmail("chetaningle@gmail.com");
		reg.clickOnCreateAccount();
		
	}
	
	

}
