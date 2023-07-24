package co.com.testing.retoweb.tasks;

import co.com.testing.retoweb.userinterfaces.ShoppingCartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class GoToTheCheckoutPage implements Task {
    public static GoToTheCheckoutPage succesfully(){
        return Tasks.instrumented(GoToTheCheckoutPage.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingCartHomePage.BTN_CHECKOUT).afterWaitingUntilEnabled()
        );
    }
}
