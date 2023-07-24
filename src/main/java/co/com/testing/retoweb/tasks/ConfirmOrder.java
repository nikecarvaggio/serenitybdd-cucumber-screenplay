package co.com.testing.retoweb.tasks;

import co.com.testing.retoweb.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class ConfirmOrder implements Task {
    public static ConfirmOrder succesfully(){
        return Tasks.instrumented(ConfirmOrder.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.BTN_CONFIRM_ORDER).afterWaitingUntilEnabled()
        );
    }
}
