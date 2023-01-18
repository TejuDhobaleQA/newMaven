package PSH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	@FindBy(xpath="//button[text()='Register']") private WebElement Click;
	@FindBy(xpath="//input[@name='firstName']") private WebElement Fname;
	@FindBy(xpath="//input[@name='lastName']") private WebElement Lname;
	@FindBy(xpath="//input[@name='email']") private WebElement Email;
	@FindBy(xpath="//input[@name='mobile']") private WebElement Mobile;
	@FindBy(xpath="(//input[@type='password'])[1]") private WebElement Password;
	@FindBy(xpath="(//input[@type='password'])[2]") private WebElement NewPass;
	@FindBy(xpath="//button[text()='CREATE AN ACCOUNT ']") private WebElement Create;
	@FindBy(xpath="//h1[text()='Get OTP']") private WebElement GetOtp;

	public Register(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void click() {
		Click.click();
	}
	public void SendKey() {
		Fname.sendKeys("Tejashri");
		Lname.sendKeys("Dhobale");
		Email.sendKeys("tejudhobale718@gmail.com");
		Mobile.sendKeys("9096620646");
		Password.sendKeys("Teju123");
		NewPass.sendKeys("Teju123");
		
	}
	public void create() {
		Create.click();
	}
	

}
