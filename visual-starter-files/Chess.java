public class Chess {
    int[][][] Board;
    boolean black;
    Object WhitePieces[];
    Object BlackPieces[];
    public Chess() {
        black = false;
        Board = new int[8][8][2];
        for(int row = 0; row < Board.length; row++) {
            for(int col = 0; col < Board[row].length; col++) {
                if(black == false) {
                    Board[row][col][0] = 0;
                    black = true;
                }
                else if(black == true) {
                    Board[row][col][0] = 1;
                    black = false;
                }
            }
            if(black == false) {
                black = true;
            }
            else if(black == true) {
                black = false;
            }
        }
        Board[0][0][1] = 1;
    }
    public void WhitePawn(int x, int y) {
        //needs to be able to detect what moves are valid and which ones arent
        if(Board[y-1][x][1]==0) {

        }
    }
    public void Move_piece(int startx, int starty, int movedx, int movedy, int piece) {
        Board[movedx][movedy][1] = piece;
        Board[startx][starty][1] = 0;
    }
}
