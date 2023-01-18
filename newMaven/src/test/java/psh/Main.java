package psh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Tejashri\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.planetsuperheroes.com/");
		
		WebElement a = driver.findElement(By.xpath("//div[@class='d-flex flex-column mx-2 cursor-pointer']"));
		
		Actions b=new Actions(driver);
		Thread.sleep(1000);
		b.moveToElement(a).build().perform();
		WebElement c = driver.findElement(By.xpath("//button[text()='LOGIN/SIGNUP']"));
		Thread.sleep(4000);
		b.click(c).perform();
		
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Tejashri");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Dhobale");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tejudhobale718@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9096620646");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Teju123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Teju123");
		driver.findElement(By.xpath("//button[text()='CREATE AN ACCOUNT ']")).click();
		
		
		
		
	}

}
