package testcases.rediff;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import driver.DriverScript;
import testbase.BaseTest;
import util.Xls_Reader;


public class PortfolioManagement extends BaseTest{
	
	@Test
	public void createPortfolio(ITestContext context) {
		//@Beforetest - init the data,launch browser and login, store in context - data,test,report,app
		//@Beforemethod- extract/init - data,test,report,app
		//@Test
		//@AfterTest-generate the reports
		
		ds.log("Starting to create a portfolio");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "CreatePortfolio");//pass the data
	}
	
	
	@Test
	public void deletePortfolio(ITestContext context) {
		ds.log("Deleteing a portfolio");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "DeletePortfolio");//pass the data
	}
	
	@Test
	public void selectPortFolio(ITestContext context) {
		ds.log("Selecting a portfolio");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "SelectPortFolio");//pass the data
		
	}

}
