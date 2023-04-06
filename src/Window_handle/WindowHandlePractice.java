package Window_handle;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePractice {

	
//	public static void main(int[] args) {
//		//S
//		Set<String> set= new LinkedHashSet();
//		set.add("Roshan");//qwertyu
//		set.add("Devansh");//qwertyu12345
//		set.add("Mohan");//asdfghjkl;
//		set.add("Roshan");//qwertyu
//		for (String string : set) {
//			
//		}
//		System.out.println(set);
//
//	}
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://flipkart.com");
		
		int a=driver.getWindowHandles().size();
		System.out.println(a);
		String vtIgerhndlvalue=	driver.getWindowHandle();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		driver.findElement(By.xpath("//a[text()='About Us']")).click();
	
		
		WebDriver driver1= driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://flipkart.com");
		String flikartHandlvalue=driver.getWindowHandle();
		driver.switchTo().window(flikartHandlvalue);
		
		
		
		Set<String> ss=driver.getWindowHandles();
		
		for (String hndlValue : ss) {
		
			
			driver.switchTo().window(hndlValue);
			String getTitle=driver.getCurrentUrl();
			if(!getTitle.equalsIgnoreCase("url")) {
				driver.quit();
			}

	 

	}

}
}
