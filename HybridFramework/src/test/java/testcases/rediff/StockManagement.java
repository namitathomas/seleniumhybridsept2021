package testcases.rediff;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testbase.BaseTest;
import util.Xls_Reader;


public class StockManagement extends BaseTest{
	// Adds a fresh stock in the table
	@Test
	public void addNewStock(ITestContext context) {
		ds.log("Adding new Stock");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "AddNewStock");//pass the data
		
		
		

	}
	
	// sell or buy existing stock
	@Parameters ({"action"})
	@Test
	public void modifyStock(String action,ITestContext context) {
		
		
	}
	
	// checks if stock is present in the table
	@Test
	public void verifyStockPresent() {
		ds.log("Verifying Stock");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "VerifyStockPresent");//pass the data
	}
	
	// checks the stock quantity
	@Parameters ({"action"})
	@Test
	public void verifyStockQuantity(String action, ITestContext context) {
		ds.log("Verifying Stock Changed Quantity");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "VerifyStockQuantity");//pass the data
	}
	
	@Test
	public void verifyStockAvgBuyPrice() {
		
	}
	
	// verifies the transaction history
	@Parameters ({"action"})
	@Test
	public void verifyTransactionHistory(String action) {
		
	}
	

}
