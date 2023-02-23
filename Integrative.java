package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Integrative{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://webmath.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//option[contains(text(),'Calculus, Integration')]")).click();
	driver.findElement(By.name("s")).sendKeys("2x");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
