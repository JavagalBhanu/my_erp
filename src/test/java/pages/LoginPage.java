package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class LoginPage extends BasePage{

	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	public void setUserName(String un) {
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginBTN() {
		loginBTN.click();
	}
	
	public boolean verifyLoginPageIsDisplayed(String eTitle) 
	{
		return verifyTitle(eTitle);
	}
	
	public boolean verifyErrMsgDisplayed()
	{
		return  verifyElementDisplayed(errMsg);
	}
}
