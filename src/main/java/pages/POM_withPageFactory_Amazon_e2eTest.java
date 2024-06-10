package pages;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class POM_withPageFactory_Amazon_e2eTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		POM_withPageFactory_AmazonLogin login= new POM_withPageFactory_AmazonLogin(driver);
		POM_withPageFactory_AmazonReturnOrder returnOrder=new POM_withPageFactory_AmazonReturnOrder(driver);
		
		login.CreateAc();
		driver.navigate().back();
		driver.navigate().back();
		login.clickLogin("shrishtisharma1810@gmail.com", "nehaamaz0n");
		returnOrder.ReturnOder();
		driver.navigate().back();
		login.Logout();
		
		
	}

}


