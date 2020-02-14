package course.designpatterns.factory_method;

// Creator
public abstract class Board {

    private Game game;
    private String[] players;

    public Board(String[] players) {
        this.players = players;
    }

    // Factory Method
    abstract Game createGame();

    public void initialize() {
        game = createGame();
        game.start();
    }

    public String[] getPlayers() {
        return players;
    }
}
