package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.ExcelUtil;
import pages.HomePage;
import pages.LoginPage;

public class ValidLogin extends BaseTest
{
	@Test
	public void testValidLogin()
	{
		//Reading data from excel
		String un=ExcelUtil.getData(XL_PATH,"ValidLogin",1,0);
		String pw=ExcelUtil.getData(XL_PATH,"ValidLogin",1, 1);
		String eTitle=ExcelUtil.getData(XL_PATH,"ValidLogin",1,2);
		String msg=ExcelUtil.getData(XL_PATH,"ValidLogin",1,3);
		
//		1. enter valid user name
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(un);
		
//		2. enter valid password
		loginPage.setPassword(pw);
		
//		3. click on login button
		loginPage.clickLoginBTN();
		
//		4. verify that Home page is displayed
		HomePage homePage=new HomePage(driver);
		boolean pageDisplayed = homePage.verifyHomePageIsDisplayed(eTitle,ETO);
		Assert.assertTrue(pageDisplayed,msg);
	}
}
