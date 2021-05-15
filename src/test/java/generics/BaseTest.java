package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
//when webdriver is not static- for parallel execution....
public class BaseTest implements IAutoConst
{
	
	public WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.get(APP_URL);
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}
