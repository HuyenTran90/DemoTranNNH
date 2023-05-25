package step_cucumberContact;

import demoblazeRunPage.ContactButton;
import demoblazeRunPage.LoginDemoblaze;
import demoblazeRunPage.SignupDemoblaze;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactScenarioSteps extends ScenarioSteps {
	ContactButton contact = new ContactButton(getDriver());
	
	@Step
	public void open_page() {
		contact.open();
	}

	@Step
	public void click_contact_button() {
		contact.clickContactButton();
	}
	@Step
	public void send_message(String email, String name, String message) throws InterruptedException {
		contact.sendMessage(email, name, message);
	}
	
	@Step
	public void click_close() {
		contact.clickClose();
	}
	
	
}