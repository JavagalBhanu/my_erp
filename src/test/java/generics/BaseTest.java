package generics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
//when webdriver is not static- for parallel execution....
public class BaseTest implements IAutoConst
{
	
	public WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeMethod
	public void preCondition(String url,String browser) throws MalformedURLException
	{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		
		URL remoteAddress=new URL(url);
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		driver=new RemoteWebDriver(remoteAddress, capabilities);
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.get(APP_URL);
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}
