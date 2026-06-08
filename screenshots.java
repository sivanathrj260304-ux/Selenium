package siva;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots {
	public static void main(String[] args)throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Cast driver to TakesScreenshot and capture
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        
     // Save to local file
        
        File destfile=new File("screenshotsFB.png");
        FileUtils.copyFile(srcFile, destfile);
        
        //To get screenshot file location
        
        System.out.println("Screenshots saved as:" + destfile.getAbsolutePath());
        
        
	
		
	
	}

}
