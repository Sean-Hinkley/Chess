import java.awt.Color;
//import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
//import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyGame extends Game  {
  public static final String TITLE = "MyGame";
  public static final int SCREEN_WIDTH = 1000;
  public static final int SCREEN_HEIGHT = 1000;

  
  // declare variables here
  Chess Game;
  int offsetX;
  int offsetY;
  Image[][] ImgMap;
  BufferedImage img;
  Image f; 
  int piece_clicked;
  public MyGame() {
    // initialize variables here
    ImgMap = new Image[2][6];
    offsetX = 100;
    offsetY = 100;
    Game = new Chess();
    try {
      img = ImageIO.read(new File("visual-starter-files\\Images\\Black\\Pawn.png"));
      f = img.getScaledInstance(64, 64, Image.SCALE_DEFAULT);
    } catch (IOException e) {}
  }
  
  public void update() {

  }
  
  public void draw(Graphics pen) {
    for(int row = 0; row < Game.Board.length; row++) {
      for(int col = 0; col < Game.Board[row].length; col++) {
        if(Game.Board[row][col][0]==1) {
          pen.setColor(new Color(255,255,51));
          pen.fillRect(row*64+offsetX, col*64+offsetY, 64, 64);
        }
        if(Game.Board[row][col][0]==0) {
          pen.setColor(new Color(255,100,100));
          pen.fillRect(row*64+offsetX, col*64+offsetY, 64, 64);
        }
        if(Game.Board[row][col][1]==1) {
          pen.drawImage(f, (row*64)+offsetX, (col*64)+offsetY, null);
        }
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
    piece_clicked = 0;
    int new_x = (ke.getX()-offsetX-8)/64;
    int new_y = (ke.getY()-offsetY-32)/64;
    System.out.println("X = : " + new_x);
    System.out.println("Y = : " + new_y);

    if(Game.Board[new_x][new_y][1]==1) {

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