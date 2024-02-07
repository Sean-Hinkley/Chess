public class Pawn extends Piece{
    int color;
    int x;
    int y;
    boolean moved;
    public Pawn(int color, int x, int y) {
        super(color,x,y);
        moved = false;


    }
    public void Movement(Board board) {
        if(color==0) {
            if(moved == false && (board.GameBoard[x+1][y] == null && board.GameBoard[x+2][y] == null)) {
                
            }
            
        }
    }


    public String toString() {
        return "";
    }
    
}
