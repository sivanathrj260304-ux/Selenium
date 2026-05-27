package siva;
import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login{	

		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			WebElement uname=driver.findElement(By.id("username"));
			uname.sendKeys("Siva");
			WebElement pwd=driver.findElement(By.name("password"));
			pwd.sendKeys("abc123");
			WebElement button=driver.findElement(By.id("submit"));
			button.
		}

	}

