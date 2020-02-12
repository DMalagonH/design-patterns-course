package course.designpatterns.command;

import java.util.Random;

// Invocador
public class Form {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void save() {
        System.out.println("Desde el metodo save del formulario");
        Product product = getProduct();

        command.execute(product);
    }

    private Product getProduct() {
        int id = new Random().nextInt(1000);
        Product product = new Product(id, "product " + id);
        return product;
    }
}
