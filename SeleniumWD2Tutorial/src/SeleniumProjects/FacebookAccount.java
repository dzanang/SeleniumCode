package SeleniumProjects;

import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.BREAKPOINT;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;
import com.thoughtworks.selenium.webdriven.commands.SelectOption;

public class FacebookAccount {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.facebook.com/";

		// Maximize browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testStart() throws Exception {
		// Loads the URL
		driver.get(baseUrl);

		// Title of the web page
		String title = driver.getTitle();
		System.out.println(title);

		// Current URL loaded in the web
		String getCurrentURL = driver.getCurrentUrl();
		System.out.println(getCurrentURL);

		// Gets the page source
		String source = driver.getPageSource();
		System.out.println(source);

		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Mustafa");
		driver.findElement(By
				.xpath("html/body/div[1]/div[2]/div[1]/div/div[1]/div/div/div[2]/div[2]/div/div/div/form[1]/div[1]/div[1]/div[2]/div/div/input"))
				.clear();
		driver.findElement(By
				.xpath("html/body/div[1]/div[2]/div[1]/div/div[1]/div/div/div[2]/div[2]/div/div/div/form[1]/div[1]/div[1]/div[2]/div/div/input"))
				.sendKeys("Mustic");
		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys("musto.master@gmail.com");
		driver.findElement(By
				.xpath("html/body/div[1]/div[2]/div[1]/div/div[1]/div/div/div[2]/div[2]/div/div/div/form[1]/div[1]/div[3]/div/div/input"))
				.clear();
		driver.findElement(By
				.xpath("html/body/div[1]/div[2]/div[1]/div/div[1]/div/div/div[2]/div[2]/div/div/div/form[1]/div[1]/div[3]/div/div/input"))
				.sendKeys("musto.master@gmail.com");
		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys("password1");
		Select sel1 = new Select(driver.findElement(By.id("day")));
		Select sel2 = new Select(driver.findElement(By.id("month")));
		Select sel3 = new Select(driver.findElement(By.id("year")));

		/*
		 * List<WebElement> options = sel1.getOptions(); int size =
		 * options.size();
		 * 
		 * for(int i=0; i<size; i++) { String optionsName =
		 * sel1.getOptions().get(i).getText(); System.out.println(optionsName);
		 * }
		 */

		// By value
		sel1.selectByValue("13");

		// By index
		sel2.selectByIndex(8);

		// By visible text
		sel3.selectByVisibleText("2001");

	
		List<WebElement> radioButtons = driver.findElements(By.name("sex"));
		
		//if (!radioButtons.get(radioButtons.size() - 1).isSelected()) {
			radioButtons.get(radioButtons.size() - 1).click();
			Thread.sleep(2000);
		}
	

	@After
	public void tearDown() throws Exception {

		// Close the current window, if it is last then quit
		// driver.close();

		// Quit the browser
		// driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}