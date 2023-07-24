package co.com.testing.retoweb.stepdefinitions;

import co.com.testing.retoweb.questions.ProductsInShoppingCartButton;
import co.com.testing.retoweb.questions.ProductsInShoppingCartPage;
import co.com.testing.retoweb.questions.ValueOfProductsInShoppingCartButton;
import co.com.testing.retoweb.questions.ValueOfProductsInShoppingCartPage;
import co.com.testing.retoweb.tasks.AddProducts;
import co.com.testing.retoweb.tasks.GoToTheShoppingCartPage;
import co.com.testing.retoweb.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;


public class ManageProductsStepDefinitions {


    @When("I add {int} products to the cart")
    public void iAddProductsToTheCart(int quantity) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProducts.randomly(quantity)
        );
    }

    @Then("the cart should contain {int} products")
    public void theCartShouldContain(int productsOnCart) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().asksFor(
                ProductsInShoppingCartButton.theProducsAddedOnShoppingCart(productsOnCart)
        );
    }
    @Then("the cart total should be the sum of the prices of {int} products added")
    public void theCartTotalShouldBeTheSumOfThePricesOfAnd(int products) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().asksFor(
                ValueOfProductsInShoppingCartButton.theRememberedProducts(products)
        );
    }

    @Given("I view the cart")
    public void iViewTheCart() {
        OnStage.theActorCalled(Constants.ACTOR).wasAbleTo(
                GoToTheShoppingCartPage.succesfully()
        );
    }
    @Then("I should see {int} products in the cart")
    public void iShouldSeeProductsInTheCart(int products) {
        OnStage.theActorInTheSpotlight().asksFor(
                ProductsInShoppingCartPage.theProducsAddedOnShoppingCart(products)
        );
    }
    @Then("the cart total of the {int} products should be displayed correctly")
    public void theCartTotalShouldBeDisplayedCorrectly(int items) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().asksFor(
                ValueOfProductsInShoppingCartPage.theRememberedProducts(items)
        );
    }

}
