package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_withPageFactory_AmazonLogin {
	WebDriver driver;
	
	//Constructor with PageFactory InitElements
	//initElements method is used to initialize and instantiate webelements
	public POM_withPageFactory_AmazonLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//WebElements using @FindBy instead of By as in simple Page object Model
	@FindBy(xpath="//*[text()='Hello, Sign in']")
	WebElement SignInLink;
	
	@FindBy(xpath="//*[@id='ap_email']")
	WebElement email;

	@FindBy(xpath="//input[@id='continue']")
	WebElement continueBtn;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement SignInBtn;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement CreateNewAc;
	
	@FindBy(xpath="//*[text()='Sign Out']")
	WebElement LogoutBtn;
	
	//for logout btn u can also use this
	////*[@id='nav-link-accountList']/following-sibling::a[1]

	@FindBy(xpath="//*[@id='nav-link-accountList']")
	WebElement Hellouser;
	
	//Methods without using driver.findElement as in simple Page Object Model
	public void clickLogin(String emailid, String passwd)
	{
		SignInLink.click();
		email.sendKeys(emailid);
		continueBtn.click();
		pwd.sendKeys(passwd);
		SignInBtn.click();
	}

	public void CreateAc()
	{
		SignInLink.click();
		CreateNewAc.click();
	}


	public void Logout()
	{
		Actions action=new Actions(driver);
		action.moveToElement(Hellouser).build().perform();
		LogoutBtn.click();
		
	}

	
	
}
