package co.com.testing.retoweb.interactions;

import co.com.testing.retoweb.userinterfaces.ShoppingCartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.core.Serenity;


import java.util.logging.Logger;

import static co.com.testing.retoweb.utils.Constants.LIST_PRODUCTS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddRandomProducts implements Interaction {
    private int quantity;

    public AddRandomProducts(int quantity) {
        this.quantity = quantity;
    }
    public static AddRandomProducts toTheCart(int quantity){
        return Tasks.instrumented(AddRandomProducts.class,quantity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ShoppingCartHomePage.PRODUCTS_BY_CATEGORY,isVisible())
        );

        for (int i=0; i<quantity;i++){

            int index=  (int)Math.round(Math.random()) ;
            String name, price, priceNew, priceOld, priceTax;
            try{
                name= ShoppingCartHomePage.TXT_NAME_PRODUCT.resolveAllFor(actor).get(index).getText();
            }
            catch (Exception e) {
                name="N/A";
                Logger.getAnonymousLogger().info("This product do not have this value");
            }
            try{
                price= ShoppingCartHomePage.TXT_PRICE_PRODUCT_WITHOUT_SPAN.resolveAllFor(actor).get(index).getText().split("Ex")[0].replace("$","").replace("\n","");
            }
            catch (Exception e) {
                price="N/A";
                Logger.getAnonymousLogger().info("This product do not have this value");
            }
            try{
                priceNew= ShoppingCartHomePage.TXT_PRICE_NEW_PRODUCT.resolveAllFor(actor).get(index).getText().replace("$","");
            }
            catch (Exception e) {
                priceNew="N/A";
                Logger.getAnonymousLogger().info("This product do not have this value");
            }
            try{
                priceOld= ShoppingCartHomePage.TXT_PRICE_OLD_PRODUCT.resolveAllFor(actor).get(index).getText().replace("$","");
            }
            catch (Exception e) {
                priceOld="N/A";
                Logger.getAnonymousLogger().info("This product do not have this value");
            }
            try{
                priceTax= ShoppingCartHomePage.TXT_PRICE_TAX_PRODUCT.resolveAllFor(actor).get(index).getText().replace("Ex Tax: $", "");
            }
            catch (Exception e) {
                priceTax="N/A";
                Logger.getAnonymousLogger().info("This product do not have this value");
            }


            String productLog=String.format("PRODUCT %d\n" +
                    "\tName: %s\n" +
                    "\tPrice: %s\n" +
                    "\tPrice New: %s\n" +
                    "\tPrice Old: %s\n" +
                    "\tPrice Tax: %s\n" +
                    "\tQuantity: %d\n",i+1,name,price,priceNew,priceOld,priceTax, 1);
            Logger.getAnonymousLogger().info(productLog);

            actor.remember("Price "+i, price);
            actor.remember("Price New"+i, priceNew);
            actor.remember("Price Old"+i, priceOld);
            actor.remember("Price Tax"+i, priceTax);
            actor.remember("Name "+i,name);


                    actor.attemptsTo(
                            Scroll.to(ShoppingCartHomePage.BTN_ADD_PRODUCT.resolveAllFor(actor).get(index)).andAlignToBottom(),
                            Click.on(ShoppingCartHomePage.BTN_ADD_PRODUCT.resolveAllFor(actor).get(index)).withNoDelay()
                    );
        }
        Serenity.getCurrentSession().put(LIST_PRODUCTS, actor.recallAll());
        Logger.getAnonymousLogger().info("Products added");
    }
}
