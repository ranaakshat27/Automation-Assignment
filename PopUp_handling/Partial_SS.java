package PopUp_handling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_SS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = ("D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		
		WebElement w1 = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File Source = screenshot.getScreenshotAs(OutputType.FILE);
		BufferedImage img = ImageIO.read(Source);
		Point location = w1.getLocation();
		int w = w1.getSize().getHeight();
		int h = w1.getSize().getHeight();
		BufferedImage image = img.getSubimage(location.getX(), location.getY(), w, h);
		ImageIO.write(image, "png", Source);
		FileUtils.copyFileToDirectory(Source, new File("D:\\Screenshots\\"), false);
		System.out.println("Screenshot captured");
		driver.quit();

	}

}
