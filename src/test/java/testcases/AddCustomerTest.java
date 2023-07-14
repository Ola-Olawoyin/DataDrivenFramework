package testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class AddCustomerTest extends BaseTest{
	
	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "data")
	public void addCustomer(String firstName, String lastName, String postCode) throws InterruptedException {
		
		click("addCustomerBtn_XPATH");
		type("firstName_XPATH", firstName);
		type("lastName_XPATH", lastName);
		type("postCode_XPATH", postCode);
		Thread.sleep(2000);
		click("addCustomer_XPATH");
		
		Alert alert = driver.switchTo().alert();
		
		Assert.assertTrue(alert.getText().contains("Customer added successfully"), "Customer not added successfully");
		alert.accept();
		
		
		
	}

}
