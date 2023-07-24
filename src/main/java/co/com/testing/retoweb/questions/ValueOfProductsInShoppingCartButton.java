package co.com.testing.retoweb.questions;

import co.com.testing.retoweb.userinterfaces.ShoppingCartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValueOfProductsInShoppingCartButton implements Question<Boolean> {
    private int items;

    public ValueOfProductsInShoppingCartButton(int items) {
        this.items = items;
    }
    public static ValueOfProductsInShoppingCartButton theRememberedProducts(int items){
        return new ValueOfProductsInShoppingCartButton(items);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        double scale=Math.pow(10, 2);
        double total=0;
        for (int i=0; i<items;i++){
            total+=Double.parseDouble(actor.recall("Price "+i));
        }

        double productsInCartButton=Double.parseDouble(ShoppingCartHomePage.TXT_AMOUNT_CART_BUTTON.resolveFor(actor).getText().split("- ")[1].replace("$","").replace(",",""));
        return productsInCartButton==Math.round(total*scale)/scale;
    }
}
