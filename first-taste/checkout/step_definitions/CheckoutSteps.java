package step_definitions;

import static org.junit.Assert.*;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.Checkout;
import java.util.HashMap;
import java.util.Map;

public class CheckoutSteps {

    Map<String, Integer> prices = new HashMap<String, Integer>();
    Checkout checkout = new Checkout();

    @Given("^the price of a \"([^\"]*)\" is (\\d+)p$")
    public void thePriceOfAIsP(String name, int price) throws Throwable {
        prices.put(name, price);
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        checkout.add(itemCount, prices.get(itemName));
    }

    @Then("^the total price should be (\\d+)p$")
    public void theTotalPriceShouldBeP(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }
}
