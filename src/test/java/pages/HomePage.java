package pages;

import org.openqa.selenium.WebDriver;

import generics.BasePage;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyHomePageIsDisplayed(String eTitle,long ToIS) {
		return verifyTitle(eTitle,ToIS);
	}
	
}
