package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adctinlogin {
	@FindBy(xpath="//input[@name='username']") private WebElement UN;


	@FindBy(xpath="//input[@name='password']") private WebElement PSW;


	@FindBy(xpath="//input[@name='login']") private WebElement loginbtn;
	
  public adctinlogin (WebDriver driver)
	{

	PageFactory.initElements(driver,this);
	}
	
	public void enterusername(String User)
	{

	UN.sendKeys(User);

	}

	public void enterpassword(String Password)
	{

	PSW.sendKeys(Password);

	}

	public void Clickloginbtn()
	{

	loginbtn.click();

	}


	

}
