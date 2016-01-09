package tutorial.selenium;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {
	private WebDriver driver;
	private String targetUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		targetUrl = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() throws Exception {
		driver.get(targetUrl);
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[1]/div")).click();
		//driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[1]/div")).click();
		WebElement source1 = driver.findElement(By.xpath("//div[@id='box3'][text()='Washington']"));
		Thread.sleep(2000);
		WebElement target1 = driver.findElement(By.xpath("//div[@id='box103'][text()='United States']"));
		
		Actions movingObject = new Actions(driver);
		movingObject.clickAndHold(source1).moveToElement(target1).release(target1).build().perform();
		Thread.sleep(2000);
		
		WebElement source2 = driver.findElement(By.xpath("//div[@id='box7'][text()='Madrid']"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='box107'][text()='Spain']"));
		movingObject.dragAndDrop(source2, target2).build().perform();
		
			
		
			}
			
		
	@After
	public void tearDown() throws Exception {
	}

}
