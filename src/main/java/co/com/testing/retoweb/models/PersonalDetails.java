package co.com.testing.retoweb.models;

public class PersonalDetails {

    private String firstName, lastName, email, telephone, addressObligatory, city, postalCode, country, region;

    public PersonalDetails(String firstName, String lastName, String email, String telephone, String addressObligatory, String city, String postalCode, String country, String region) {
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

}
