import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {
	 public static  final String USERNAME = "prathima11";
	 public static final String ACCESS_KEY = "0330ce25-e413-4d7f-886c-548c38295e5b";
	 public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 10");
		browserOptions.setCapability("browserVersion", "latest");
		browserOptions.setCapability("sauce:options", sauceOptions);
		  
		
		/*
		 * DesiredCapabilities caps = DesiredCapabilities.chrome();
		 * caps.setCapability("platform", "Windows 7"); caps.setCapability("version",
		 * "51.0");
		 */
		WebDriver driver = new RemoteWebDriver(new URL(URL), browserOptions);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium",Keys.ENTER);
		

	}

}
