package tutorial.selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.dhtmlx.com";
		}

	

	@Test
	public void testMouseHoverActions() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(1000);
		
		WebElement mainElement = driver.findElement(By.xpath("html/body/div[3]/header/div[1]/div[2]/div[1]/nav/menu/li[3]/a"));
		WebElement subElement = driver.findElement(By.linkText("DHTMLX Suite"));
		
		Actions action = new Actions(driver);
		//action.moveToElement(mainElement).moveToElement(subElement).click().build().perform();
		
		
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);
		action.moveToElement(subElement).click().perform();
	
		
		
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
