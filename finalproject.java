package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class finalproject {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		//To get parent window
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//To search the products
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("shoes");
		search.submit();
		
		//To click the brands
		Thread.sleep(5000);
		WebElement brands=driver.findElement(By.xpath("//*[@id=\"p_123/256097\"]/span/a/span"));
		brands.click();
		Thread.sleep(5000);
		
		//To click the price
		Thread.sleep(5000);
		WebElement price=driver.findElement(By.xpath("//*[@id=\"p_36/dynamic-picker-1\"]/span/a/span"));
		price.click();
		Thread.sleep(5000);
		
		//To click colour
		Thread.sleep(5000);
		WebElement colour=driver.findElement(By.xpath("//*[@id=\"p_n_size_two_browse-vebin/2022299031\"]/span/a/div"));
		colour.click();
		
		//To click the product
		Thread.sleep(5000);
		WebElement product=driver.findElement(By.xpath("//*[@id=\"f299d6ae-fa1b-4f4b-90a6-b7866d0ead7a\"]/div/div/div/div/span/div/div/div[1]"));
		product.click();
		Thread.sleep(5000);
		
	
		
		
		
	}
	

}
