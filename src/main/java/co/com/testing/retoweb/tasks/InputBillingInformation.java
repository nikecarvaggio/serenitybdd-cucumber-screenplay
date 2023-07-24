package co.com.testing.retoweb.tasks;

import co.com.testing.retoweb.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class InputBillingInformation implements Task {


    private String firstName, lastName, email, telephone, addressObligatory, city, postalCode, country, region;


    public InputBillingInformation(String firstName, String lastName, String email, String telephone, String addressObligatory, String city, String postalCode, String country, String region) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.addressObligatory = addressObligatory;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.region = region;
    }

    public static  InputBillingInformation withPersonalInformation(String firstName, String lastName, String email, String telephone, String addressObligatory, String city, String postalCode, String country, String region)
    {
        return Tasks.instrumented(InputBillingInformation.class,firstName, lastName, email, telephone, addressObligatory, city, postalCode, country, region);
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(CheckoutPage.TXT_PAYMENT_FIRSTNAME),
                Enter.theValue(lastName).into(CheckoutPage.TXT_PAYMENT_LASTNAME),
                Enter.theValue(email).into(CheckoutPage.TXT_PAYMENT_EMAIL),
                Enter.theValue(telephone).into(CheckoutPage.TXT_PAYMENT_TELEPHONE),
                Enter.theValue(addressObligatory).into(CheckoutPage.TXT_PAYMENT_ADDRESS_OBLIGATORY),
                Enter.theValue(city).into(CheckoutPage.TXT_PAYMENT_CITY),
                Enter.theValue(postalCode).into(CheckoutPage.TXT_PAYMENT_POSTALCODE),
                Click.on(CheckoutPage.TXT_PAYMENT_COUNTRY),
                SendKeys.of(country).into(CheckoutPage.TXT_PAYMENT_COUNTRY),
                SendKeys.of(Keys.ENTER).into(CheckoutPage.TXT_PAYMENT_COUNTRY),
                Click.on(CheckoutPage.TXT_PAYMENT_REGION),
                SendKeys.of(region).into(CheckoutPage.TXT_PAYMENT_REGION),
                SendKeys.of(Keys.ENTER).into(CheckoutPage.TXT_PAYMENT_REGION),
                Click.on(CheckoutPage.BTN_PAYMENT_CONTINUE_GUEST)
        );

        if(CheckoutPage.BTN_CONTINUE_SHIPPING_METHOD.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                Click.on(CheckoutPage.BTN_CONTINUE_SHIPPING_METHOD)
            );
        }
    }
}
