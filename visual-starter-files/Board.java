public class Board {
    //Declare Variables

    Tile[][] GameBoard;

    int Player;


    //intitialize Variables

    public Board(int p) {
        Player = p;
        GameBoard = new Tile[8][8];
        GameBoard[1][0] = new Tile(0,0,new Pawn(), false);
        GameBoard[1][1] = new Tile(0,0,new Pawn(), false);
        GameBoard[1][2] = new Tile(0,0,new Pawn(), false);
        GameBoard[1][3] = new Tile(0,0,new Pawn(), false);
        GameBoard[1][4] = new Tile(0,0,new Pawn(), false);
        GameBoard[0][5] = new Tile(0,0,new Pawn(), false);
        GameBoard[0][6] = new Tile(0,0,new Pawn(), false);
        GameBoard[0][7] = new Tile(0,0,new Pawn(), false);
        GameBoard[0][8] = new Tile(0,0,new Pawn(), false);
        

    }
}
