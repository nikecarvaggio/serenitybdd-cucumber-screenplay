package co.com.testing.retoweb.questions;

import co.com.testing.retoweb.userinterfaces.ShoppingCartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValueOfProductsInShoppingCartPage implements Question<Boolean> {

    private int items;

    public ValueOfProductsInShoppingCartPage(int items) {
        this.items = items;
    }

    public static ValueOfProductsInShoppingCartPage theRememberedProducts(int products){
        return new ValueOfProductsInShoppingCartPage(products);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        double scale=Math.pow(10, 2);
        double total=0;
        for (int i=0; i<items;i++){
            total+=Double.parseDouble(actor.recall("Price "+i));
        }

        Double value= Double.parseDouble(ShoppingCartHomePage.TABLE_TOTAL_VALUE_PRODUCTS_IN_TABLE.resolveAllFor(actor).get(0).getText().replace("$","").replace(",",""));

        return value==total;
    }
}
