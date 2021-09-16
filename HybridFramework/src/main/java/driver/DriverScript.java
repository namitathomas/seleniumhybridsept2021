package driver;
import org.json.simple.JSONObject;
import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentTest;

import keywords.ApplicationKeywords;
import util.Xls_Reader;

public class DriverScript {
	ApplicationKeywords app;
	JSONObject testData;
	ITestContext context;
	
	public DriverScript() {
		app = new ApplicationKeywords();
	}
	
	/*
	public static void main(String[] arg) {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		DriverScript ds = new DriverScript();
		ds.executeTest(xls, "TestCases", "CreatePortfolio");
		
	}
	*/
	
	public void executeTest(Xls_Reader xls, String sheet, String testName) {
		
		
		int rows = xls.getRowCount(sheet);
		
		for(int rNum=2;rNum<=rows;rNum++) {
			String tcid = xls.getCellData(sheet, "TCID", rNum);
			if(tcid.equalsIgnoreCase(testName)) {
				String keyword = xls.getCellData(sheet, "Keyword", rNum);
				String object = xls.getCellData(sheet, "Object", rNum);
				String dataKey = xls.getCellData(sheet, "Data", rNum);
				String data = (String)testData.get(dataKey);
				String storVal = xls.getCellData(sheet, "StorVal", rNum);
				String stop = xls.getCellData(sheet, "StopOnFailure", rNum);
				
				System.out.println(tcid+" -- "+keyword+" -- " +object+" -- "+dataKey+" -- "+data+" -- "+storVal);
				
				if(keyword.equals("click"))
					app.click(object);
				else if(keyword.equals("clear"))
					app.clear(object);
				else if(keyword.equals("type"))
					app.type(object,data);
				else if(keyword.equals("waitForPageToLoad"))
					app.waitForPageToLoad();
				else if(keyword.equals("waitForPageToLoad"))
					app.validateSelectedValueInDropDown(object,data);
				else if(keyword.equals("selectByVisibleText"))
					app.selectByVisibleText(object,data);
				else if(keyword.equals("acceptAlert"))
					app.acceptAlert();
				else if(keyword.equals("validateSelectedValueNotInDropDown"))
					app.validateSelectedValueNotInDropDown(object,data);
				else if(keyword.equals("findCurrentStockQuantity")) 
					app.findCurrentStockQuantity(data,storVal);
				else if(keyword.equals("wait"))
					app.wait(Integer.parseInt(dataKey));
				else if(keyword.equals("clickEnterButton"))
					app.clickEnterButton(object);
				else if(keyword.equals("selectDateFromCalendar")) {
					app.selectDateFromCalendar(data);
				}else if(keyword.equals("verifyStockPresent")) {
					app.verifyStockPresent(data);
				}else if(keyword.equals("findModifiedQuantity")) {
					app.findModifiedQuantity(testData,storVal);
				}else if(keyword.equals("verifyStockModification")) {
					app.verifyStockModification(object,testData,stop);
				}
				
			}
			
		}
	}

	public void setReport(ExtentTest test) {
		app.setReport(test);
	}

	public void defaultLogin(String browser) {
		app.openBrowser(browser);
        app.defaultLogin();		
		
	}

	public void quit() {
		if(app!=null)
			app.quit();
		
	}

	public void setTestData(JSONObject data) {
		testData=data;
		
	}

	public void log(String logMessage) {
		app.log(logMessage);
		
	}

	public void setTestContext(ITestContext context) {
		this.context=context;
		app.setTestContext(context);
		
	}

	

}
