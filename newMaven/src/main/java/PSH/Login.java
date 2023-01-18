package PSH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath="//div[@class='d-flex flex-column mx-2 cursor-pointer']") private WebElement login;
	@FindBy(xpath="//button[text()='LOGIN/SIGNUP']") private WebElement Signup;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Log() {
		WebElement move=login;
		return move ;
	}
	public WebElement signup() {
		WebElement sign=Signup;
		return sign   ;
	}

}