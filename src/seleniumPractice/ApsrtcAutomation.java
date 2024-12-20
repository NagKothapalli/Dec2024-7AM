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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApsrtcAutomation
{
	ChromeDriver driver; // null
	WebDriverWait  wait;
	Actions actions;

	@Before
	public void launchApplication() throws InterruptedException {
		System.out.println("Test Case : Launch Application");
		driver = new ChromeDriver(); //12345 // Inside the constructor of the class , he wrote the code to open an empty
										// chrome browser
		driver.get("https://www.apsrtconline.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));  // Explicit wait
		actions = new Actions(driver);
	}
	
	@Test
	public void bookBusTicketFlow() throws InterruptedException
	{
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		Actions actions = new Actions(driver); //12345
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		String dt = "26";  // With Date function in java get the current date and add some number 
		//driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.xpath("//a[text()='"+dt+"']")).click();  // Dynamic xpath
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();		
	}
	
	//***********************************************************
	
	@Test
	public void bookBusTicketFlow_Sync() throws InterruptedException
	{
		System.out.println("Test Case : Book Bus Ticket");
		enterText("//input[@name='source']","HYDERABAD");
		clickEnterButton();
		enterText("//input[@name='destination']","GUNTUR");
		clickEnterButton();
		clickElement("//input[@name='txtJourneyDate']");
		String dt = "26";  // With Date function in java get the current date and add some number 
		clickElement("//a[text()='"+dt+"']");
		clickElement("//input[@name='searchBtn']");		
	}
	
	String fromCity = "//input[@name='source']";
	String toCity = "//input[@name='destination']";
	String openCalendar = "//input[@name='txtJourneyDate']";
	String searchBtn = "//input[@name='searchBtn']";
	
	@Test
	public void bookBusTicketFlow_Sync2() throws InterruptedException
	{
		System.out.println("Test Case : Book Bus Ticket");
		enterText(fromCity,"HYDERABAD"); // Hard coded
		clickEnterButton();
		enterText(toCity,"GUNTUR"); // Hard coded
		clickEnterButton();
		clickElement(openCalendar);
		String dt = "26";  // With Date function in java get the current date and add some number 
		clickElement("//a[text()='"+dt+"']");
		String txt = getWebElement(searchBtn).getText();
		System.out.println(txt);
		System.out.println(getWebElement(searchBtn).isDisplayed());
		System.out.println(getWebElement(searchBtn).isEnabled());
		System.out.println(getWebElement(searchBtn).getTagName());
		System.out.println(getWebElement(searchBtn).getAttribute("value"));
		clickElement(searchBtn);		
	}
	//-------------------------------------------------------------------------------
	public WebElement getWebElement(String myxpath)
	{
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(myxpath)));
		return element;
	}	
	
	public void clickElement(String myxpath)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(myxpath))).click();
	}
	
	public void enterText(String myxpath, String text)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(myxpath))).sendKeys(text);
	}
	
	public void clickEnterButton()
	{
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	}
	
	//************************************************************
	
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		System.out.println("Test Case : Book Bus Ticket");
		//Thread.sleep(30000);  // Static wait / fixed wait 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		//WebElement sourceObj = driver.findElement(By.xpath("//input[@name='source']"));
		//wait.until(ExpectedConditions.elementToBeClickable(sourceObj)).sendKeys("HYDERABAD");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='source']"))).sendKeys("HYDERABAD");
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
		//list.get(5);
		for(String w : list) {
			System.out.println(w);
		}
		
		System.out.println("Title of First Window :" + driver.getTitle());
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		System.out.println("Title of Second Window :" + driver.getTitle());
		driver.close(); // current active window will be closed		
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//a[@title='Home']")).click();
		driver.quit();// it will kill the driver object - all windows will be closed
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
