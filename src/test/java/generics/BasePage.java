package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,IAutoConst.ETO);
	}
	
	public boolean verifyTitle(String eTitle)
	{
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
	
	public boolean verifyElementDisplayed(WebElement element)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;//element is displayed
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;//element is not displayed
		}
	}
}
