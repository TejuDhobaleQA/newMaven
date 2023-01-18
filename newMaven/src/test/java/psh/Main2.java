package psh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
		
		//(//input[@name='first_name'])[2]
				
				System.setProperty("webdriver.chrome.driver", "D:\\MyPractice\\TEJU\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.planetsuperheroes.com/edit-profile");
				
				driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']")).sendKeys("9096620646");
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

//				WebElement a = driver.findElement(By.xpath("//div[@class='d-flex flex-column mx-2 cursor-pointer']"));
//				
//				Actions b=new Actions(driver);
//				Thread.sleep(1000);
//				b.moveToElement(a).build().perform();
//				WebElement c = driver.findElement(By.xpath("//button[text()='Edit Profile']"));
//				Thread.sleep(4000);
//				b.click(c).perform();
				
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//input[@name='first_name'])[2]")).sendKeys("1234");
				driver.findElement(By.xpath("(//input[@name=\"last_name\"])[2]")).sendKeys("789");

				driver.findElement(By.xpath("(//input[@name=\"mobile\"])[2]")).sendKeys("9096620646");
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("tejudhobale718@gmail.com");
				
				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				
				
	}

}
