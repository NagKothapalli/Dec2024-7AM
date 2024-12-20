package seleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation
{
	ChromeDriver driver; // null

	@Before
	public void launchApplication() throws InterruptedException {
		System.out.println("Test Case : Launch Application");
		driver = new ChromeDriver(); //12345 // Inside the constructor of the class , he wrote the code to open an empty
										// chrome browser
		driver.get("https://www.apsrtconline.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void bookBusTicket()
	{
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		Actions actions = new Actions(driver); //12345
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();		
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		String dt = "26";  // With Date function in java get the current date and add some number 
		//driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.xpath("//a[text()='"+dt+"']")).click();  // Dynamic xpath
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		
	}
	
	@Test
	public void keyboardAndMouse()
	{
		System.out.println("Test Case : Book Bus Ticket");
		WebElement source = driver.findElement(By.xpath("//input[@name='source']"));
		Actions actions = new Actions(driver);
		//actions.moveToElement(source).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		actions.moveToElement(source).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).doubleClick().contextClick().build().perform();
	}
	//UnChecked exceptions / runtime exceptions
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//a[@title='TimeTable1 / Track']"}
	//java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.chrome.ChromeDriver.get(String)" because "this.driver" is null
	//java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 2
	//stale element
	
	@Test
	public void handleMultipleWindows() throws InterruptedException  // Checked exception / Compile time exception
	{
		System.out.println("Test Case : Handle Multiple Windows");
		driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		driver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windows);
		list.get(5);
		for(String w : list) {
			System.out.println(w);
		}
		
		System.out.println("Title of First Window :" + driver.getTitle());
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		System.out.println("Title of Second Window :" + driver.getTitle());
		//driver.close(); // current active window will be closed
		driver.quit();// it will kill the driver object - all windows will be closed
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//a[@title='Home']")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
