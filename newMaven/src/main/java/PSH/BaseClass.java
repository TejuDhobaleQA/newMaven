package PSH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

public static WebDriver ChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\MyPractice\\TEJU\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver EdgeBrowser() {
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\Tejashri\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	
		
	}
}
