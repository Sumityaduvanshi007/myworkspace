package new_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColarVerify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");
		
		WebElement webname = driver.findElement(By.name("user_name"));
		webname.clear();
		webname.sendKeys("admin");

		WebElement webpass = driver.findElement(By.name("user_password"));
		webpass.clear();
		webpass.sendKeys("admin");
		
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
	String getColorOfElement=driver.findElement(By.xpath("//input[@value='Delete']")).getCssValue("background-color");
		
	String getColorOfText=driver.findElement(By.xpath("//input[@value='Delete']")).getCssValue("color");
	
	String color=Color.fromString(getColorOfElement).asHex();
	
	if(color.equals("#ff0000")) {
		System.out.println("Delete Button Color is Verified");
	}
	else {
		System.out.println("Delete Button Color is not Verified");
	}
String colorText=Color.fromString(getColorOfText).asHex();
	
	if(colorText.equals("#ffffff")) {
		System.out.println("Delete Text Color is Verified");
	}
	else {
		System.out.println("Delete Text Color is not Verified");
	}
	}

}
