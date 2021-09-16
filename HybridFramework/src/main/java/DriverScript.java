import util.Xls_Reader;

public class DriverScript {
	
	public static void main(String[] arg) {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		DriverScript ds = new DriverScript();
		ds.executeTest(xls, "TestCases", "CreatePortfolio");
		
	}
	
	public void executeTest(Xls_Reader xls, String sheet, String testName) {
		
	}

}
