package course.designpatterns.command;

import java.util.ArrayList;

// Invocador
public class Grid {

    private ArrayList<Product> products;
    private Command command;

    public Grid() {
        products = new ArrayList<>();

        products.add(new Product(101, "producto en grilla 1"));
        products.add(new Product(102, "producto en grilla 2"));
        products.add(new Product(103, "producto en grilla 3"));
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void update() {
        System.out.println("Desde el método update de la grilla");
        for (Product product: products) {
            command.execute(product);
        }
    }
}
