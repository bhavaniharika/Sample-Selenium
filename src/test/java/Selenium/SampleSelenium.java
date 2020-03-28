package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
public class SampleSelenium 


{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\eclipse-workspace\\\\groupid\\\\src\\\\test\\\\resources\\\\binaries\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=what+is+selenium&oq=what+is+seli&aqs=chrome.2.69i57j0l7.6975j0j7&sourceid=chrome&ie=UTF-8");
		//driver.manage().window.maximize();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();
	
	}

}

