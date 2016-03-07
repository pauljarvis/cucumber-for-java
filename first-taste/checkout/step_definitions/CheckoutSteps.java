package step_definitions;

import static org.junit.Assert.*;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.Checkout;

public class CheckoutSteps {

    int bananaPrice = 0;
    Checkout checkout;

    @Given("^the price of a \"([^\"]*)\" is (\\d+)p$")
    public void thePriceOfAIsP(String name, int price) throws Throwable {
        bananaPrice = price;
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @Then("^the total price should be (\\d+)p$")
    public void theTotalPriceShouldBeP(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }
}
