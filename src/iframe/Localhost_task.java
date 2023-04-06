package iframe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Localhost_task {
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
	
	Dimension login = driver.findElement(By.name("Login")).getSize();
	int ht = login.getHeight();
	int wt = login.getWidth();
	System.out.println(ht + "," + wt);
	if (ht==40 & wt==138) {
		System.out.println("home page open");
	} else {
		System.out.println("home page not open");//  //body[@class='cke_show_borders']
	}
	driver.findElement(By.name("Login")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Marketing")).click();
	driver.findElement(By.linkText("Documents")).click();
	driver.findElement(By.xpath("//img[@alt=\"Create Document...\"]")).click();
WebElement	web=driver.findElement(By.xpath("//iframe[@allowtransparency=\"true\"]"));
	driver.switchTo().frame(web);
	
	//driver.findElement(By.name("//td[@id='cke_contents_notecontent']")).sendKeys("hi i am sumit ");
    
}
}
