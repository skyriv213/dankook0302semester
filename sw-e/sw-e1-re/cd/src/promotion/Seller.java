package promotion;


import java.util.ArrayList;
import java.util.List;

public class Seller extends User {

    private boolean agreementBusiness;
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
