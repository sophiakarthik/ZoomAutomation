package com.nn.qa.util;

import com.nn.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	/*public static String TESTDATA_SHEET_PATH = "C:\\Users\\creat\\eclipse-workspace\\NumpyNinjaTutorial\\src\\main\\java\\com\\nn\\qa\\testdata\\datas.xlsx";
	static Workbook book;
	static Sheet sheet;
	//static JavascriptExecutor js;

	//public void switchToFrame() {
		//driver.switchTo().frame("mainpanel");
	//}

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				   System.out.println(data[i][k]);
			}
		}
		return data;*/
	}


