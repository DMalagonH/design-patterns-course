package course.designpatterns.command;

public class SaveCommand implements Command {

    private ProductService service;

    public SaveCommand(ProductService service) {
        this.service = service;
    }

    @Override
    public void execute(Product product) {
        service.save(product);
    }
}
