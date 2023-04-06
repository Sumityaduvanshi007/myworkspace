package Discussion;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify {

	public static void main(String[] args) {
		// M();
		// M1();
		// M2();
		// M3();

	}

	public static void M() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");

		WebElement A = driver.findElement(By.xpath("//td[text()='User Name']"));
		boolean webname = A.isDisplayed();
		boolean webnamepage = true;
		if (webname == webnamepage) {
			System.out.println("User Name is Displayed");
		} else {
			System.out.println("User Name is not Displayed");
		}
		boolean web = A.isEnabled();
		boolean webpage = true;
		if (web == webpage) {
			System.out.println("User Name is Enabled");
		} else {
			System.out.println("User Name is not Enabled");
		}
		WebElement B = driver.findElement(By.xpath("//td[text()='Password']"));
		boolean webpass = B.isDisplayed();
		boolean webpasspage = true;
		if (webpass == webpasspage) {
			System.out.println("password is Displayed");
		} else {
			System.out.println("password is not Displayed");
		}
		boolean webp = B.isEnabled();
		boolean webppage = true;
		if (webp == webppage) {
			System.out.println("password is isEnabled");
		} else {
			System.out.println("password is not isEnabled");
		}

		WebElement C = driver.findElement(By.xpath("//td[text()='Color Theme']"));
		boolean webd = C.isDisplayed();
		boolean webdpage = true;
		if (webd == webdpage) {
			System.out.println("Color Theme is Displayed");
		} else {
			System.out.println("Color Theme is not Displayed");
		}
		boolean webda = C.isEnabled();
		boolean webdpagea = true;
		if (webda == webdpagea) {
			System.out.println("Color Theme is isEnabled");
		} else {
			System.out.println("Color Theme is not isEnabled");
		}

		WebElement D = driver.findElement(By.xpath("//td[text()='Language']"));
		boolean Language = D.isDisplayed();
		boolean Languagepage = true;
		if (Language == Languagepage) {
			System.out.println(" Language is Displayed");
		} else {
			System.out.println("Language is not Displayed");
		}
		boolean Languages = D.isEnabled();
		boolean Languagepages = true;
		if (Languages == Languagepages) {
			System.out.println(" Language is isEnabled");
		} else {
			System.out.println("Language is not isEnabled");
		}
		WebElement E = driver.findElement(By.name("Login"));
		boolean login = E.isDisplayed();
		boolean loginpage = true;
		if (login == loginpage) {
			System.out.println("login button is Displayed");

		} else {
			System.out.println("login button is not Displayed");
		}
		boolean logi = E.isEnabled();
		boolean loginpag = true;
		if (logi == loginpag) {
			System.out.println("login button is isEnabled");

		} else {
			System.out.println("login button is not isEnabled");
		}
	}

	public static void M1() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");
		WebElement webname = driver.findElement(By.name("user_name"));
		webname.sendKeys("admin");
		String actualTextofUserUserName = webname.getAttribute("value");
		if (actualTextofUserUserName.equals("admin")) {
			System.out.println("valid UserName");
		} else {
			System.out.println("invalid");
		}
		WebElement webpass = driver.findElement(By.name("user_password"));
		webpass.sendKeys("admin");
		String actualTextofUserPassword = webpass.getAttribute("value");
		if (actualTextofUserPassword.equals("admin")) {
			System.out.println("valid password");
		} else {
			System.out.println("invalid");
		}

	}

	public static void M3() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");
		WebElement webname = driver.findElement(By.name("user_name"));
		webname.sendKeys("admi");

		WebElement webpass = driver.findElement(By.name("user_password"));
		webpass.sendKeys("admi");

		driver.findElement(By.name("Login")).click();
		System.out.println(driver.findElement(By.xpath("//font[contains(text(),'username and password')]")).getText());
	}
	public static void M2() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");
		WebElement webname = driver.findElement(By.name("user_name"));
		webname.sendKeys("admin");

		WebElement webpass = driver.findElement(By.name("user_password"));
		webpass.sendKeys("admin");

		driver.findElement(By.name("Login")).click();

		String exTitle = "admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";

		String actTitle = driver.getTitle();
		if (exTitle.equals(actTitle)) {
			System.out.println(
					"Test case is passed the user has been logged in succesfully   and home Page  is appeared where actual homepage is   ");
		} else {
			System.out.println("Text case fall");
		}

	}
}