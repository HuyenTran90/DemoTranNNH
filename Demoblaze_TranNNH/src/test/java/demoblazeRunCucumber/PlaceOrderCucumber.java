package demoblazeRunCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/placeOrder.feature", glue = {"step_cucumberPlaceOrder"})
public class PlaceOrderCucumber {

}
