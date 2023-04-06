package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Java_Script_Practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sumit yadav\\eclipse-workspace\\MyProject\\driver\\chromedriver.exe");
        ChromeOptions choption=new ChromeOptions();
        choption.addArguments("incognito");
        choption.addArguments("headless");
        choption.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		// driver.get("http://AutomationPractice.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin", Keys.ENTER);
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Documents")).click();
 //	driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();		
		
//		System.out.println(driver.findElement(By.xpath("//div[@id=\"searchAcc\"]//form//table//tbody//tr//td//span[@class=\"moduleName\"]")).getText());
//
//		System.out.println(driver.findElement(By.xpath("//div[@id=\"OutgoingCall\"]//following-sibling::table//tbody//tr//td[@class=\"moduleName\"]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//a[@class=\"hdrLink\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//a[@class=\"hdrLink\"]")).getText());
        driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys("module one");
        new Select(driver.findElement(By.xpath("//div[@id=\"basicsearchcolumns_real\"]//select[@id=\"bas_searchfield\"]"))).selectByVisibleText("File Name");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		
//		WebElement getxt = driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
//		System.out.println(getxt.getText());

		
		// driver.findElement(By.linkText("Add to cart")).click();

		// driver.findElement(By.xpath("//a[@data-id-product='2']")).click();

	}

}
