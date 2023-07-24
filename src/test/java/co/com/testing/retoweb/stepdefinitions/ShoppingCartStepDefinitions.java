package co.com.testing.retoweb.stepdefinitions;

import co.com.testing.retoweb.utils.Constants;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ShoppingCartStepDefinitions {

    @Given("I am on the product catalog page")
    public void iAmOnTheProductCatalogPage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(Constants.ACTOR);
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url(Constants.SHOPPING_CART_URL));
    }

}
