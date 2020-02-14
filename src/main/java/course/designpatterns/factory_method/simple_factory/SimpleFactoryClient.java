package course.designpatterns.factory_method.simple_factory;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        Game gameOne = SimpleFactory.createGame("chess");
        System.out.println(gameOne.getClass().getSimpleName());

        Game gameTwo = SimpleFactory.createGame("solitaire");
        System.out.println(gameTwo.getClass().getSimpleName());
    }
}
