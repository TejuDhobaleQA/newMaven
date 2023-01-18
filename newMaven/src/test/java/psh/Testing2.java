package psh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PSH.BaseClass;
import PSH.Login;
import PSH.Register;

public class Testing2 {
	
	//https://www.planetsuperheroes.com/edit-profile
	public class Testing  {
		WebDriver driver;
		Login l;
		Register r;

		@BeforeClass
		public void beforeclass() {
			System.out.println("before class");
			 driver = BaseClass.ChromeBrowser();
			driver.get("https://www.planetsuperheroes.com/edit-profile");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		}
		@BeforeMethod
		public void beforemethod() throws InterruptedException {
			System.out.println("before method");
			
			
		}
		@Test
		public void test() {
			System.out.println("test 1");
			
		}
		@Test
		public void test2() {
			System.out.println("test 2");
		}
		@AfterMethod
		public void aftermethod() {
			System.out.println("After method");
			
		}
		@AfterClass
		public void afterclass() {
			System.out.println("After class");
			driver.close();
		}
	}
}
