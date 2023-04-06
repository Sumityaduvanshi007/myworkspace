import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintAllLInkOnWebPage {
	public static void main(String [] args) {
		ToPrintAllLInkOnWebPage x= new ToPrintAllLInkOnWebPage();
		x.Link();
		
	}
	void Link() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumit yadav\\eclipse-workspace\\MyProject\\driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888");
		List<WebElement> var=driver.findElements(By.tagName("a"));
		System.out.println(var.size());
		for (WebElement webElement : var) {
			System.out.println(webElement.getAttribute("href"));
		}
	}
}
