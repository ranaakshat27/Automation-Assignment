package PopUp_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Page_Action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path= ("D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions ac = new Actions(driver); 
		WebElement Best_Sellers = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
		ac.moveToElement(Best_Sellers).click().build().perform();

		//ac.moveToElement(Best_Sellers).contextClick();

	}

}
