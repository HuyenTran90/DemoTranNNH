package step_cucumberAddToCart;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddToCartSteps {
	@Steps
	private AddToCartScenarioSteps addStep;
	
	@Before
	public void fullScreen() {
		addStep.getDriver().manage().window().maximize();
	}
	
	@Given("Access home page")
	public void accessHomePage() {
		addStep.open_page();
	}
	
	@When("Click product {string}")
	public void clickProduct(String product) throws InterruptedException {
		addStep.click_product(product);
	}
	
	@And ("Click Add to cart button")
	public void click_add_to_cart() throws InterruptedException {
		addStep.click_add_to_cart();
		Thread.sleep(4000);
	}
	
	@Then ("Confirm {string}")
	public void confirmProduct(String message){
		assertEquals(addStep.getDriver().switchTo().alert().getText(), message );
		addStep.getDriver().switchTo().alert().accept();
	}
	
	@And ("Click Add to cart button, Click cart button")
	public void click_cart() throws InterruptedException {
		addStep.click_add_to_cart();
		Thread.sleep(4000);
		addStep.getDriver().switchTo().alert().accept();
		addStep.click_cart_button();
		Thread.sleep(3000);
	}
	
	@Then("Confirm title {string}")
	public void confirmTitle(String title) {
		assertEquals(addStep.get_title(), title);
	}
	
	@Then("Confirm price {string}")
	public void confirmPrice(String price) {
		assertEquals(addStep.get_price(), price);
	}

}
