import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class test_listeners {

	public static void main(String[] args) throws InterruptedException {

		WebDriver webdriver = new ChromeDriver();

		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);

		weblisteners listner = new weblisteners();

		driver.register(listner);

		driver.navigate().to("http://www.saucedemo.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		Thread.sleep(3000L);
		
		driver.navigate().back();
		
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		Thread.sleep(3000L);

		driver.navigate().back();
		
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		Thread.sleep(3000L);

		driver.navigate().back();
		
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		Thread.sleep(3000L);
		driver.close();
	}

}
