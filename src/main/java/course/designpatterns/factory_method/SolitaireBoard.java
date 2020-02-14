package course.designpatterns.factory_method;

public class SolitaireBoard extends Board {

    public SolitaireBoard(String[] players) {
        super(players);
    }

    @Override
    Game createGame() {
        String[] players = getPlayers();
        String player = "Jugador";
        if (players != null && players.length > 0) {
            player = players[0];
        }

        SolitaireGame game = new SolitaireGame(player);
        return game;
    }
}
