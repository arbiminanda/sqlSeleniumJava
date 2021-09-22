package ButtonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class MasukButtonTest {

	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	driver.get("https://flip.id/");
	driver.manage().window().maximize();
	
	WebElement MasukButton = driver.findElement(By.xpath("//a[contains(text(),\"Masuk\")]"));
	Assert.assertEquals(true, MasukButton.isDisplayed());
	System.out.println(“Masuk Button is displayed – Assert passed”);
	
	MasukButton.click();
	
}
