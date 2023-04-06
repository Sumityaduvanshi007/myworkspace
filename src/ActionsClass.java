import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
  public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		
  WebElement webname = driver.findElement(By.name("user_name"));
	webname.clear();
	webname.sendKeys("admin");
	WebElement webpass = driver.findElement(By.name("user_password"));
	webpass.clear();
	webpass.sendKeys("admin");
	driver.findElement(By.name("Login")).click();
	Actions act	=new Actions(driver);
	WebElement holdElement=driver.findElement(By.xpath("//b[contains(text(),'Top Accounts')]"));
	WebElement releaseElement=driver.findElement(By.xpath("//b[contains(text(),'Top Invoices')]"));
	act.clickAndHold(holdElement).moveToElement(releaseElement).release().build().perform();
	act.sendKeys();
}
}
 