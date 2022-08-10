package genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadExcel {

//	public  static String read (int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException {
//	File file=new File("./Testdata/data.xlsx");
//	Workbook workbook=WorkbookFactory.create(file);
//	 String value = workbook.getSheet("Sheet1").getRow(row).getCell(cell).toString();
//	return value;
	@DataProvider(name="test data")
	public Object[][] data() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("./Testdata/data.xlsx");
		Workbook workbook = new WorkbookFactory().create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj = new Object[rowcount][cellcount];
		for (int row = 0; row < rowcount; row++) {
			Row actualRow = sheet.getRow(row);
			for (int cell = 0; cell < actualRow.getLastCellNum(); cell++) {
				obj[row][cell] = actualRow.getCell(cell).getStringCellValue();

			}
		}

		return obj;
	}

}
