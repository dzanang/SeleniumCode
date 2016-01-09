package tutorial.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindows {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.facebook.com/";

		// Maximize browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSwitchWindows() throws Exception {
		driver.get(baseUrl);

		// Get the window handle
		String handle = driver.getWindowHandle();

		// Get all handles
		java.util.Set<String> handles = driver.getWindowHandles();

		for (String handle1 : handles) {
			if (!handle1.equals(handle)) {
				driver.switchTo().window(handle1);
			}
		}
	}

	@After
	public void tearDown() throws Exception {
	}
}
