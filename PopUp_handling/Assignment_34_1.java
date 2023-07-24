package PopUp_handling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_34_1 {
  @Test
  public void Slider() throws InterruptedException {
	  
	    System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = ("D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/slider/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//input[@class=\'range-slider range-slider--primary\']"));
		ac.moveToElement(slider,90,0).click().build().perform();
		System.out.println("Slider moves in horizontal direction");
        Thread.sleep(4000);
		driver.quit();
  }
}
