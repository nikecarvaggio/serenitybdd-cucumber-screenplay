package co.com.testing.retoweb.questions;

import co.com.testing.retoweb.userinterfaces.ShoppingCartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProductsInShoppingCartButton implements Question<Boolean> {
    private int items;

    public ProductsInShoppingCartButton(int items) {
        this.items = items;
    }
    public static ProductsInShoppingCartButton theProducsAddedOnShoppingCart(int items){
        return new ProductsInShoppingCartButton(items);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int productsInCartButton=Integer.parseInt(ShoppingCartHomePage.TXT_AMOUNT_CART_BUTTON.resolveFor(actor).getText().split(" item")[0]);
        return productsInCartButton==items;
    }
}
