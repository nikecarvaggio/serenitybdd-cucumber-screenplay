package co.com.testing.retoweb.questions;

import co.com.testing.retoweb.userinterfaces.ShoppingCartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProductsInShoppingCartPage implements Question<Boolean> {
    private int items;

    public ProductsInShoppingCartPage(int items) {
        this.items = items;
    }
    public static ProductsInShoppingCartPage theProducsAddedOnShoppingCart(int items){
        return new ProductsInShoppingCartPage(items);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        int items= ShoppingCartHomePage.TABLE_PRODUCTS_IN_SHOPPING_CART_PAGE.resolveAllFor(actor).size();
        int itemsActorRemember=actor.recallAll().size();
        Boolean result=false;

        for(int i=0; i<items; i++){
            for(int j=0; j<itemsActorRemember; j++){
                if(ShoppingCartHomePage.TABLE_PRODUCTS_IN_SHOPPING_CART_PAGE.resolveAllFor(actor).get(i).getText().contains(actor.recall("Name "+j))){
                    result=true;
                    break;
                }else {
                    result=false;
                }
            }
            if(!result){
                return result;
            }
        }
        return result;
    }
}
