package inheritanceByObject;

import org.junit.Test;
//             child               parent    -> Simple Inheritance
public class TestCases //extends ReusableComponents
{
	//Modifier ClassName objname = new Constructor();
	//public ReusableComponents rc = new ReusableComponents();
	public ReusableComponents rc = new ReusableComponents("Edge");
	//*************************** Test Cases *****************************************
	@Test // Test Method
	public void composeAndSendAnEmail()
	{
		System.out.println("Test Case : Compose And Send An Email");
		rc.launchApplication("https://gmail.com");
		rc.loginToApplication();
		rc.compose();		
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	
	@Test
	public void replyToAnEmail()
	{
		System.out.println("Test Case : Reply to An Email");
		rc.launchApplication("https://gmail.com");
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void forwardAnEmail()
	{
		System.out.println("Test Case : Forward An Email");
		rc.launchApplication("https://gmail.com");
		rc.loginToApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void deleteAnEmail()
	{
		System.out.println("Test Case : Delete An Email");
		rc.launchApplication("https://gmail.com");
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	

}
