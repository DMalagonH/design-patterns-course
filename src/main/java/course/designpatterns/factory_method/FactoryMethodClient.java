package course.designpatterns.factory_method;

public class FactoryMethodClient {
    public static void main(String[] args) {
        String[] chessPlayers = { "Homero", "Bart" };
        Board chessBoard = new ChessBoard(chessPlayers);
        chessBoard.initialize();

        String[] solitairePlayer = { "Lisa" };
        Board solitaireBoard = new SolitaireBoard(solitairePlayer);
        solitaireBoard.initialize();
    }
}
