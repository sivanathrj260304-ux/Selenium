package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testformdemo {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://vinothqaacademy.com/demo-site/");
		
		//To automate username
		
		WebElement username=driver.findElement(By.xpath("//input[@id='vfb-5']"));
		username.sendKeys("manikanden");
		
		//TO automate Lname
		
		WebElement Lname=driver.findElement(By.xpath("//*[@id=\"vfb-7\"]"));
		Lname.sendKeys("MK");
		
		//To automate gender
		
		WebElement gender=driver.findElement(By.xpath("//*[@id=\"item-vfb-31\"]/div/span[1]/label"));
		gender.click();
		
		//To automate course
		
		WebElement course=driver.findElement(By.xpath("//*[@id=\"item-vfb-20\"]/div/span[2]/label"));
		course.sendKeys("java");
		
		//To automate address
		
		WebElement address=driver.findElement(By.xpath("//input[@id='vfb-13-address']"));
		address.sendKeys("114 kaithari nagar,thirupur madurai");
		
		//To automate street
		
		WebElement street=driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]"));
		street.sendKeys("3rd street");
		
		//To automate city
		
		WebElement city=driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]"));
		city.sendKeys("thirupur");
		
		//To automate state
		
		WebElement state=driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]"));
		state.sendKeys("Tamilnadu");
		
		//To automate zip
		
		WebElement zip=driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]"));
		zip.sendKeys("625005");
		
		//To automate country
		
		WebElement country=driver.findElement(By.id("country"));
		Select selectcountry=new Select(country);
		selectcountry.selectByIndex(6);
		
		//To automate email
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"vfb-14\"]"));
		email.sendKeys("mani@gmail.com");
		
		//To automate Dod
		
		WebElement dod=driver.findElement(By.xpath("//*[@id=\"vfb-18\"]"));
		dod.sendKeys("05.28.2026");
		
		
		
		
		
		
		
	}

}
