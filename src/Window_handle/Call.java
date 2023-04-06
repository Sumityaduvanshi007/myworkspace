package Window_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Call {
public static void main(String[] args) {
	
}
public static WebDriver luachlocalhost(String url) {
	System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("url");
	WebElement webname = driver.findElement(By.name("user_name"));
	webname.clear();
	webname.sendKeys("admin");
	WebElement webpass = driver.findElement(By.name("user_password"));
	webpass.clear();
	webpass.sendKeys("admin");
	driver.findElement(By.name("Login")).click();
	return driver;
}

public static WebDriver luach(String browser) {
System.setProperty("webdriver.browser.driver", "driver//chromedriver.exe");
WebDriver driver = new ChromeDriver();
return driver;
}
}