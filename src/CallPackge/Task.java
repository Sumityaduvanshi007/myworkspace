package CallPackge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.drover", "driver//chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");

}
}
