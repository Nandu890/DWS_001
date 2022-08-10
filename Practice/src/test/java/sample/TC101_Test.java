package sample;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.RegisterPage;
import objectRepository.RegisterPage;

public class TC101_Test extends BaseClass {
	@Test
	private void registerPage() {
		RegisterPage reg=new RegisterPage(driver);
		reg.getRegister().click();
		reg.getFirstName().sendKeys("Goku");
		reg.getLastName().sendKeys("son");

	}

}
