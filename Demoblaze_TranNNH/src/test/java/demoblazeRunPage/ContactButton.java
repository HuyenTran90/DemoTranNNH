package demoblazeRunPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class ContactButton extends PageObject {
	private WebDriver driver;
	
	@FindBy(id = "recipient-email")
	WebElement contact_email_textbox;
	@FindBy(id = "recipient-name")
	WebElement contact_name_textbox;
	@FindBy(id = "message-text")
	WebElement message_textbox;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[2]")
	WebElement send_message_button;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	WebElement close_button;
	@FindBy(xpath = "/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement contact_button;
	
	public ContactButton(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sendMessage(String email, String name, String message) throws InterruptedException {
		contact_email_textbox.clear();
		contact_email_textbox.sendKeys(email);
		contact_name_textbox.clear();
		contact_name_textbox.sendKeys(name);
		message_textbox.clear();
		message_textbox.sendKeys(message);
		Thread.sleep(3000);
		send_message_button.click();
		Thread.sleep(3000);
	}
	
	public void clickContactButton() {
		contact_button.click();
	}
	public void clickClose() {
		close_button.click();
	}
	
}
