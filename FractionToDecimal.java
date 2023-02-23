package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FractionToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://webmath.com/");
		
		driver.manage().window().maximize();
		WebElement generalMath = driver.findElement(By.linkText("General Math"));
		generalMath.click();
		driver.findElement(By.linkText("Decimal to Fraction")).click();
		WebElement fac= driver.findElement(By.xpath("//input[@id='ftDecimalToFract']"));
		fac.sendKeys("15");
		fac.click();
		
	
		
		driver.findElement(By.xpath("//input[@value='Convert it']")).click();
	}

}
