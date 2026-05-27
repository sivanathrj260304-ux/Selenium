package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class reliancedigital {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.name("login")).sendKeys("arul@gmail.com");
		
	}

}
