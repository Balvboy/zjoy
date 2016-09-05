package zjoy.research.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CeleniumTest {

	public static void main(String[] args) {
		WebDriver driver = SeleniumInit.getDriverInstance(WebDriverType.FireFox);
		driver.get("http://www.cottonchina.org/textile/index.php");
		WebElement element = driver.findElement(By.className("tab fl"));
		System.out.println(element.getText());
	}
}

class SeleniumInit{
	private static  class InnerClass{
		private static WebDriver getDriver(WebDriverType type){
			if(type==WebDriverType.Chrome){
				return new ChromeDriver();
			}else if(type==WebDriverType.FireFox){
				return new FirefoxDriver();
			}
			return new SafariDriver();
		}
	}
	
	public static WebDriver getDriverInstance(WebDriverType name){
		return InnerClass.getDriver(name);
	} 
}

enum WebDriverType{
	Chrome,FireFox,Safari
}
