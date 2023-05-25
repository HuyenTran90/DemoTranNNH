package step_cucumberLogin;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogInSteps {
	@Steps
	private LoginScenarioSteps logInStep;
	
	@Before
	public void fullScreen() {
		logInStep.getDriver().manage().window().maximize();
	}
	
	@Given("Access home page")
	public void accessHomePage() {
		logInStep.open_page();
	}
	
	@When("Click login button")
	public void clickLoginButton() {
		logInStep.click_login_Button_homePage();
	}
	
	@And ("Login with input {string} and {string}")
	public void logInDemo(String user, String pass) throws InterruptedException {
		logInStep.log_in_with_user_pass(user, pass);
	}
	
	@Then ("Confirm name of user {string}")
	public void confirmNameOfUser(String nameOfUser){
		assertEquals(logInStep.get_name_of_user(), nameOfUser );
	}
	
	@Then("Confirm message {string}")
	public void confirmMessage(String message) {
		assertEquals(logInStep.getDriver().switchTo().alert().getText(), message);
	}
	
	@When ("Click login button then click close button")
	public void clickButton()  {
		logInStep.click_login_Button_homePage();
		logInStep.click_close();
	}
	
	@Then("Confirm go to back homepage")
	public void confirmGoBackHomePage() {
		assertEquals(logInStep.getDriver().getCurrentUrl(),"https://www.demoblaze.com/index.html");
	}

}
