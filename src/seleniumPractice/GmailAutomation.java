package seleniumPractice;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {
	String expectedTitle = "Gmail";
	ChromeDriver driver; // null

	@Before
	public void launchApplication() throws InterruptedException {
		System.out.println("Test Case : Launch Application");
		driver = new ChromeDriver(); // Inside the constructor of the class , he wrote the code to open an empty
										// chrome browser
		driver.get("https://gmail.com");
		String actualTitle = driver.getTitle();
		System.out.println("Actual Application Title :" + actualTitle);
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title Validation passed");
		} else {
			System.out.println("Title Validatin Failed");
		}

		driver.manage().window().maximize();

		//Thread.sleep(1000);

		//driver.manage().window().minimize();

		//Thread.sleep(1000);

		//driver.manage().window().maximize();

	}

	// WebDriver [I] : class will have functions at browser level

	// ChromeDriver() , get(), getTitle(), getCurrentUrl(),getWindowHandle() ,
	// findElement() , findElements() , minimize() , maximize() , close() , quit()

	// WebElement [I] : will have functions at element level - button / textbox

	// click() , clear() , sendKeys() , getText() , getTagName() ,
	// getAttribute(class) , isDispayed() , isEnabled() , findElement() ,
	// findElements()

	// By : class will have all locators / selectors

	// ID(), Name() , className() , tagName() , cssSelector() , linkText() ,
	// partialLinkText() , xpath()

	@Test
	public void loginToApplication() {
		System.out.println("Test Case : Login to Application");
		// launchApplication();
		String actualTitle = driver.getTitle();
		System.out.println("Actual Application Title :" + actualTitle);
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title Validation passed");
		} else {
			System.out.println("Title Validatin Failed");
		}

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL :" + currentUrl);
		String sessionID = driver.getWindowHandle();
		System.out.println("Session ID : " + sessionID);

		// *****************************************
		By by = By.name("identifier");
		WebElement element = driver.findElement(by);
		element.click();
		element.sendKeys("dfdgfgfghghjjk");
		element.clear();
		element.sendKeys("nag022@gmail.com");

		// ************************************************
		// driver.findElement(By.name("identifier")).sendKeys("dfdsfdsfdsfdsfdsf");
		// driver.findElement(By.name("identifier")).clear();
		// driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");

		// index value will start from zero - 0 1 2 3 - total 4
		List<WebElement> mylist = driver.findElements(By.className("VfPpkd-vQzf8d"));
		// WebElement myelement = mylist.get(1);
		// myelement.click();
		for (int i = 0; i < mylist.size(); i++) {
			String txt = mylist.get(i).getText();
			if (txt.equals("Next")) {
				mylist.get(i).click();
				break;
			}
		}

	}

	// XPATH : xml path

	// Fixed / Absolute / Static xpath

	// Relative xpath
	
	//tagName[@attribute = value]   --- attribute can be id / name / class / jsname / jdname /
	//*[@attribute = value]	
	//tagName[@attribute1 = value  and @attribute2= value]	
    //tagName[text() = value ]    --------------  select * from Employee where empID=1234 and Dept=RD
	//tagName[text() = value and @attribute=value ]
	//tagName[contains(text() , value) ]
	//tagName[contains(@attribute , value)]
	
	//tagName[@attribute1 = value  or  @attribute2= value]

	@Test
	public void forgotEmail_Absolutexpath()
	{
		System.out.println("Test Case : Forgot Email with Absolute xpath");
		String forgotEmailXpath = "/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[3]/button";
		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[3]/button")).click();
		driver.findElement(By.xpath(forgotEmailXpath)).click();
	}
	
	
	@Test
	public void forgotEmail_RelativeXpath()
	{
		System.out.println("Test Case : Forgot Email with Relative xpath");
		//driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
		driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
		//*[text()='Forgot email?']
		//button[contains(text(),'Forgot ')]
		//input[@class='whsOnd zHQkBf' and @name='identifier']
		//input[@name='identifier'  or  @id='identifierId']
	}

	@Test
	public void forgotEmail() {
		System.out.println("Test Case : Forgot Email");
		// launchApplication();
		List<WebElement> mylist = driver.findElements(By.tagName("button"));
		// WebElement myelement = mylist.get(1);
		// myelement.click();
		for (int i = 0; i < mylist.size(); i++) {
			String txt = mylist.get(i).getText();
			if (txt.equals("Forgot email?")) {
				mylist.get(i).click();
				break;
			}
		}

	}
	
	@Test
	public void learnMore_relativexpath() {
		System.out.println("Test Case : Learn More with relative xpath");
		driver.findElement(By.xpath("//a[@jsname='JFyozc']")).click();
	}

	@Test
	public void learnMore() {
		System.out.println("Test Case : Learn More");
		// launchApplication();
		List<WebElement> mylist = driver.findElements(By.tagName("a"));
		// WebElement myelement = mylist.get(1);
		// myelement.click();
		for (int i = 0; i < mylist.size(); i++) {
			String txt = mylist.get(i).getText();
			if (txt.equals("Learn more about using Guest mode")) {
				mylist.get(i).click();
				break;
			}
		}

	}

	@Test
	public void learnMore_link() {
		System.out.println("Test Case : Learn More as HyperLink");
		// driver.findElement(By.linkText("Learn more about using Guest mode")).click();
		driver.findElement(By.partialLinkText("Learn more about")).click();
	}

	@Test
	public void createAccount() {
		System.out.println("Test Case : Create Account");
		// launchApplication();
		/*
		 * List<WebElement> mylist = driver.findElements(By.className("VfPpkd-vQzf8d"));
		 * // WebElement myelement = mylist.get(1); // myelement.click(); for (int i =
		 * 0; i < mylist.size(); i++) { String txt = mylist.get(i).getText(); if
		 * (txt.equals("Create account")) { mylist.get(i).click(); break; } }
		 */
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
	}

}
