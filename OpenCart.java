package own;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.id("input-username")).sendKeys("abilash1705");
		driver.findElement(By.id("input-firstname")).sendKeys("abilash");
		driver.findElement(By.id("input-lastname")).sendKeys("M");
		driver.findElement(By.id("input-email")).sendKeys("abiabilash627@gmail.com");
		driver.findElement(By.id("input-country")).click();
	WebElement country_id = driver.findElement(By.name("country_id"));
	
	Select dd1=new Select(country_id);
	dd1.selectByValue("99");
	
	driver.findElement(By.id("input-password")).sendKeys("abilash534");
	
	//driver.quit();
		
		
	}

}
