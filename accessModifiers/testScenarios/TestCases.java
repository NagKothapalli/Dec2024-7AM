package testScenarios;

import org.junit.Test;

import rComponents.ReusableComponents;
//             child               parent    -> Simple Inheritance
public class TestCases extends ReusableComponents
{
	//*************************** Test Cases *****************************************
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
