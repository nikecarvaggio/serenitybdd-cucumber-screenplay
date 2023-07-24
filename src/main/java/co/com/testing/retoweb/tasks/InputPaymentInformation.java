package co.com.testing.retoweb.tasks;

import co.com.testing.retoweb.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InputPaymentInformation implements Task {


    private String paymentDescription;

    public InputPaymentInformation(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }

    public static InputPaymentInformation withPaymentDescription(String paymentDescription)
    {
        return Tasks.instrumented(InputPaymentInformation.class, paymentDescription);
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {

        if(CheckoutPage.CHECKBOX_TERMS_AND_CONDITIONS.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Enter.theValue(paymentDescription).into(CheckoutPage.TXT_AREA_DESCRIPTION_PAYMENT),
                    Click.on(CheckoutPage.CHECKBOX_TERMS_AND_CONDITIONS),
                    Click.on(CheckoutPage.BTN_CONTINUE_PAYMENT)
            );
        }else {
            actor.attemptsTo(
                    Enter.theValue(paymentDescription).into(CheckoutPage.TXT_AREA_DESCRIPTION_PAYMENT),
                    Click.on(CheckoutPage.CHECKBOX_TERMS_AND_CONDITIONS_ALTERNATIVE),
                    Click.on(CheckoutPage.BTN_CONTINUE_PAYMENT)

            );
        }
    }
}
