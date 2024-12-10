package heairarchial;

import org.junit.Test;
//              child                   parent
public class TestCases_M1 extends ReusableComponents
{
	@Test // Test Method
	public void composeAndSendAnEmail()
	{
		System.out.println("Test Case : Compose And Send An Email");
		launchApplication("https://gmail.com");
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	
	@Test
	public void replyToAnEmail()
	{
		System.out.println("Test Case : Reply to An Email");
		launchApplication("https://gmail.com");
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}

}
