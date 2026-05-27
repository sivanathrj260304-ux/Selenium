package siva;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		//To get the URL
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		//To navigate to nextpage
		
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		//To navigate to nextpage
		
		driver.navigate().to("https://www.uiic.co.in/web/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		//To navigate to next page
		
		driver.navigate().to("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		//To return previous page
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		//To forward the page
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		//To refresh the page
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}
}
