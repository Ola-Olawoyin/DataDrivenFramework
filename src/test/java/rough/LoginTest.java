package rough;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class LoginTest extends BaseTest {
	
	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "data")
	public void doLogin(String username, String password) {
		
		click("cookiesBtn_XPATH");
		type("email_ID", username);
		type("password_ID", password);
		click("logInBtn_XPATH");
		
	}
	
	
}
