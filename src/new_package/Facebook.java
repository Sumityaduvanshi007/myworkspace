package new_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:/www.Facebook.com");
		JavascriptExecutor jsobj = (JavascriptExecutor) driver;
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		jsobj.executeScript("arguments[0].value='8853600583';", user);
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		jsobj.executeScript("arguments[0].value='Sumit@007';", pass);
		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
		jsobj.executeScript("arguments[0].click();", click);
	}

}
