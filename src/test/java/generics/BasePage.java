package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * this is parent class for all the POM classes
 * common methods should be defined here
 */
public abstract class BasePage 
{
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public boolean verifyTitle(String eTitle,long toIS)
	{
		WebDriverWait wait=new WebDriverWait(driver,toIS);
		try 
		{
			wait.until(ExpectedConditions.titleContains(eTitle));
			return true;//page is displayed
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;//page is not displayed
		}
	}
}
