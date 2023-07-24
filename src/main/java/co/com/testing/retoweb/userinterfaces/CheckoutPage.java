package co.com.testing.retoweb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target RADIO_BTN_GUEST=Target.the("Radio button for continue as GUEST").
            located(
                    By.xpath("//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input")
            );

    public static final Target BTN_CONTINUE_CHECKOUT=Target.the("Button con continue checkout").
            located(
                    By.id("button-account")
            );

    public static final Target TXT_PAYMENT_FIRSTNAME=Target.the("Text field for payment firstname").
            located(
                    By.id("input-payment-firstname")
            );

    public static final Target TXT_PAYMENT_LASTNAME=Target.the("Text field for payment lastname").
            located(
                    By.id("input-payment-lastname")
            );

    public static final Target TXT_PAYMENT_EMAIL=Target.the("Text field for payment email").
            located(
                    By.id("input-payment-email")
            );

    public static final Target TXT_PAYMENT_TELEPHONE=Target.the("Text field for payment telephone").
            located(
                    By.id("input-payment-telephone")
            );

    public static final Target TXT_PAYMENT_ADDRESS_OBLIGATORY=Target.the("Text field for payment address obligatory").
            located(
                    By.id("input-payment-address-1")
            );

    public static final Target TXT_PAYMENT_CITY=Target.the("Text field for payment city").
            located(
                    By.id("input-payment-city")
            );

    public static final Target TXT_PAYMENT_POSTALCODE=Target.the("Text field for payment postalcode").
            located(
                    By.id("input-payment-postcode")
            );

    public static final Target TXT_PAYMENT_COUNTRY=Target.the("Text field for payment country").
            located(
                    By.id("input-payment-country")
            );

    public static final Target TXT_PAYMENT_REGION=Target.the("Text field for payment region/state").
            located(
                    By.id("input-payment-zone")
            );

    public static final Target BTN_PAYMENT_CONTINUE_GUEST=Target.the("Button for continue the payment as guest").
            located(
                    By.id("button-guest")
            );

    public static final Target CHECKBOX_TERMS_AND_CONDITIONS=Target.the("Button for accept payment terms and conditions").
            located(
                    By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
            );


    public static final Target CHECKBOX_TERMS_AND_CONDITIONS_ALTERNATIVE=Target.the("Button for accept payment terms and conditions").
            located(
                    By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]")
            );

    public static final Target BTN_CONTINUE_PAYMENT=Target.the("Button to continue with payment").
            located(
                    By.id("button-payment-method")
            );

    public static final Target TXT_AREA_DESCRIPTION_PAYMENT=Target.the("Text area for description of payment").
            located(
                    By.xpath("//*[@id='collapse-payment-method']/div/p[3]/textarea")
            );

    public static final Target BTN_CONTINUE_SHIPPING_METHOD=Target.the("Button to continue with payment method").
            located(
                    By.id("button-shipping-method")
            );

    public static final Target BTN_CONFIRM_ORDER=Target.the("Button to confirm the orden").
            located(
                    By.id("button-confirm")
            );

    public static final Target LABEL_ORDER_FINISHED=Target.the("Button to confirm the orden").
            located(
                    By.xpath("//*[@id='content']/h1")
            );
}
