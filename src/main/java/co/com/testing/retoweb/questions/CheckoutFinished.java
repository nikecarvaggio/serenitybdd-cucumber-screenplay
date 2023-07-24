package co.com.testing.retoweb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CheckoutFinished implements Question<Boolean> {

    public static CheckoutFinished CheckProductsOnShoppingCart(){
        return new CheckoutFinished();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }
}
