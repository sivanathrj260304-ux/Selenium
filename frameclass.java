package siva;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameclass {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement home=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[1]/a"));
		System.out.println(home.getText());
		driver.switchTo().frame("singleframe");
		WebElement input=driver.findElement(By.xpath("\"/html/body/section/div/div/div/input\""));
		input.sendKeys("hello");
		driver.switchTo().defaultContent();
		WebElement register=driver.findElement(By.xpath("\"//*[@id=\\\"header\\\"]/nav/div/div[2]/ul/li[2]/a\""));
		System.out.println(register.getText());
		
		
		
	}

}
