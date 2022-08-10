package sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ReadExcel;
import objectRepository.RegisterPage;

public class ReadingDtaFromExcel extends BaseClass {
	
	@Test(dataProvider = "test data", dataProviderClass =ReadExcel.class )
	public void readingData(String fn, String ln) {
		RegisterPage reg=new RegisterPage(driver);
		reg.getRegister().click();
		reg.getFirstName().sendKeys(fn);
		reg.getLastName().sendKeys(ln);
		reg.getRegButton().click();

	}

}
