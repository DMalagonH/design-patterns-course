package course.designpatterns.factory_method;

// Concrete product
public class SolitaireGame implements Game {

    private String player;

    public SolitaireGame(String player) {
        this.player = player;
    }

    @Override
    public void start() {
        System.out.println("Inicia el juego de solitario");
    }
}
