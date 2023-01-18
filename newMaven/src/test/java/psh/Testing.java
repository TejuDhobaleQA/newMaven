package psh;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import PSH.BaseClass;
import PSH.Login;
import PSH.Register;
import net.bytebuddy.utility.RandomString;

public class Testing  {
	WebDriver driver;
	Login l;
	Register r;

	
	@Parameters("browser")
	
	@BeforeTest
	public void beforeTest(String Browser) {
		System.out.println("beforeTest");
		if(Browser.equalsIgnoreCase("Chrome")) {
		driver=BaseClass.ChromeBrowser();
			
		
	}
		if(Browser.equalsIgnoreCase("Edge")) {
		driver=BaseClass.EdgeBrowser();
			
	}
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
		// driver = BaseClass.ChromeBrowser();
		driver.get("https://www.planetsuperheroes.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		System.out.println("before method");
		l=new Login(driver);
		r=new Register(driver);
		
		Actions a=new Actions(driver);
		a.moveToElement(l.Log()).build().perform();
		Thread.sleep(1000);
		a.click(l.signup()).build().perform();
		
	}
	@Test
	public void test() throws IOException {
		System.out.println("test 1");
		r.click();
		r.SendKey();
		r.create();
		String W = driver.getTitle();
		
		if(W.equals("New Customer Registration")) {
			System.out.println("Test1 Case Pass");
		}
		else {
			String SS = RandomString.make();
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File desc=new File("C:\\Users\\Tejashri\\Desktop\\Selenium\\SS\\Test " +SS+ ".jpg");
			FileHandler.copy(src, desc);
		}
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
		driver.navigate().back();
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
		l=null;
		r=null;

	}
	@AfterTest
	public void aftertest() {
		System.out.println("afterclass");
		driver.close();
		driver=null;
		System.gc();
	}
}
