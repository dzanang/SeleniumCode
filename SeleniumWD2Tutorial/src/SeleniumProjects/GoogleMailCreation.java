package SeleniumProjects;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class GoogleMailCreation {
	private String targetUrl;
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		// PLAYING A BIT WITH SPLITING URLS
		targetUrl = "https://accounts.google.com/"
				+ "SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default";
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void test() {
		driver.get(targetUrl);

		driver.findElement(By.className("firstname")).sendKeys("John");
		driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("Snow");
		driver.findElement(By.name("GmailAddress")).sendKeys("notdeadsnow");
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("luster123");
		driver.findElement(By.id("PasswdAgain")).sendKeys("luster123");
		driver.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys("13");

		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("061333444");
		driver.findElement(By.xpath(".//*[@id='SkipCaptcha']")).click();
		driver.findElement(By.xpath(".//*[@id='TermsOfService']")).click();

		driver.findElement(By.id("BirthYear")).sendKeys("1978");

		Actions monthSelect = new Actions(driver);

		/*
		 * monthSelect.clickAndHold(driver.findElement(By.xpath(
		 * ".//*[@id='BirthMonth']/div/div[2]"))).build().perform();;
		 * monthSelect.click(driver.findElement(By.id(":5"))).build().perform();
		 */
		// monthSelect.clickAndHold(driver.findElement(By.xpath(".//*[@id='Gender']/div"))).build().perform();
		// monthSelect.click(driver.findElement(By.xpath(".//*[@id=':f']"))).build().perform();

		driver.findElement(By.xpath(".//*[@id='Gender']/div")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='Gender']/div")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id='Gender']/div")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id='Gender']/div")).sendKeys(Keys.ENTER);

	}

	@After
	public void tearDown() throws Exception {
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
