package testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class OpenAccountTest extends BaseTest {

	@Test(dataProviderClass = DataUtil.class, dataProvider = "data")
	public void openAccount(String customer, String currency) {
		click("openAccountBtn_XPATH");
		select("customerName_XPATH",customer);
		select("currency_XPATH",currency);
		click("processBtn_XPATH");
		
      Alert alert = driver.switchTo().alert();
		
		Assert.assertTrue(alert.getText().contains("Account created successfully"), "Account not created successfully");
		alert.accept();
		
	}

}
