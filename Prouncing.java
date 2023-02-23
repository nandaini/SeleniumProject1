package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prouncing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://webmath.com/");
		
		driver.manage().window().maximize();
		WebElement generalMath = driver.findElement(By.linkText("General Math"));
		generalMath.click();
		driver.findElement(By.linkText("Pronouncing")).click();
		WebElement lcm= driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/center[1]/p[1]/input[1]"));
		lcm.sendKeys("15");
		lcm.click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/center[1]/p[2]/input[1]")).click();
	
	}

}
