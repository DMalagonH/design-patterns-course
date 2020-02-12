package course.designpatterns.command;

public class CommandClient {

    public static void main(String[] args) {
        ProductService service = new ProductService();
        Command saveCommand = new SaveCommand(service);

        Form form = new Form();
        form.setCommand(saveCommand);

        Grid grid = new Grid();
        grid.setCommand(saveCommand);

        form.save();
        grid.update();
    }
}
