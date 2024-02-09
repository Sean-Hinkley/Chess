import java.awt.image.BufferedImage;


public class Pawn extends Piece{
    boolean moved;
    public Pawn(int color, int x, int y, BufferedImage im, Board board) {
        super(color, x, y, im,board);
        moved = false;



    }
    public void Movement() {
        if(color==0) {
            
            
            if(x <= 6 && board.GameBoard[x+1][y].onePiece == null) {
                board.GameBoard[x+1][y].modifier = 1;
                
                if(moved == false && board.GameBoard[x+2][y].onePiece == null){
                    board.GameBoard[x+2][y].modifier = 1;
                }
                
                
               
                
            }

            if(x<7 && y >0 && board.GameBoard[x+1][y-1].onePiece !=null && board.GameBoard[x+1][y-1].onePiece.color ==1) {
                board.GameBoard[x+1][y-1].modifier = 1;
            }
            if(x<7 && y <7 && board.GameBoard[x+1][y+1].onePiece !=null && board.GameBoard[x+1][y+1].onePiece.color ==1) {
                board.GameBoard[x+1][y+1].modifier = 1;
            }
            
        }
        if(color==1) {
            
            
            if(x > 0 && board.GameBoard[x-1][y].onePiece == null) {
                board.GameBoard[x-1][y].modifier = 1;
                
                if(moved == false && board.GameBoard[x-2][y].onePiece == null){
                    board.GameBoard[x-2][y].modifier = 1;
                }
                
                
               
                
            }
            if(x>0 && y >0 && board.GameBoard[x-1][y-1].onePiece !=null && board.GameBoard[x-1][y-1].onePiece.color ==0) {
                board.GameBoard[x-1][y-1].modifier = 1;
            }
            if(x>0 && y <7 && board.GameBoard[x-1][y+1].onePiece !=null && board.GameBoard[x-1][y+1].onePiece.color ==0) {
                board.GameBoard[x-1][y+1].modifier = 1;
            }
            
        }
    }


    public String toString() {
        if (color==0) {
            return "Black Pawn";
        }
        if (color==1) {
            return "White Pawn";
        }

        return null;
    }


    public void spec(Board board) {
        moved = true;

        if(color == 1) {
            if(x==0) {
                board.GameBoard[x][y].modifier = 3;
            }
        }
    }
    
}
