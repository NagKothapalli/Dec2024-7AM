package rComponents;

import org.junit.Test;

public class ReusableComponents
{

	//*****************************Reusable Components*********************************
	
	
	protected void launchApplication(String url)
	{
		System.out.println("RC : Call the application with URL :" + url);
	}
	
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	
	protected void logoutFromApplication()
	{
		System.out.println("RC : Logout From Applicatin");
	}
	
	protected void closeApplication()
	{
		System.out.println("RC : Close the Application");
	}
	
	protected void compose()
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
