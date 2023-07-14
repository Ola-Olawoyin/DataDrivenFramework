package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class BankManagerLoginTest extends BaseTest {
	
	@Test
	public void loginAsBankManager() {
		
		click("bankMangerLoginBtn_XPATH");
		
		Assert.assertTrue(isElementPresent("addCustomerBtn_XPATH"), "Bank Manager Login Failed");
	
		
	}
	
	
	
	

}
