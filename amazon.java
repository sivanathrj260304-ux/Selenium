package siva;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
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
		
		Thread.sleep(5000);
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[5]/div/a"));
		mobile.click();
		Thread.sleep(3000);
		
		//To get mobile accessories
		
		Thread.sleep(5000);
		WebElement accessories=driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[3]/span/a/span"));
		accessories.click();
		
		//To get one plus
		
		Thread.sleep(5000);
		WebElement oneplus=driver.findElement(By.xpath("//*[@id=\"grid-row-1-col-0\"]/div/div/a/img"));
		oneplus.click();
		
		//To buy product
		
		Thread.sleep(5000);
		WebElement buynow=driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"));
		buynow.click();
		
		//To get email
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]"));
		email.sendKeys("sivanathrj260304@gmail.com");
		
		//To navigate next page
		
		Thread.sleep(5000);
		WebElement contin=driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input"));
		contin.click();
		
		//To create password
		
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		password.sendKeys("Siva@2004");
		
		//To get sign in
		
		Thread.sleep(3000);
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
		signin.click();
		
		
		
		
		
		
	}

}
