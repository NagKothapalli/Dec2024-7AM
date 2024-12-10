package heairarchial;

import org.junit.Test;
//               child                 parent
public class TestCases_M2 extends ReusableComponents
{
	@Test
	public void forwardAnEmail()
	{
		System.out.println("Test Case : Forward An Email");
		launchApplication("https://gmail.com");
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteAnEmail()
	{
		System.out.println("Test Case : Delete An Email");
		launchApplication("https://gmail.com");
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}

}
