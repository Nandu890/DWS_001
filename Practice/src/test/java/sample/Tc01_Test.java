package sample;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtilities.ReadExcel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc01_Test {
	@Test
	public static void main1() throws EncryptedDocumentException, InvalidFormatException, IOException {
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////	driver.get("https://www.opencart.com/index.php?route=cms/demo");
////	driver.findElement(By.xpath("(//a[text()='Login'])[2]")).click();
	ReadExcel rd= new ReadExcel();
	String username = rd.read(3, 0);
	System.out.println(username);
}
}
   