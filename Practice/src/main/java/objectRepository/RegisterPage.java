package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class RegisterPage {
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Register") private WebElement register;
	@FindBy(id="gender-male") private WebElement radioBtton;
	@FindBy(id="FirstName") private WebElement firstName;
	@FindBy(id="LastName") private WebElement lastName;
	@FindBy(id="Email") private WebElement email;
	@FindBy(id="Password") private WebElement setPwd;
	@FindBy(id="ConfirmPassword") private WebElement cnfPwd;
	@FindBy(id="register-button") private WebElement regButton;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getRadioBtton() {
		return radioBtton;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getSetPwd() {
		return setPwd;
	}
	public WebElement getCnfPwd() {
		return cnfPwd;
	}
	public WebElement getRegButton() {
		return regButton;
	}

	

}
