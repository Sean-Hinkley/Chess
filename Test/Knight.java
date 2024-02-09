import java.awt.image.BufferedImage;

public class Knight extends Piece{ 
    


    public Knight(int color, int x, int y, BufferedImage im) {
        super(color,x,y,im);
    }


    public boolean check(int x, int y, Board board) {
        if(x>=0 && x<=7 && y>=0 && y<=7) {
            if(board.GameBoard[x][y].onePiece==null) {
                board.GameBoard[x][y].modifier = 1;
            }
            if(board.GameBoard[x][y].onePiece!=null && board.GameBoard[x][y].onePiece.color==0 && this.color==1) {
                board.GameBoard[x][y].modifier = 1;
            }
            if(board.GameBoard[x][y].onePiece!=null && board.GameBoard[x][y].onePiece.color==1 && this.color==0) {
                board.GameBoard[x][y].modifier = 1;
            }

        }
        
        return true;
    }

    public void Movement(Board board) {
        int lng = 2;
        int sort = 1;

        check(x+lng, y+sort, board);
        check(x+lng, y-sort, board);
        check(x-lng, y+sort, board);
        check(x-lng, y-sort, board);
        check(x+sort, y+lng, board);
        check(x+sort, y-lng, board);
        check(x-sort, y+lng, board);
        check(x-sort, y-lng, board);
        

        

        
        
    }
    
}
