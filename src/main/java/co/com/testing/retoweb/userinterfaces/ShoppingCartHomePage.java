package co.com.testing.retoweb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartHomePage {


    public static final Target PRODUCTS_BY_CATEGORY=Target.the("All products by category")
            .locatedBy("//div[@class='product-thumb transition']");

    public static final Target BTN_ADD_PRODUCT =Target.the("Add product button")
            .locatedBy("//div[@class='product-thumb transition']//child::button//child::span/..");

    public static final Target TXT_NAME_PRODUCT =Target.the("Name of the product")
            .locatedBy("//div[@class='product-thumb transition']//child::div[@class='caption']//child::a");

    public static final Target TXT_PRICE_PRODUCT_WITHOUT_SPAN =Target.the("Price of the product")
            .locatedBy("//div[@class='product-thumb transition']//child::div[@class='caption']//child::p[@class='price']");

    public static final Target TXT_PRICE_NEW_PRODUCT =Target.the("Price of the product")
            .locatedBy("//div[@class='product-thumb transition']//child::div[@class='caption']//child::span[@class='price-new']");

    public static final Target TXT_PRICE_OLD_PRODUCT =Target.the("Price of the product")
            .locatedBy("//div[@class='product-thumb transition']//child::div[@class='caption']//child::span[@class='price-old']");

    public static final Target TXT_PRICE_TAX_PRODUCT =Target.the("Price of the product")
            .locatedBy("//div[@class='product-thumb transition']//child::div[@class='caption']//child::span[@class='price-tax']");

    public static final Target BTN_GO_TO_CART=Target.the("Button access shopping cart").located(By.id("cart"));

    public static final Target TXT_AMOUNT_CART_BUTTON=Target.the("Amount of shopping cart button").located(By.id("cart-total"));

    public static final Target BTN_VIEW_CART=Target.the("Button to go to the shopping cart").located(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]/strong"));

    public static final Target TABLE_PRODUCTS_IN_SHOPPING_CART_PAGE=Target.the("Products in table shopping cart page").located(By.xpath("//*[@id='content']/form/div/table/tbody/tr"));

    public static final Target TABLE_TOTAL_VALUE_PRODUCTS_IN_TABLE= Target.the(
            "Total value of products in table shopping cart page"
    ).located(
            By.xpath(
                    "//*[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]")
    );

    public static final Target BTN_CHECKOUT=Target.the("Checkout Button").located(By.xpath("//*[@id='content']/div[3]/div[2]"));

}
