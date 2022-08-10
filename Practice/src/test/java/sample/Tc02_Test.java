package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc02_Test {
	@Test
	public static void main() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.outnorth.com/");
	driver.findElement(By.xpath("//button[text()='Accept all']")).click();
	driver.findElement(By.id("close_cookie_info")).click();
	driver.findElement(By.id("login")).click();

}
}
