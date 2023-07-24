package co.com.testing.retoweb.tasks;

import co.com.testing.retoweb.userinterfaces.ShoppingCartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class GoToTheShoppingCartPage implements Task {
    public static GoToTheShoppingCartPage succesfully(){
        return Tasks.instrumented(GoToTheShoppingCartPage.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingCartHomePage.BTN_GO_TO_CART).afterWaitingUntilEnabled(),
                Click.on(ShoppingCartHomePage.BTN_VIEW_CART)
        );
    }
}
