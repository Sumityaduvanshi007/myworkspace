import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationexercise_com {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SumitYaduvanshi");
		driver.findElement(By.xpath("//div[@class='signup-form']//input[@name='email']")).sendKeys("xyz@123gmail");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//p[text()='Email Address already exist!']")).isDisplayed()) {
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("xyz@123gmail");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("pata nahi");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		}
		else {
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pata nahi");
		
		WebElement Date=driver.findElement(By.xpath("//select[@id='days']"));
	Select sl=	new Select(Date);
	sl.selectByValue("1");
	
	WebElement month=driver.findElement(By.xpath("//select[@name='months']"));
	Select slt=	new Select(month);
	slt.selectByValue("1");
	
	WebElement year=driver.findElement(By.xpath("//select[@name='years']"));
	Select sel=new Select(year);
	sel.selectByValue("2002");
	
	driver.findElement(By.xpath("//input[@id='newsletter']")).click();
	driver.findElement(By.xpath("//input[@id='optin']")).click();
	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Sumit");
	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("yaduvanshi");
	driver.findElement(By.xpath("//input[@id='company']")).sendKeys("TCs");
	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Chak gosai");
	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Mondh,Bhadohi");
	
	WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
	Select slct=new Select(country);
	slct.selectByVisibleText("Canada");
	 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("U.p");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bhadohi");
	driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("414122");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8853600583");
	driver.findElement(By.xpath("//button[text()='Create Account']")).click();
	driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		}
	}

}
