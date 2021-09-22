package ButtonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class KarirButtonTest {

	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	driver.get("https://flip.id/");
	driver.manage().window().maximize();
	
	WebElement KarirButton = driver.findElement(By.xpath("//a[contains(text(),\"Karir\")]"));
	Assert.assertEquals(true, KarirButton.isDisplayed());
	System.out.println(“Karir Button is displayed – Assert passed”);
	
	KarirButton.click();
	
}
