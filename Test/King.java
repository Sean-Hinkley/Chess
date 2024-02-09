import java.awt.image.BufferedImage;

public class King extends Piece{
    


    public King(int color, int x, int y, BufferedImage im) {
        super(color,x,y,im);

    }

    public void check(int x, int y, Board board) {
        if(board.GameBoard[x][y].onePiece==null) {
            board.GameBoard[x][y].modifier = 1;
        }
    }


    public void Movement(Board board) {
        
    }
}
