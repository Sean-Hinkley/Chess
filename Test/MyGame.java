import java.awt.Color;
//import java.awt.Font;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
//import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyGame extends Game  {
  public static final String TITLE = "MyGame";
  public static final int SCREEN_WIDTH = 1040;
  public static final int SCREEN_HEIGHT = 1040 ;

  
  // declare variables here
  int offsetX;
  int offsetY;
  Board Game;
  boolean selected;
  Tile tmp;
  BufferedImage[] White;
  BufferedImage[] Black;
  int pickx;
  int picky;
  int modx;
  int mody;
  

  public MyGame() {
    // initialize variables here
    offsetX = 100;
    offsetY = 100;
    Game = new Board(1);
    selected = false;
    try {
      White = new BufferedImage[] {ImageIO.read(new File("Images/White/Rook.png")),ImageIO.read(new File("Images/White/Knight.png")),ImageIO.read(new File("Images/White/Bishop.png")),ImageIO.read(new File("Images/White/Queen.png"))};
      Black = new BufferedImage[] {ImageIO.read(new File("Images/Black/Rook.png")),ImageIO.read(new File("Images/Black/Knight.png")),ImageIO.read(new File("Images/Black/Bishop.png")),ImageIO.read(new File("Images/Black/Queen.png"))};
    } catch(IOException e) {}
    pickx = -1;
    picky = -1;
  }
  
  public void update() {

  }
  
  public void draw(Graphics pen) {
    for(int row = 0; row < 8; row++) {
      for(int col = 0; col < 8; col++) {
        if(Game.GameBoard[row][col].color == 0) {
          pen.setColor(Color.BLACK);
          pen.fillRect((col*96)+offsetX, (row*96)+offsetY , 96, 96);

        }
        if(Game.GameBoard[row][col].color == 1) {
          pen.setColor(Color.WHITE);
          pen.fillRect((col*96)+offsetX, (row*96)+offsetY , 96, 96);

        }
        if(Game.GameBoard[row][col].modifier == 1) {
          pen.setColor(new Color(125,190,125));
          pen.fillRect((col*96)+offsetX, (row*96)+offsetY , 96, 96);

        }
        if(Game.GameBoard[row][col].onePiece!=null) {
          pen.drawImage(Game.GameBoard[row][col].onePiece.img, (col*96)+offsetX, (row*96)+offsetY, null);
        
        }

        if(Game.GameBoard[row][col].modifier == 3) {
          pickx = col;
          picky=row;
        }
      }

      
    }

    if(pickx >= 0 && picky >= 0) {
      pen.setColor(new Color(75,75,150));
      pen.fillRect((pickx*96)+offsetX, (picky*96)+offsetY , 384, 96);
      for(int x = 0; x<4; x++) {
        pen.drawImage(White[x], ((pickx+x)*96)+offsetX, (picky*96)+offsetY, null);
      }
    }
  }
      
  @Override
  public void keyTyped(KeyEvent ke) {}

  @Override
  public void keyPressed(KeyEvent ke) {}

  @Override
  public void keyReleased(KeyEvent ke) {}

  @Override
  public void mouseClicked(MouseEvent ke) {
    int y = (ke.getX()-offsetX-8)/96;
    int x = (ke.getY()-offsetY-32)/96;
    if(pickx == -1 && picky== -1) {
      if(selected==false) {
        if(Game.GameBoard[x][y].onePiece!=null) {
          Game.GameBoard[x][y].onePiece.Movement(Game);
          selected = true;
          tmp = Game.GameBoard[x][y];
          System.out.println(tmp);
        }
        
      }

      

      else if(selected==true) {
        System.out.println(Game.GameBoard[x][y].modifier);
        if (Game.GameBoard[x][y].modifier == 1) {
          System.out.println("Valid Move");
          Game.MovePiece(tmp, Game.GameBoard[x][y]);
          
          selected = false;
          Game.unMod();
          Game.GameBoard[x][y].onePiece.spec(Game);
        }
      

        else if(Game.GameBoard[x][y].modifier == 0) {
          System.out.println("Invalid Move");
          Game.unMod();
          
          selected = false;
        }
      }
    }
    if(pickx>=0 && picky>=0) {
      if(Game.GameBoard[x][y].onePiece.color==1) {
        System.out.println(y-pickx);
        if(y-pickx==0) {
          System.out.println(true);
          Game.GameBoard[x][y].onePiece = new Rook(Game.GameBoard[x][y].onePiece.color, pickx, picky, White[0]);
          Game.GameBoard[x][y].modifier = 0;
          
        }
      }
      pickx = -1;
      picky = -1;
    }


  }
  @Override
  public void mousePressed(MouseEvent me) {}
  
  @Override
  public void mouseReleased(MouseEvent me) {}

  @Override
  public void mouseEntered(MouseEvent me) {
    
  }

  @Override
  public void mouseExited(MouseEvent me) {}
      
      
  //Launches the Game
  public static void main(String[] args) { new MyGame().start(TITLE, SCREEN_WIDTH,SCREEN_HEIGHT); }
}