package new_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");

driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);

driver.findElement(By.linkText("Tools")).click();
Thread.sleep(4000);
driver.findElement(By.linkText("Documents")).click();

driver.findElement(By.xpath("//img[@title=\"Create Document...\"]")).click();

driver.findElement(By.xpath("//select[@name=\"filelocationtype\"]")).click();
driver.findElement(By.xpath("//option[@value=\"I\"]")).click();

driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\sumit yadav\\Desktop");


	}

}
