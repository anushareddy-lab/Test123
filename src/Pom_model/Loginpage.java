package Pom_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	WebDriver driver;
	Actions ac;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(name="txtUsername")WebElement Enter_username;
	@FindBy(id="txtPassword")WebElement Enter_password;
	@FindBy(name="Submit")WebElement Click_submit;
	public void verify_login(String username,String password)
	{
		ac=new Actions(driver);
		Enter_username.sendKeys(username);
		Enter_password.sendKeys(password);
		ac.moveToElement(Click_submit).click().perform();
	}
}
