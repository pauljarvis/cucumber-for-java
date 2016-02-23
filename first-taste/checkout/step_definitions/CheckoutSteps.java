package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;

public class CheckoutSteps {
    @Given("^the price of a \"([^\"]*)\" is (\\d+)p$")
    public void thePriceOfAIsP(String name, int price) throws Throwable {
        int bananaPrice = price;
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        Checkout checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @Then("^the total price should be (\\d+)p$")
    public void theTotalPriceShouldBeP(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
