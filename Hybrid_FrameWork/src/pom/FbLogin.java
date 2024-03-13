package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BasePage;

public class FbLogin extends BasePage
{
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	public FbLogin(WebDriver driver)
	{
		super(driver);
	}
	
	public void passUname(String un)
	{
		uname.sendKeys(un);
	}
	
	public void passPwd(String pass)
	{
		pwd.sendKeys(pass);
	}

}
