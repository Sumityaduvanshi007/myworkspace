package Window_handle;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_rahul_sir {

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

		driver.findElement(By.linkText("Marketing")).click();

		driver.findElement(By.linkText("Accounts")).click();

		List<WebElement> AcNumber = driver.findElements(By.xpath("//td[contains(text(),'ACC')]"));
		TreeSet<String> AcNumberse = new TreeSet<String>();
		for (int i = 0; i < AcNumber.size(); i++)
		{
			WebElement objWeb = AcNumber.get(i);
			String getpricevalue = objWeb.getText();
			System.out.println(i + "= " + getpricevalue);
			AcNumberse.add(getpricevalue);
		}
		
		for (int i = 0; i < AcNumber.size(); i++)
		{
			WebElement objWeb = AcNumber.get(i);
			String getpricevalue = objWeb.getText();
			int count = 0 ; 
			for (String st : AcNumberse)
			{
				count++;
				if (count==(i+1)) {
				if (st.equals(getpricevalue)) {
					System.out.println(getpricevalue);
					System.out.println("pass");
				}
				else {
					System.out.println(st);
					System.out.println("Failed");
				}
				}
			}
		}
	}
}
