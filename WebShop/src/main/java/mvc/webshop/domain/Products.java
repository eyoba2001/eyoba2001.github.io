package mvc.webshop.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Products {
    private Collection<Product> products = new ArrayList<Product>();

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
