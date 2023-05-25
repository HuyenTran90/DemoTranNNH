package demoblazeRunPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class SignupDemoblaze extends PageObject {
	private WebDriver driver;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
	WebElement username_textbox;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")
	WebElement password_textbox;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/button[2]")
	WebElement button_signUp;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/button[1]")
	WebElement button_close;
	WebElement message;
	@FindBy(id = "signin2")
	WebElement button_signUp_homePage;
	
	public SignupDemoblaze(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signUpWithUserPass(String username, String password) throws InterruptedException {
		username_textbox.clear();
		username_textbox.sendKeys(username);
		password_textbox.clear();
		password_textbox.sendKeys(password);
		Thread.sleep(3000);
		button_signUp.click();
	}
	
	public void clickSignupHomePageButton() {
		button_signUp_homePage.click();
	}
	
	public void clickSignupButton() {
		button_signUp.click();
	}
	
	public void clickClose() {
		button_close.click();
	}

	public WebElement getTextbox_user() {
		return username_textbox;
	}

	public void setTextbox_user(WebElement textbox_user) {
		this.username_textbox = textbox_user;
	}

	public WebElement getTextbox_password() {
		return password_textbox;
	}

	public void setTextbox_password(WebElement textbox_password) {
		this.password_textbox = textbox_password;
	}

	public WebElement getButton_signUp() {
		return button_signUp;
	}

	public void setButton_signUp(WebElement button_signUp) {
		this.button_signUp = button_signUp;
	}

	public WebElement getButton_close() {
		return button_close;
	}

	public void setButton_close(WebElement button_close) {
		this.button_close = button_close;
	}

	public WebElement getMessage() {
		return message;
	}

	public void setMessage(WebElement message) {
		this.message = message;
	}

}
