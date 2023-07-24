package PopUp_handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = ("D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//Extracting window handles
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		//Defining Iterator for this set of window handles
		Iterator<String> ite = ids.iterator();
		
		ids.iterator();
		String parent_id = ite.next();
		String child_id = ite.next();
		
		// Switching to the respective window using the window handle
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle());

	}
}
