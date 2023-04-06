package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sumit yadav\\eclipse-workspace\\MyProject\\driver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
	 //   driver.switchTo().alert().dismiss();
//   	driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		 
		driver.get("https://automatenow.io/sandbox-automation-testing-practice-website/iframes/");
		
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'I am an iframe.')]")).getText());
		
		driver.switchTo().frame(0)	;
       
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers')]")).getText());	
        
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Support the Selenium Project')]")).getText());
        
		driver.switchTo().defaultContent();	
        
		System.err.println(driver.findElement(By.xpath("//a[@class=\"logo logo-left with-image   \"]")).getText());	
	}
}
