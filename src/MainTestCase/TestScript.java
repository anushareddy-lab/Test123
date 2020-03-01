package MainTestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Pom_model.EmpCreation;
import Pom_model.Loginpage;
import Pom_model.LogoutPage;
import Pom_model.UserCreationPage;
import Utility.Browser;
public class TestScript {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
@BeforeMethod
	public void launch() 
	{
	//hello
		test=report.startTest("verify login");
		Browser br=new Browser();
		br.Verify_Browser("chrome","http://orangehrm.qedgetech.com/");
		Loginpage login=PageFactory.initElements(driver, Loginpage.class);
		login.verify_login("Admin", "Qedge123!@#");
		if(driver.getCurrentUrl().contains("dash"))
		{
			test.log(LogStatus.PASS, "login sucessful");
		}
		else
		{
test.log(LogStatus.PASS, "login unsucessful");
		}
		
}
	@BeforeTest
	public void reports()
	{
		report=new ExtentReports("./Report/extentreport.html");
	}
	
	
	
	@Test(priority=0)
	public void Testcase1() throws InterruptedException
	{
		test=report.startTest("UserCreationPage","verify user creation");
		UserCreationPage ucp=PageFactory.initElements(driver,UserCreationPage.class);
		ucp.usercreate(0, "SureshBabu", "Admin", "reddy@123T", "reddy@123T");
		if(driver.getCurrentUrl().contains("viewSystemUsers"))
		{
			test.log(LogStatus.PASS, "user created sucessful");
		}
		else
		{
			test.log(LogStatus.FAIL, "user not created sucessful");
		}
		
	}
	@Test(priority=1)
	public void testcase2() throws InterruptedException
	{

		test=report.startTest("EmpCreation","verify emp creation");
		EmpCreation ec=PageFactory.initElements(driver,EmpCreation.class);
		ec.EmpCreate("Anusha", "Reddy", "12345");
		if(driver.getCurrentUrl().contains("viewPersonalDetails"))
		{
			test.log(LogStatus.PASS, "Emp creation sucessfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "Emp creation not sucessfully");
		}
	}
	@AfterMethod
	public void test1() throws InterruptedException
	{
		LogoutPage lp=PageFactory.initElements(driver,LogoutPage.class);
		lp.Verify_LOgout();
		report.flush();
		report.endTest(test);
		driver.close();
	}
	

}
