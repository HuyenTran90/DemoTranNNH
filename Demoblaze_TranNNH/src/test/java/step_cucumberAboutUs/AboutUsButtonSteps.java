package step_cucumberAboutUs;


import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AboutUsButtonSteps {
	@Steps
	private AboutUsScenarioSteps aboutusSteps;

	@Before
	public void fullScreen() {
		aboutusSteps.getDriver().manage().window().maximize();
	}

	@Given("Access home page")
	public void accessHomePage() {
		aboutusSteps.open_page();
	}

	@When("Click aboutus button")
	public void clickAboutUsButton() throws InterruptedException {
		aboutusSteps.click_aboutUs_button();
		Thread.sleep(3000);
	}
	
	@Then("Confirm {string}")
	public void confirmPlayVideo(String pause) throws InterruptedException {
		aboutusSteps.click_play_video();
		Thread.sleep(2000);
		assertEquals(aboutusSteps.get_pause_button(), pause);
	}

	@When("Click about us button then click close button")
	public void clickButton() throws InterruptedException {
		aboutusSteps.click_aboutUs_button();
		Thread.sleep(3000);
		aboutusSteps.click_close_button();
		Thread.sleep(2000);
	}

	@Then("Confirm go to back homepage")
	public void confirmGoBackHomePage() {
		assertEquals(aboutusSteps.getDriver().getCurrentUrl(), "https://www.demoblaze.com/index.html");
	}

}
