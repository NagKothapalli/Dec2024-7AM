package seleniumPractice;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation
{
	String expectedTitle = "Gmail";
	ChromeDriver driver; // null
	
	@Before
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");
		driver = new ChromeDriver(); //Inside the constructor of the class , he wrote the code to open an empty chrome browser
		driver.get("https://gmail.com");
		String actualTitle = driver.getTitle();
		System.out.println("Actual Application Title :" + actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title Validation passed");
		}
		else
		{
			System.out.println("Title Validatin Failed");
		}
	}
	
	@Test
	public void loginToApplication()
	{
		System.out.println("Test Case : Login to Application");
		//launchApplication();
		String actualTitle = driver.getTitle();
		System.out.println("Actual Application Title :" + actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title Validation passed");
		}
		else
		{
			System.out.println("Title Validatin Failed");
		}
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL :" + currentUrl);
		String sessionID = driver.getWindowHandle();
		System.out.println("Session ID : " + sessionID);
		
		//*****************************************
		By by = By.name("identifier");
		WebElement element = driver.findElement(by);
		element.click();
		element.sendKeys("dfdgfgfghghjjk");
		element.clear();
		element.sendKeys("nag022@gmail.com");
		
		//************************************************
		//driver.findElement(By.name("identifier")).sendKeys("dfdsfdsfdsfdsfdsf");
		//driver.findElement(By.name("identifier")).clear();
		//driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");
		
		//index value will start from zero - 0 1 2 3 - total 4
		List<WebElement> mylist = driver.findElements(By.className("VfPpkd-vQzf8d"));
		//WebElement myelement = mylist.get(1);
		//myelement.click();
		for(int i=0;i<mylist.size();i++)
		{
			String txt = mylist.get(i).getText();
			if(txt.equals("Next"))
			{
				mylist.get(i).click();
				break;
			}
		}
		
		
	}
	
	@Test
	public void forgotEmail()
	{
		System.out.println("Test Case : Forgot Email");
		//launchApplication();
		List<WebElement> mylist = driver.findElements(By.tagName("button"));
		//WebElement myelement = mylist.get(1);
		//myelement.click();
		for(int i=0;i<mylist.size();i++)
		{
			String txt = mylist.get(i).getText();
			if(txt.equals("Forgot email?"))
			{
				mylist.get(i).click();
				break;
			}
		}
		
	}
	
	@Test
	public void learnMore()
	{
		System.out.println("Test Case : Learn More");
		//launchApplication();
		List<WebElement> mylist = driver.findElements(By.tagName("a"));
		//WebElement myelement = mylist.get(1);
		//myelement.click();
		for(int i=0;i<mylist.size();i++)
		{
			String txt = mylist.get(i).getText();
			if(txt.equals("Learn more about using Guest mode"))
			{
				mylist.get(i).click();
				break;
			}
		}
		
	}
	
	@Test
	public void createAccount()
	{
		System.out.println("Test Case : Create Account");
		//launchApplication();
		List<WebElement> mylist = driver.findElements(By.className("VfPpkd-vQzf8d"));
		//WebElement myelement = mylist.get(1);
		//myelement.click();
		for(int i=0;i<mylist.size();i++)
		{
			String txt = mylist.get(i).getText();
			if(txt.equals("Create account"))
			{
				mylist.get(i).click();
				break;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
