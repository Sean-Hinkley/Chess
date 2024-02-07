public class Board {
    //Declare Variables

    Tile[][] GameBoard;

    int Player;


    //intitialize Variables

    public Board(int p) {
        Player = p;

        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {
                GameBoard[row][col] = new Tile(row,col,null,false,null,null,null,null);

                if(row>0) {
                    GameBoard[row][col].up = GameBoard[row-1][col];
                    GameBoard[row-1][col].Down = GameBoard[row][col];
                }
                if(col>0) {
                    GameBoard[row][col].Left = GameBoard[row][col-1];
                    GameBoard[row][col-1].Right = GameBoard[row][col];
                }
                System.out.println(GameBoard[row][col].up);
                System.out.println(GameBoard[row][col].Down);
                System.out.println(GameBoard[row][col].Left);
                System.out.println(GameBoard[row][col].Right + "\n\n\n\n\n\n");
            }
        }
        
        

    }
}
