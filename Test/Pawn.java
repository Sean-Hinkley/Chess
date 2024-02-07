import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

public class Pawn extends Piece{
    int color;
    int x;
    int y;
    boolean moved;
    public Pawn(int color, int x, int y, BufferedImage im) {
        super(color, x, y, im);
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
