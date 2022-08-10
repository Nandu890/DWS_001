package sample;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepository.RegisterPage;
@Listeners(genericUtilities.DemoItestListener.class)
public class TC_DWS_01_Test extends BaseClass {
	@Test
public void Validate_whether_user_can_Register_through_valid_credentials() throws IOException {
	RegisterPage reg=new RegisterPage(driver);
	UtilityClass utility=new UtilityClass();
	
	reg.getRegister().click();
	Reporter.log("Clicked on Register Link",true);
	String ExpectedTitle=driver.getTitle();
	
	reg.getFirstName().sendKeys(utility.propertyFileReader("Firstname"));
	assertEquals(utility.propertyFileReader("Firstname"), reg.getFirstName().getAttribute("value"), "Firstname is not proper");
	Reporter.log("Succesfully entered Firstname",true);
	assertEquals(true, false);
	
	reg.getLastName().sendKeys(utility.propertyFileReader("Lastname"));
	assertEquals(utility.propertyFileReader("Lastname"), reg.getLastName().getAttribute("value"), "Lastname is not proper");
	Reporter.log("Succesfully entered Lastname",true);
	
	reg.getEmail().sendKeys(utility.propertyFileReader("Email"));
	assertEquals(utility.propertyFileReader("Email"), reg.getEmail().getAttribute("value"), "Email addres is not proper");
	Reporter.log("Succesfully entered email adderss",true);
	
	reg.getSetPwd().sendKeys(utility.propertyFileReader("Password"));
	assertEquals(utility.propertyFileReader("Password"), reg.getSetPwd().getAttribute("value"), "Password is not proper");
	Reporter.log("Succesfully entered Password",true);
	
	reg.getCnfPwd().sendKeys(utility.propertyFileReader("CNFPassword"));
	assertEquals(utility.propertyFileReader("CNFPassword"), reg.getSetPwd().getAttribute("value"), "Confirm Password is not proper");
	Reporter.log("Succesfully entered Confirm Password",true);
	
	reg.getRegButton().click();
	Reporter.log("Succesfully Registered in to the application",true);
	assertEquals(ExpectedTitle, driver.getTitle(),"Test case Passed");
}
}
