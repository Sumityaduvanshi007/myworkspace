package CallPackge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Atomet {

//	public Atomet(int a) {
//		System.out.println(a);
//	}

	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sumit yadav\\eclipse-workspace\\MyProject\\driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//driver.get();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!610367319760!e!!g!!%E0%A4%AB%E0%A5%8D%E0%A4%B2%E0%A4%BF%E0%A4%AA%E0%A4%95%E0%A4%BE%E0%A4%B0%E0%A5%8D%E0%A4%9F&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_hindi_nc_goog&gclid");
		
//		 ChromeDriver driver1= new ChromeDriver();
//		WebElement we= driver1.findElement(By.xpath("//input[@name='user_username']"));
	  
		
		
	}

//	public static void main(String[]args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\sumit yadav\\eclipse-workspace\\MyProject\\driver\\chromedriver.exe");
//		ChromeDriver var = new ChromeDriver();
//		var.get("http://youtube.com");
//
//		var.findElement(By.xpath("//input[@id='search'] ")).sendKeys("kesariya tera ishq haipiya ");
//		 var.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
//
//		Thread.sleep(5000);
//		 var.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();


//		WebElement Weusername = var.findElement(By.name("user_name"));
//		Weusername.sendKeys("admin");
//		// Weusername.clear();
//		// Weusername.sendKeys("admin");
//
//		WebElement Weuserpass = var.findElement(By.name("user_password"));
//		Weuserpass.clear();
//		Weuserpass.sendKeys("adminn");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(5000);
//
//		WebElement Weusernamee = var.findElement(By.name("user_name"));
//		// Weusernamee.sendKeys("admi");
//		// Weusernamee.clear();
//		Weusernamee.sendKeys("admin");
//
//		WebElement Weuserpas = var.findElement(By.name("user_password"));
//		Weuserpas.clear();
//		Weuserpas.sendKeys("admi");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weusernam = var.findElement(By.name("user_name"));
//		Weusernam.sendKeys("admi");
//		Weusernam.clear();
//		Weusernam.sendKeys("admi");
//
//		WebElement Weuserpa = var.findElement(By.name("user_password"));
//		Weuserpa.clear();
//		Weuserpa.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weuserna = var.findElement(By.name("user_name"));
//		Weuserna.sendKeys("admi");
//		Weuserna.clear();
//		Weuserna.sendKeys("admin");
//
//		WebElement Weuserpasse = var.findElement(By.name("user_password"));
//		Weuserpasse.clear();
//		Weuserpasse.sendKeys("   ");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weusernames = var.findElement(By.name("user_name"));
//		Weusernames.sendKeys("admi");
//		Weusernames.clear();
//		Weusernames.sendKeys("    ");
//
//		WebElement Weuserpassd = var.findElement(By.name("user_password"));
//		Weuserpassd.clear();
//		Weuserpassd.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weusername1 = var.findElement(By.name("user_name"));
//		Weusername1.sendKeys("admi");
//		Weusername1.clear();
//		Weusername1.sendKeys("adminn");
//
//		WebElement Weuserpass1 = var.findElement(By.name("user_password"));
//		Weuserpass1.clear();
//		Weuserpass1.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weusernamem = var.findElement(By.name("user_name"));
//		Weusernamem.sendKeys("admi");
//		Weusernamem.clear();
//		Weusernamem.sendKeys("admin");
//
//		WebElement Weuserpassa = var.findElement(By.name("user_password"));
//		Weuserpassa.clear();
//		Weuserpassa.sendKeys("1234");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weusernamae = var.findElement(By.name("user_name"));
//		Weusernamae.sendKeys("admi");
//		Weusernamae.clear();
//		Weusernamae.sendKeys("1234");
//
//		WebElement Weuserpasas = var.findElement(By.name("user_password"));
//		Weuserpasas.clear();
//		Weuserpasas.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weusernaame = var.findElement(By.name("user_name"));
//		Weusernaame.sendKeys("admi");
//		Weusernaame.clear();
//		Weusernaame.sendKeys("admi123");
//
//		WebElement Weuserpaass = var.findElement(By.name("user_password"));
//		Weuserpaass.clear();
//		Weuserpaass.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weuseraname = var.findElement(By.name("user_name"));
//		Weuseraname.sendKeys("admi");
//		Weuseraname.clear();
//		Weuseraname.sendKeys("admin");
//
//		WebElement Weuserapass = var.findElement(By.name("user_password"));
//		Weuserapass.clear();
//		Weuserapass.sendKeys("admin123");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weuserename = var.findElement(By.name("user_name"));
//		Weuserename.sendKeys("admi");
//		Weuserename.clear();
//		Weuserename.sendKeys("adm123");
//
//		WebElement Weuserpeass = var.findElement(By.name("user_password"));
//		Weuserpeass.clear();
//		Weuserpeass.sendKeys("ad123");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weusersname = var.findElement(By.name("user_name"));
//		Weusersname.sendKeys("admi");
//		Weusersname.clear();
//		Weusersname.sendKeys("ad12345");
//
//		WebElement Weuseerpass = var.findElement(By.name("user_password"));
//		Weuseerpass.clear();
//		Weuseerpass.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weusearname = var.findElement(By.name("user_name"));
//		Weusearname.sendKeys("admi");
//		Weusearname.clear();
//		Weusearname.sendKeys("admin");
//
//		WebElement Weauserpass = var.findElement(By.name("user_password"));
//		Weauserpass.clear();
//		Weauserpass.sendKeys("ad12345");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Wesusername = var.findElement(By.name("user_name"));
//		Wesusername.sendKeys("admi");
//		Wesusername.clear();
//		Wesusername.sendKeys("admin@");
//
//		WebElement Wemuserpass = var.findElement(By.name("user_password"));
//		Wemuserpass.clear();
//		Wemuserpass.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Wenusername = var.findElement(By.name("user_name"));
//		Wenusername.sendKeys("admi");
//		Wenusername.clear();
//		Wenusername.sendKeys("admin@11");
//
//		WebElement Weuaserpass = var.findElement(By.name("user_password"));
//		Weuaserpass.clear();
//		Weuaserpass.sendKeys("admin@");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement b = var.findElement(By.name("user_name"));
//		b.sendKeys("admi");
//		b.clear();
//		b.sendKeys("adm@123");
//
//		WebElement Weuhsrpass = var.findElement(By.name("user_password"));
//		Weuhsrpass.clear();
//		Weuhsrpass.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement ff = var.findElement(By.name("user_name"));
//		ff.sendKeys("admi");
//		ff.clear();
//		ff.sendKeys("admin");
//
//		WebElement Weuerpass = var.findElement(By.name("user_password"));
//		Weuerpass.clear();
//		Weuerpass.sendKeys("admin#123");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement gg = var.findElement(By.name("user_name"));
//		gg.sendKeys("admi");
//		gg.clear();
//		gg.sendKeys("admin#$12");
//
//		WebElement sss = var.findElement(By.name("user_password"));
//		sss.clear();
//		sss.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement jj = var.findElement(By.name("user_name"));
//		jj.sendKeys("admi");
//		jj.clear();
//		jj.sendKeys("admin");
//
//		WebElement kk = var.findElement(By.name("user_password"));
//		kk.clear();
//		kk.sendKeys("admin#$12");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement dd = var.findElement(By.name("user_name"));
//		dd.sendKeys("admi");
//		dd.clear();
//		dd.sendKeys("admin@@12");
//
//		WebElement hhhh = var.findElement(By.name("user_password"));
//		hhhh.clear();
//		hhhh.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement ww = var.findElement(By.name("user_name"));
//		ww.sendKeys("admi");
//		ww.clear();
//		ww.sendKeys("admin!!@12");
//
//		WebElement ll = var.findElement(By.name("user_password"));
//		ll.clear();
//		ll.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement mmm = var.findElement(By.name("user_name"));
//		mmm.sendKeys("admi");
//		mmm.clear();
//		mmm.sendKeys("admin@#$");
//
//		WebElement ee = var.findElement(By.name("user_password"));
//		ee.clear();
//		ee.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement qq = var.findElement(By.name("user_name"));
//		qq.sendKeys("admi");
//		qq.clear();
//		qq.sendKeys("admin@#$123");
//
//		WebElement sa = var.findElement(By.name("user_password"));
//		sa.clear();
//		sa.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement da = var.findElement(By.name("user_name"));
//		da.sendKeys("admi");
//		da.clear();
//		da.sendKeys("admin");
//
//		WebElement fdd = var.findElement(By.name("user_password"));
//		fdd.clear();
//		fdd.sendKeys("admin!!");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement ddd = var.findElement(By.name("user_name"));
//		ddd.sendKeys("admi");
//		ddd.clear();
//		ddd.sendKeys("admin");
//
//		WebElement eww = var.findElement(By.name("user_password"));
//		eww.clear();
//		eww.sendKeys("admin@#");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement ass = var.findElement(By.name("user_name"));
//		ass.sendKeys("admi");
//		ass.clear();
//		ass.sendKeys("admin");
//
//		WebElement sads = var.findElement(By.name("user_password"));
//		sads.clear();
//		sads.sendKeys("admin@@");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement dsd = var.findElement(By.name("user_name"));
//		dsd.sendKeys("admi");
//		dsd.clear();
//		dsd.sendKeys("admin");
//
//		WebElement dad = var.findElement(By.name("user_password"));
//		dad.clear();
//		dad.sendKeys("admin##");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement fdf = var.findElement(By.name("user_name"));
//		fdf.sendKeys("admi");
//		fdf.clear();
//		fdf.sendKeys("admin");
//
//		WebElement ffff = var.findElement(By.name("user_password"));
//		ffff.clear();
//		ffff.sendKeys("admin@#12");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement vf = var.findElement(By.name("user_name"));
//		vf.sendKeys("admi");
//		vf.clear();
//		vf.sendKeys("admin");
//
//		WebElement fv = var.findElement(By.name("user_password"));
//		fv.clear();
//		fv.sendKeys("admin@#$123");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement bv = var.findElement(By.name("user_name"));
//		bv.sendKeys("admi");
//		bv.clear();
//		bv.sendKeys("admin");
//
//		WebElement vb = var.findElement(By.name("user_password"));
//		vb.clear();
//		vb.sendKeys("admin@#1122");
//
//		var.findElement(By.name("Login")).click();
//
//		Thread.sleep(3000);
//
//		WebElement Weuserffname = var.findElement(By.name("user_name"));
//		Weuserffname.sendKeys("admi");
//		Weuserffname.clear();
//		Weuserffname.sendKeys("admin");
//
//		WebElement Weusertpass = var.findElement(By.name("user_password"));
//		Weusertpass.clear();
//		Weusertpass.sendKeys("admin$#2211");
//
//		var.findElement(By.name("Login")).click();
//
//		WebElement webname = var.findElement(By.name("user_name"));
//		webname.sendKeys("admi");
//		webname.clear();
//		webname.sendKeys("admin");
//
//		WebElement Webpass = var.findElement(By.name("user_password"));
//		Webpass.clear();
//		Webpass.sendKeys("admin");
//
//		var.findElement(By.name("Login")).click();
//
//		var.findElement(By.xpath("//a[text()='Marketing']")).click();
//
//		var.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
//
//		WebElement find = var.findElement(By.xpath("//input[@class='detailedViewTextBox']"));
//		find.clear();
//		find.sendKeys("Sumityadav");
//
//		var.findElement(By.xpath("//input[@value='T']")).click();
	}


