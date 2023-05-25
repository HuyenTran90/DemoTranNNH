package step_cucumberContact;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactButtonSteps {
	@Steps
	private ContactScenarioSteps contactStep;

	@Before
	public void fullScreen() {
		contactStep.getDriver().manage().window().maximize();
	}

	@Given("Access home page")
	public void accessHomePage() {
		contactStep.open_page();
	}

	@When("Click contact button")
	public void clickContactButton() {
		contactStep.click_contact_button();
	}

	@And("Send message with input {string} and {string} and {string}")
	public void logInDemo(String email, String name, String message) throws InterruptedException {
		contactStep.send_message(email, name, message);
	}

	@Then("Confirm {string}")
	public void confirmSendMessage(String popup) {
		assertEquals(contactStep.getDriver().switchTo().alert().getText(), popup);
	}

	@When("Click contact button then click close button")
	public void clickButton() {
		contactStep.click_contact_button();
		contactStep.click_close();
	}

	@Then("Confirm go to back homepage")
	public void confirmGoBackHomePage() {
		assertEquals(contactStep.getDriver().getCurrentUrl(), "https://www.demoblaze.com/index.html");
	}

}
