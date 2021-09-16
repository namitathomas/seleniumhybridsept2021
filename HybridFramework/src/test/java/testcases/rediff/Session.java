package testcases.rediff;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import keywords.ApplicationKeywords;
import testbase.BaseTest;

public class Session extends BaseTest{
	
	@Test
	public void doLogin(ITestContext context) {
	
		
	}
	
	@Test
	public void doLogout() {
		test.log(Status.INFO, "Logging out");
	}

}
