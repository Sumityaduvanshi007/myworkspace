package Discussion;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class_1 {

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
			driver.findElement(By.xpath("//select[@name='login_theme']"));
			for (int i = 0; i < ge.size(); i++) {
				WebElement text = ge.get(i);
			String	print=webd.getText();
			//System.out.println(print);}
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
//			Point loginbutten=  driver.findElement(By.name("Login")).getLocation();
//			loginbutten.x;
			driver.findElement(By.name("Login")).click();

     		
	}
	}
}
