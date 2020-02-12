package course.designpatterns.command;

import java.util.ArrayList;

// Receptor
public class ProductService {
    private ArrayList<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }

    public void save(Product product) {
        System.out.println("Guardando producto " + product.getName());
        products.add(product);
    }
}
