package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class samsung {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.samsung.com/");
		driver.findElement(By.name("search")).sendKeys("samsung galaxy s23");
		
	}

}
