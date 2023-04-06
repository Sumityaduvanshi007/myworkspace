package Window_handle;

import java.util.List;

import javax.swing.Action;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ABC_1 {
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
		String textToType=driver.getPageSource();
//		System.out.println(textToType);
			
		driver.get("https://validator.w3.org/");
		driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href=\"#validate_by_input\"]")).click();
		driver.findElement(By.xpath("//textarea[@id=\"fragment\"]")).sendKeys("Sumit yaduvanshi ");
		driver.findElement(By.xpath("(//a[text()='Check'])[3]")).click();
	List<WebElement> error = driver.findElements(By.xpath("//strong[text()='Error']")); 
	for (WebElement errorprint : error) {
		
		System.out.println(errorprint.getText());
	}
		//		Actions act=new Actions(driver);
//		text.sendKeys();
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("arguments[0]value='"+textToType+"'", text);		
	}
}