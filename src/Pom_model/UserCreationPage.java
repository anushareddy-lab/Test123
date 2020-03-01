package Pom_model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class UserCreationPage {
	WebDriver driver;
public UserCreationPage(WebDriver driver)
{
	this.driver=driver;
}
@FindBy(id="menu_admin_viewAdminModule")
WebElement Click_Admin;
@FindBy(id="menu_admin_UserManagement")
WebElement Click_Usermanage;
@FindBy(id="menu_admin_viewSystemUsers")
WebElement Click_Usewrs;
@FindBy(name="btnAdd")
WebElement Click_Add;
@FindBy(name="systemUser[userType]")
WebElement UserRole;
@FindBy(id="systemUser_employeeName_empName")
WebElement ename; 
@FindBy(id="systemUser_userName")
WebElement username;
@FindBy(id="systemUser_password")
WebElement password;
@FindBy(name="systemUser[confirmPassword]")
WebElement cpass;
@FindBy(id="btnSave")
WebElement Click_Save;
public void usercreate(int userrole,String ename,String username,String password,String cpass) throws InterruptedException
{
	Click_Admin.click();
	Thread.sleep(5000);
Click_Usermanage.click();
Thread.sleep(5000);
Click_Usewrs.click();
Thread.sleep(5000);
Click_Add.click();
	new Select(this.UserRole).selectByIndex(userrole);
	this.ename.sendKeys(ename);
	this.username.sendKeys(username);
	this.password.sendKeys(password);
	this.cpass.sendKeys(cpass);
	Click_Save.click();
}
}
