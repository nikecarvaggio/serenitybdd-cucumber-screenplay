package co.com.testing.retoweb.tasks;

import co.com.testing.retoweb.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class SelectGuestRadioButton implements Task {
    public static SelectGuestRadioButton succesfully(){
        return Tasks.instrumented(SelectGuestRadioButton.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.RADIO_BTN_GUEST).afterWaitingUntilEnabled(),
                Click.on(CheckoutPage.BTN_CONTINUE_CHECKOUT)
        );
    }
}
