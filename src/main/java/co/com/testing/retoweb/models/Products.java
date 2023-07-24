package co.com.testing.retoweb.models;

public class Products {

    private String nameProduct, priceNewProduct;
    private double priceOldProduct, priceTaxProduct;


    public Products(String nameProduct, String priceNewProduct, double priceOldProduct, double priceTaxProduct) {
        this.nameProduct = nameProduct;
        this.priceNewProduct = priceNewProduct;
        this.priceOldProduct = priceOldProduct;
        this.priceTaxProduct = priceTaxProduct;
    }
}
