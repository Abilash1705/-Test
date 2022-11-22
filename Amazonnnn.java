package own;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonnnn {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		java.util.List<WebElement> mob = driver.findElements(By.xpath("//span[@class='a-price']//span[@class='a-price-whole']"));
		System.out.println(mob.size());
		
		for (int i = 0; i < mob.size(); i++) {
			 String Value=mob.get(i).getText();
			 System.out.println(Value);
		}
	}
	}

