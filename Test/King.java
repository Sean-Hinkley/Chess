import java.awt.image.BufferedImage;

public class King extends Piece{
    


    public King(int color, int x, int y, BufferedImage im, Board board) {
        super(color,x,y,im,board);

    }

    public void check(int x, int y, Board board) {
        if(board.GameBoard[x][y].onePiece==null) {
            board.GameBoard[x][y].modifier = 1;

        }
        if(board.GameBoard[x][y].onePiece!=null && board.GameBoard[x][y].onePiece.color==1 && this.color==0) {
            board.GameBoard[x][y].modifier = 1;
            
        }
        if(board.GameBoard[x][y].onePiece!=null && board.GameBoard[x][y].onePiece.color==0 && this.color==1) {
            board.GameBoard[x][y].modifier = 1;
            
        }
    }


    public void Movement() {
        
    }
}
