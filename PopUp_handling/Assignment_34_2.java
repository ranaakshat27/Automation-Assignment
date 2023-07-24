package PopUp_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_34_2 {
  @Test
  public void Menu() throws InterruptedException {
	  
	    System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = ("D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/menu/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement Main1 = driver.findElement(By.xpath("//a[text()=\'Main Item 1\']"));
		ac.moveToElement(Main1).click().build().perform();
		Thread.sleep(2000);
		WebElement Main2 = driver.findElement(By.xpath("//a[text()=\'Main Item 2\']"));
		ac.moveToElement(Main2).click().build().perform();
		WebElement Item = driver.findElement(By.xpath("//a[text()=\'Sub Item\']"));
		ac.moveToElement(Item).click().build().perform();
		Thread.sleep(2000);
		WebElement Main3 = driver.findElement(By.xpath("//a[text()=\'Main Item 3\']"));
		ac.moveToElement(Main3).click().build().perform();
		driver.quit();
  }
}
