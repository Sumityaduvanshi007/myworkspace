package new_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scroll {
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
//	Actions gActions = new Actions(driver);
//	driver.switchTo().
	WebElement webd = driver.findElement(By.xpath("//select[@name='login_theme']"));
	Select sel=new Select(webd); 
	List<WebElement> ge=sel.getOptions();
	for (int i = 0; i < ge.size(); i++) {
	WebElement text = ge.get(i);
	java.lang.String	print=webd.getText();
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
		System.out.println("home page not open");
	}
	driver.findElement(By.name("Login")).click();
	
	   JavascriptExecutor jsobj=(JavascriptExecutor)driver;
	   jsobj.executeScript("window.scrollBy(0,600)"," ");
	
	   
	   WebElement scroll=driver.findElement(By.xpath("//b[contains(text(),'My Recent FAQs')]"));
	   jsobj.executeScript("arguments[0].scrollIntoView();",scroll);
	   Thread.sleep(4000);
	   jsobj.executeScript("arguments[0].click();",scroll);
	   
	   jsobj.executeScript("arguments[0].value='admin';",scroll);
	   
	
	
}
}
