package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DecimatoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://webmath.com/");
		
		driver.manage().window().maximize();
		WebElement generalMath = driver.findElement(By.linkText("General Math"));
		generalMath.click();
		driver.findElement(By.linkText("Fraction to Decimal")).click();
		WebElement div= driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/center[1]/pre[1]/input[1]"));
		div.sendKeys("15");
		div.click();
		WebElement dis= driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/center[1]/pre[1]/input[2]"));
		dis.sendKeys("15");
		dis.click();
		WebElement con= driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/center[1]/p[3]/input[1]"));
		con.sendKeys("3");
		con.click();
		
		driver.findElement(By.xpath("//input[@value='Convert it']")).click();
	}

}
