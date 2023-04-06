//import java.awt.Dimension;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {// //td[@class='lvtCol']
// //td[@class='level2SelTab']//a[text()='Leads']// //td[contains(@class,'Selected')]// //td[contains(@class,'Tab')]
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
     
		driver.get("http://localhost:8888/");
		WebElement webname = driver.findElement(By.name("user_name"));
		webname.clear();
		webname.sendKeys("admin");

		WebElement webpass = driver.findElement(By.name("user_password"));
		webpass.clear();
		webpass.sendKeys("admin");
		
		WebElement webd = driver.findElement(By.xpath("//select[@name='login_theme']"));
		Select sel=new Select(webd); 
		List<WebElement> ge=sel.getOptions();
		for (int i = 0; i < ge.size(); i++) {
		WebElement text = ge.get(i);
		String	print=webd.getText();
		System.out.println(print);
		}
		sel.selectByIndex(1);
		Thread.sleep(3000);
	    sel.selectByValue("woodspice");
	    Thread.sleep(3000);
		sel.selectByVisibleText("bluelagoon");
		WebElement print= sel.getFirstSelectedOption();
		System.out.println(print);
		Dimension login = driver.findElement(By.name("Login")).getSize();
		int ht = login.getHeight();
		int wt = login.getWidth();
		System.out.println(ht + "," + wt);
		if (ht==40 & wt==138) {
			System.out.println("home page open");
		} else {
			System.out.println("home page not open");
		}
		driver.findElement(By.name("Login")).click();
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
//		driver.findElement(By.xpath("//a[text()='Support']")).click();
//		String mass =aa.getText();
//		System.out.println(mass);
//		driver.findElement(By.xpath("//img[@title='Open Calculator...']")).click();
//		driver.findElement(By.xpath("//div[@id='calc']//input[contains(@class,'calcResult')]")).sendKeys("7*8");
//		driver.findElement(By.xpath("//input[@value='7']")).click();
//		driver.findElement(By.xpath("//input[@value='+']")).click();
//		driver.findElement(By.xpath("//input[@value='8']")).click();
//		driver.findElement(By.xpath("//input[@value='=']")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
//
//		WebElement find = driver.findElement(By.name("campaignname"));
//		find.clear();
//		find.sendKeys("Sumit yaduvanshi");
//
//		driver.findElement(By.xpath("//input[@value='T']")).click();
//
//		WebElement send = driver.findElement(By.xpath("//input[@id='targetaudience']"));
//		send.clear();
//		send.sendKeys("Barmohani");
//
//		WebElement send1 = driver.findElement(By.xpath("//input[@name='sponsor']"));
//		send1.clear();
//		send1.sendKeys("mondh");
//
//		WebElement send2 = driver.findElement(By.id("numsent"));
//		send2.clear();
//		send2.sendKeys("2");
//
//		WebElement send3 = driver.findElement(By.name("campaign_no"));
//		send3.sendKeys("bhodahi");
//
//		WebElement send4 = driver.findElement(By.xpath("//input[@name='product_name']"));
//		send4.sendKeys("GoodDay");
//
//		WebElement send5 = driver.findElement(By.xpath("//input[@name='targetsize']"));
//		send5.sendKeys("7");
//
//		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	}
}