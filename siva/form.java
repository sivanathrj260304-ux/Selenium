package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jdk.internal.org.jline.terminal.MouseEvent.Button;

public class form {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		//To automate username
		
		WebElement uname=driver.findElement(By.id("name"));
		uname.sendKeys("Sivanath");
		
		//To automate email
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("siva@gmail.com");
		
		//To automate gender
		
		WebElement gender=driver.findElement(By.id("gender"));
		gender.click();
		
		//To Automate mobile digits
		
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
		mobile.sendKeys("9345405639");
		
		//To Automate date of birth
		
		WebElement birth=driver.findElement(By.xpath("//input[@id='dob']"));
		birth.sendKeys("26.03.2004");
		
		//To automate subjects
		
		WebElement subjects=driver.findElement(By.xpath("//input[@name='subjects']"));
		subjects.sendKeys("English");
		
		//To automate hobbies
		
		WebElement hobbies=driver.findElement(By.xpath("//input[@id='hobbies']"));
		hobbies.click();
		
		//To automate address
		
		WebElement address=driver.findElement(By.xpath("//textarea[@placeholder='Currend Address']"));
		address.sendKeys("147,durgacolony,thiruparakundram,madurai");
		
				
		WebElement state=driver.findElement(By.id("state"));
		Select selectstate =new Select(state);
		selectstate.selectByIndex(2);
		
		
		
		WebElement city=driver.findElement(By.name("city"));
		Select selectcity=new Select(city);
		selectcity.selectByValue("Lucknow");
		
	
		
		
		
	}

}
