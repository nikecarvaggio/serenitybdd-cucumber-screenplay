package co.com.testing.retoweb.questions;

import co.com.testing.retoweb.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class OrderFinished implements Question<Boolean> {
    private String confirmationMessage;

    public OrderFinished(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }
    public static OrderFinished theProducsAddedOnShoppingCart(String message){
        return new OrderFinished(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String messageOrderFinished= CheckoutPage.LABEL_ORDER_FINISHED.resolveFor(actor).getText();
        return messageOrderFinished.equals(confirmationMessage);
    }
}
