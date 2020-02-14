package course.designpatterns.factory_method;

// Concrete creator
public class ChessBoard extends Board {

    public ChessBoard(String[] players) {
        super(players);
    }

    @Override
    Game createGame() {

        String[] players = getPlayers();

        String playerOne = "Blanco";
        String playerTwo = "Negro";

        if (players != null && players.length == 2) {
            playerOne = players[0];
            playerTwo = players[1];
        }

        ChessGame game = new ChessGame(playerOne, playerTwo);
        return game;
    }
}
