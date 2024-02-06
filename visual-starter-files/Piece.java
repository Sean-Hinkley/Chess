//import java.awt.image.BufferedImage;
//import java.awt.image.ImageObserver;
//import java.io.File;
//import java.io.IOException;
import java.awt.Image;
//import javax.imageio.ImageIO;

public interface Piece {
    public void Move();
    public void Take();
    public int[] get_pos();
    public Image get_pic();
    public int[][] Canmove();
    public void Get_pieces(Object[] Whites, Object[] Blacks);
}