package co.com.testing.retoweb.tasks;

import co.com.testing.retoweb.interactions.AddRandomProducts;
import co.com.testing.retoweb.userinterfaces.ShoppingCartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProducts implements Task {
    private int quantity;

    public AddProducts(int quantity) {
        this.quantity = quantity;
    }
    public static AddProducts randomly(int quantity){
        return Tasks.instrumented(AddProducts.class,quantity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ShoppingCartHomePage.PRODUCTS_BY_CATEGORY,isVisible()).forNoMoreThan(10).seconds(),
                AddRandomProducts.toTheCart(quantity)
        );
    }
}
