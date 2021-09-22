package ButtonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class BantuanButtonTest {

	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	driver.get("https://flip.id/");
	driver.manage().window().maximize();
	
	WebElement BantuanButton = driver.findElement(By.xpath("//a[contains(text(),\"Bantuan\")]"));
	Assert.assertEquals(true, BantuanButton.isDisplayed());
	System.out.println(“Bantuan Button is displayed – Assert passed”);
	
	BantuanButton.click();
	
}
