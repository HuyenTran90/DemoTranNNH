package step_cucumberPlaceOrder;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class PlaceOrderSteps {
	@Steps
	private PlaceOrderScenarioSteps placeOrder;
	
	@Before
	public void fullScreen() {
		placeOrder.getDriver().manage().window().maximize();
	}
	
	@Given ("Access home page")
	public void accessHomePage() {
		placeOrder.open_page();
	}
	@When ("Add {string} to cart")
	public void clickProduct(String product) throws InterruptedException {
		placeOrder.click_product(product);
	}
	@And ("Click Add to cart button")
	public void click_add_to_cart() {
		placeOrder.click_add_to_cart();
	}
	
	@And ("Click Cart button")
	public void click_card_buton() {
		placeOrder.click_cart_button();
	}
	@And ("Click place order button")
	public void click_placeorder_button() throws InterruptedException {
		placeOrder.click_placeorder_button();
	}
	
	@And ("Input {string} and {string}")
	public void purchase(String name, String creditcard) throws InterruptedException {
		placeOrder.purchase (name, creditcard);
		Thread.sleep(4000);
	}
	
	@And ("Click button Purchase")
	public void click_purchase_button() throws InterruptedException {
		placeOrder.click_purchase_button();
		Thread.sleep(4000);
	}
	
	@Then("Confirm purchasecuccess with {string}")
	public void confirmPurchasesuccess(String message) {
		assertEquals(placeOrder.get_purchase_success(), message);
	}
	
	@Then("Confirm message {string}")
	public void confirmMessage(String errorMessage) {
		assertEquals(placeOrder.getDriver().switchTo().alert().getText(), errorMessage);
	}
	
	@And("click ok")
	public void clickOk() {
		placeOrder.click_ok();
	}
	
	@Then("Confirm url")
	public void confirmURL() {
		assertEquals(placeOrder.getDriver().getCurrentUrl(), "https://demoblaze.com/index.html");
	}
	
}

