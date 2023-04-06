package input;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountDetails {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");
		WebElement webname = driver.findElement(By.name("user_name"));
		webname.clear();
		webname.sendKeys("admin");

		WebElement webpass = driver.findElement(By.name("user_password"));
		webpass.clear();
		webpass.sendKeys("admin", Keys.ENTER);
		driver.findElement(By.linkText("Sales")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		WebElement account = driver
				.findElement(By.xpath("//td[contains(@onmouseover,'vtlib_listview')]//parent::tr//parent::tbody"));
		String str = account.getText();
		System.out.println(str);

		Thread.sleep(2000);

	}

}
