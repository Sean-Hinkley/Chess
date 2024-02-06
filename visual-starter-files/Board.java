public class Board {
    //Declare Variables

    Tile[][] GameBoard;

    int Player;


    //intitialize Variables

    public Board(int p) {
        Player = p;
        GameBoard = new Tile[8][8];
        GameBoard[0][0] = new Tile(0,0,new WhitePawn(0, 0), false);
    }
}
