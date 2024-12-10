package basicConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	
	//Java function must be public , should not be static , no inputs , no outputs
	//****************************Smoke / Regression ****************************
	@Test
	public void smoke() // BVT : Build Validation Test
	{
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEmail();
	}
	@Test
	public void regression() 
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}

	
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
	
	//*****************************Reusable Components*********************************
	
	
	private void launchApplication(String url)
	{
		System.out.println("RC : Call the application with URL :" + url);
	}
	
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Applicatin");
	}
	
	public void closeApplication()
	{
		System.out.println("RC : Close the Application");
	}
	
	public void compose()
	{
		System.out.println("RC : Compose the Email");
	}
	
	public void send()
	{
		System.out.println("RC : Send the Email");
	}
	
	public void open()
	{
		System.out.println("RC : Open an Email");
	}
	
	public void reply()
	{
		System.out.println("RC : Reply to the Email");
	}
	
	public void forward()
	{
		System.out.println("RC : Forward the Email");
	}
	
	public void delete()
	{
		System.out.println("RC : Delete the Email");
	}
	
	
	
	
	
	
	
	
	

}
