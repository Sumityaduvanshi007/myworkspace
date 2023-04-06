import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aw {

	public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumit yadav\\eclipse-workspace\\MyProject\\driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	WebElement webname = driver.findElement(By.name("user_name"));
	webname.clear();
	webname.sendKeys("admin");

	WebElement webpass = driver.findElement(By.name("user_password"));
	webpass.clear();
	webpass.sendKeys("admin");
	driver.findElement(By.name("Login")).click();
	driver.navigate().refresh();
	//driver.
//	river.findElement(By.xpath("//a[text()='Marketing']")).click();
//	WebElement sn =driver.findElement(By.xpath("//td[@class='searchAlph']"));
// 	for (int i=1; i<=26; i++) {
// 		sn =driver.findElement(By.xpath("//td[@class='searchAlph']"));
//		boolean asd=sn.isSelected();
//		if( asd=true) {
//			sn.click();
//		String str=	sn.getText();
//		System.out.println(str+"true");
//		}else {
//			System.out.println("false");
			
			
			
			
			
		//}
		
	//}
}

}
