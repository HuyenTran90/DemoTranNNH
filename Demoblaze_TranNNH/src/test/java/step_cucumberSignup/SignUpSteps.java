package step_cucumberSignup;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SignUpSteps {
	@Steps
	private SignUpScenarioStep signUpStep;
	
	@Before
	public void fullScreen() {
		signUpStep.getDriver().manage().window().maximize();
	}
	
	@Given("Access home page")
	public void accessHomePage() {
		signUpStep.open_page();
	}
	
	@When("Click signup button")
	public void clickSignupButton() {
		signUpStep.click_signup_Button_homePage();
	}
	
	@And ("Signup with input {string} and {string}")
	public void signUpDemo(String user, String pass) throws InterruptedException {
		signUpStep.sign_up_with_user_pass(user, pass);
		Thread.sleep(4000);
	}
	
	@Then("Display message {string}")
	public void confirmMessage(String message) {
		assertEquals(signUpStep.getDriver().switchTo().alert().getText(), message);
	}
	
	@And("Display error message {string}")
	public void confirmErrorMessage(String errorMessage) {
		assertEquals(signUpStep.getDriver().switchTo().alert().getText(), errorMessage);
	}
	
	@When ("Click signup button then click close button")
	public void clickButton()  {
		signUpStep.click_signup_Button_homePage();
		signUpStep.click_close();
	}
	
	@Then("Confirm go to back homepage")
	public void confirmGoBackHomePage() {
		assertEquals(signUpStep.getDriver().getCurrentUrl(),"https://www.demoblaze.com/index.html");
	}

}
