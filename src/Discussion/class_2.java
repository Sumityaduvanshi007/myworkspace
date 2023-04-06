package Discussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class class_2 {

	public static void main(String[] args) {
		// m();
		m1();
		//m2();
	}

	public static void m() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sumityadav221406@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sumit@007");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		String tital = driver.getTitle();
		System.out.println(tital);
	}

	public static void m1() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String s=RandomString.make(24);
		System.out.println(s);
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sumityadav221406@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sumit@_007");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		String error = driver
				.findElement(By.xpath(
						"//ul[@class='woocommerce-error']//li[text()=': the password you entered for the username ']"))
				.getText();
		System.out.println(error);
	}

	public static void m2() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sumityadav221406@gmail.");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sumit@_007");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		String error = driver
				.findElement(By.xpath(
						"//ul[@class='woocommerce-error']//li[text()=': the password you entered for the username ']"))
				.getText();
		System.out.println(error);
	}
}