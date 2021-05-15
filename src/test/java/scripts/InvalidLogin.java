package scripts;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.ExcelUtil;
import pages.LoginPage;

public class InvalidLogin extends BaseTest
{
	@Test
	public void testInvalidLogin()
	{
		//Reading data from excel

		String un=ExcelUtil.getData(XL_PATH,"InvalidLogin",1,0);
		String pw=ExcelUtil.getData(XL_PATH,"InvalidLogin",1, 1);
				
//		1. enter invalid user name
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(un);
//		2. enter invalid password
		loginPage.setPassword(pw);
//		3. click login
		loginPage.clickLoginBTN();
//		4. verify err msg is dispalyed
		loginPage.verifyErrMsgDisplayed();
	}
}
