package PopUp_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = ("D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		
		//WebElement frame1 = driver.findElement(By.xpath("//iframe"));
		//driver.switchTo().frame(frame1);
		
		driver.switchTo().frame("mce_0_ifr");
		System.out.println("Frame is viewed");
		System.out.println(driver.findElement(By.id("tinymce")).getText());
		driver.close();
        //driver.switchTo().defaultContent();
	}

}
