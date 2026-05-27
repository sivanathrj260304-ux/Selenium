package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoform2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		//To automate username
		
		WebElement uname=driver.findElement(By.id("firstName"));
		uname.sendKeys("Arulganesh");
		
		//To automate email
		
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("arulga@gmail.com");
		
		//To automate gender
		
		WebElement gender=driver.findElement(By.name("gender"));
		gender.click();
		
		//To automate mobile
		
		WebElement mobile=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		mobile.sendKeys("7871923454");
		
		//To automate birth
		
		/*WebElement birth=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		birth.clear();
		birth.sendKeys("23.04.2005");*/
		
		//To automate subjects
		
		/*WebElement subjects=driver.findElement(By.xpath("//*[@id=\'subjectsContainer\']/div/div[1]"));
		subjects.sendKeys("english");*/
		
		//To automate hobbies
		
		WebElement hobbies=driver.findElement(By.xpath("//*[@id=\'subjects-label\']"));
		hobbies.click();
		
		//To automate address
		
		WebElement address=driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		address.sendKeys("166,sarawathicolony,thiruparakundram,madurai");
		
		//To automate state
		
		WebElement state=driver.findElement(By.id("state"));
		Select selectstate=new Select(state);
		selectstate.selectByIndex(2);
		
		
	}

}
