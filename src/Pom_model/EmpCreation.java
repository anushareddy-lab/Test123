package Pom_model;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class EmpCreation {
	WebDriver driver;
	public EmpCreation(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="menu_pim_viewPimModule")
	WebElement Click_Pim;
	@FindBy(id="btnAdd")
	WebElement Click_Add;
	@FindBy(name="firstName")
	WebElement fname;
	@FindBy(id="lastName")
	WebElement lname;
	@FindBy(id="employeeId")
	WebElement eid;
	@FindBy(id="btnSave")
	WebElement Click_Save;
	public void EmpCreate(String fname,String lname,String eid) throws InterruptedException
	{
		Click_Pim.click();
		Thread.sleep(5000);
	Click_Add.click();
	Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		this.fname.sendKeys(fname);
		this.lname.sendKeys(lname);
		this.eid.clear();
		this.eid.sendKeys(eid);
		Click_Save.click();
	}
	
}
