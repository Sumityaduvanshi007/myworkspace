package new_package;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import javax.management.relation.InvalidRoleInfoException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class Flipkart_task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		List<WebElement> getprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		TreeSet<String> getpricese=new TreeSet<String>();
        for(int i=0;i< getprice.size();i++) {
        	WebElement objWeb =getprice.get(i);
        	String getpricevalue= objWeb.getText();
    	  System.out.println(i+"= "+getpricevalue);
    	  getpricese.add(getpricevalue);
        }
        for (String st : getpricese) {
			System.out.println(st);
		
        if (getprice.equals(getpricese)) {
        	System.out.println("pass");
        }
        else {
        	System.out.println("failed");
        }
        }
//		for (WebElement printprice : getprice) {
//			driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//			System.out.println(++i+""+printprice.getText());				
//		Set<WebElement> getpriceset =(Set<WebElement>) driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//		for (WebElement printpricese : getpriceset) {
//			System.out.println(printpricese.getText());
//		}
	}
	}
	

