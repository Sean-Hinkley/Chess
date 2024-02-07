import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

class Piece {
    int color;
    int x;
    int y;
    BufferedImage img;
    public Piece(int color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;    
    }
    //
    public void Movement() {}


}