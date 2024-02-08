
//import java.awt.Font;

//import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class Board {
    //Declare Variables

    Tile[][] GameBoard;

    int Player;
    int color;
    BufferedImage img;


    //intitialize Variables

    public Board(int p) {
        Player = p;
        color = 0;
        GameBoard = new Tile[8][8];
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {
                if (color == 0) {
                    GameBoard[row][col] = new Tile(row,col,null,0,null,null,null,null);
                    color = 1;
                }
                else if (color == 1) {
                    GameBoard[row][col] = new Tile(row,col,null,1,null,null,null,null);

                    color = 0;
                }

                if(row>0) {
                    GameBoard[row][col].up = GameBoard[row-1][col];
                    GameBoard[row-1][col].Down = GameBoard[row][col];
                }
                if(col>0) {
                    GameBoard[row][col].Left = GameBoard[row][col-1];
                    GameBoard[row][col-1].Right = GameBoard[row][col];
                }
            }
            if (color == 1) {
                color = 0;
            }
            else if (color ==0) {
                color = 1;
            }
        }
        img = null;
        try {
            img = ImageIO.read(new File("Images/Black/Pawn.png"));
            
            GameBoard[1][3].onePiece = new Pawn(0, 1,3, img);

            img = ImageIO.read(new File("Images/White/Pawn.png"));
            
            GameBoard[2][2].onePiece = new Pawn(1, 2,2, img);
        } catch(IOException e) {}
        

    }

    public String toString() {
        String result = "";
        for(int x = 0; x<8; x++) {
            for(int y = 0; y<8; y++) {
                result += GameBoard[x][y].toString() + "      ";
            }
            result += "\n\n\n";
        }

        return result;
    }

    public void unMod() {
        for(int x = 0; x<8; x++) {
            for(int y = 0; y<8; y++) {
                if(GameBoard[x][y].modifier == 1) {
                    GameBoard[x][y].modifier = 0;
                }
            }
        }
    }

    public void MovePiece(Tile start, Tile dest) {
        Tile st = start;
        Tile de = dest;
        Piece tmp = st.onePiece;
        de.onePiece = tmp;
        st.onePiece = null;


        
        tmp.x = de.x;
        tmp.y = de.y;
    }
}
