package siva;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promtclass {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//prompt handling
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div[4]/div[2]/button")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("sivanath");
		Thread.sleep(5000);
		alert.accept();
		WebElement result=driver.findElement(By.xpath("//*[@id=\"promptResult\"]"));
		System.out.println(result.getText());
		
	}

}
