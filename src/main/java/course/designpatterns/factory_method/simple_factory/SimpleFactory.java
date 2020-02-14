package course.designpatterns.factory_method.simple_factory;

public class SimpleFactory {
    public static Game createGame(String type){
        if (type == null) return null;

        Game game = null;

        switch (type) {
            case "chess":
                game = new ChessGame();
                break;
            case "solitaire":
                game = new SolitaireGame();
                break;
        }

        return game;
    }
}
