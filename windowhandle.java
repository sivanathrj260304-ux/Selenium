package siva;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//get the parent window
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.manage().window().maximize();
		
		//To get the parent window name
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		//TO switch to next window triggering button
		
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]")).click();
		
		//To get the address of all window
		
		Set<String> allwindow=driver.getWindowHandles();
		System.out.println(allwindow);
		
		//To know the driver status
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//To switch to child window
		
		List<String> list=new ArrayList<String>(allwindow);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/div/header/div[3]/a")).click();
		
		Set<String> allwindow1=driver.getWindowHandles();
		System.out.println(allwindow1);
		
		list.clear();
		System.out.println(list);
		list.addAll(allwindow1);
		System.out.println(list);
		
		driver.switchTo().window(list.get(2));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/header/div/div[2]/a[4]")).click();
		
		 // To close the child windows
        for (String close : allwindow1) {
       	 //if(!close.equals(parentwindow))
       	 
       		 driver.switchTo().window(close);
       		 driver.close();
       	 
        }
		
		
	}

}
