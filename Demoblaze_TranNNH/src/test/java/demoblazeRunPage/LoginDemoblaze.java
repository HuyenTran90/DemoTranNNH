package demoblazeRunPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class LoginDemoblaze extends PageObject {
	private WebDriver driver;
	
	@FindBy(id = "loginusername")
	WebElement username_textbox;
	@FindBy(id = "loginpassword")
	WebElement password_textbox;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/button[2]")
	WebElement login_button;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/button[1]")
	WebElement close_button;
	@FindBy(id="nameofuser")
	WebElement name_of_user;
	@FindBy(id = "login2")
	WebElement button_login_homePage;
	
	public LoginDemoblaze(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginWithUserPass(String username, String password) throws InterruptedException {
		username_textbox.clear();
		username_textbox.sendKeys(username);
		password_textbox.clear();
		password_textbox.sendKeys(password);
		Thread.sleep(3000);
		login_button.click();
		Thread.sleep(3000);
	}
	
	public void clickloginButtonHomePage() {
		button_login_homePage.click();
	}
	
	public void clickLoginButton() {
		login_button.click();
	}
	
	public void clickClose() {
		close_button.click();
	}
	public String getNameOfUser() {
		return name_of_user.getText();
	}
	
}
