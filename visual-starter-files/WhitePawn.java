import java.awt.image.BufferedImage;
//import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.awt.Image;
import javax.imageio.ImageIO;

public class WhitePawn implements Piece{
    //Declare Variables
    int x;
    int y;
    boolean moved;
    BufferedImage img;
    Image f;
    Object[] WhitePieces;
    Object[] BlackPieces;
    



    //initiate Variables
    public WhitePawn(int x, int y) {
        moved = false;
        this.x = x;
        this.y = y;
        try {
            img = ImageIO.read(new File("visual-starter-files\\Images\\White\\Pawn.png"));
            f = img.getScaledInstance(64, 64, Image.SCALE_DEFAULT);
        } catch (IOException e) {}



    }
    public Image get_pic() {
        return f;

    }
    public int[] get_pos() {
        return new int[]{x, y};

    }


    public void Take() {

    }

    public void Move() {
        

    }
    
    public void check_pos() {
        for(int x = 0; x<7;x++){}
    }

    public int[][] Canmove() {
        if(moved==false) {
            if(true){}
        }
        if(moved==true) {

        }

        return new int[1][1];
    }
    public void Get_pieces(Object[] Whites, Object[] Blacks) {
        WhitePieces = new Object[] {Whites};
        BlackPieces = new Object[] {Blacks};

    }
}