import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duckduckgo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://duckduckgo.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(""));
		
	}

}
