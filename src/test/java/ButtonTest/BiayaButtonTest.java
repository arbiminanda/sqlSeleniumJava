package ButtonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class BiayaButtonTest {

	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	driver.get("https://flip.id/");
	driver.manage().window().maximize();
	
	WebElement BiayaButton = driver.findElement(By.xpath("//a[contains(text(),\"Biaya\")]"));
	Assert.assertEquals(true, BiayaButton.isDisplayed());
	System.out.println(“Biaya Button is displayed – Assert passed”);
	
	BiayaButton.click();
	
}
