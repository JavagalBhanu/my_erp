package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.IAutoConst;

public class TestA extends BaseTest
{
	@Test
	public void testA()
	{
		Reporter.log("testA...",true);
	}
}
