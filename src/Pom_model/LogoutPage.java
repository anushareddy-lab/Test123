package Pom_model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LogoutPage {
	WebDriver driver;
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="welcome")
	WebElement Clicl_Welcome;
	@FindBy(linkText="Logout")
	WebElement Click_logout;
	public void Verify_LOgout() throws InterruptedException
	{
		Clicl_Welcome.click();
		Thread.sleep(5000);
		Click_logout.click();

	}
}
