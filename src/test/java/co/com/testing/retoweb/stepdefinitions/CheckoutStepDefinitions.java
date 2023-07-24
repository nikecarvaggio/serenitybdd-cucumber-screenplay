package co.com.testing.retoweb.stepdefinitions;

import co.com.testing.retoweb.questions.CheckoutFinished;
import co.com.testing.retoweb.questions.OrderFinished;
import co.com.testing.retoweb.tasks.*;
import co.com.testing.retoweb.utils.Constants;
import co.com.testing.retoweb.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class CheckoutStepDefinitions {

    @When("I select {string}")
    public void iSelect(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectGuestRadioButton.succesfully()
        );
    }
    @When("I enter my shipping information")
    public void iEnterMyShippingInformation(DataTable personalDetails) {
        List<String> data = personalDetails.row(0);
        OnStage.theActorInTheSpotlight().attemptsTo(
                InputBillingInformation.withPersonalInformation(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(6), data.get(7), data.get(8))
        );
    }
    @When("I enter my payment details")
    public void iEnterMyPaymentDetails(DataTable descriptionPayment) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                InputPaymentInformation.withPaymentDescription(descriptionPayment.row(0).get(0))
        );
    }
    @When("I confirm the order")
    public void iConfirmTheOrder() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ConfirmOrder.succesfully()
        );
    }
    @Then("I should see a confirmation message with the text {string}")
    public void iShouldSeeAConfirmationMessageWithTheText(String confirmationMessage) {
        OnStage.theActorInTheSpotlight().asksFor(
                OrderFinished.theProducsAddedOnShoppingCart(confirmationMessage)
        );
    }

    @Given("I am on the checkout page")
    public void iAmOnTheCheckoutPage() {
        OnStage.theActorCalled(Constants.ACTOR);
        OnStage.theActorInTheSpotlight().wasAbleTo(
                GoToTheCheckoutPage.succesfully()
        );
    }

    @And("I check products on the cart")
    public void iCheckProductsOnTheCart() {
        OnStage.theActorInTheSpotlight().asksFor(
                CheckoutFinished.CheckProductsOnShoppingCart()
        );
    }
}
