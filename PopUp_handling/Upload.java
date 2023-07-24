package PopUp_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload {
  @Test
  public void monster() {
	  
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = ("D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.foundit.in/seeker/registration?spl=IN-Acq-SEM-Google-IP_IN_SER_Monster_Brand_Exact_17052022-GSN-Monster_Resume-monster%20create%20account-Both-Brand---637202034949---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-IP_IN_SER_Monster_Brand_Exact_17052022-GSN-Monster_Resume-monster%20create%20account-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_monster%20create%20account&gclid=EAIaIQobChMIyqm2rvKS_gIV2tpMAh2EXA94EAAYASAAEgJ28PD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		WebElement file = driver.findElement(By.xpath("//input[@type=\'file\']"));
		file.sendKeys("D:\\Update");
		System.out.println("File uploaded");
  }
}
