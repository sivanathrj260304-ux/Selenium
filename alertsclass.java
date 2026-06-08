package siva;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsclass {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//simple Alerts
		
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button")).click();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.accept();
		
		//confirmation alerts
		
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button")).click();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.accept();
		
	}

}
