
public class Tile {

    //initialize Variables
    int color;
    int x;
    int y;
    Piece onePiece;
    int modifier;
    Tile up;
    Tile Down;
    Tile Left;
    Tile Right;
    //declare variables
    public Tile(int x, int y, Piece onTile, int color, Tile up, Tile Down, Tile Left, Tile Right) {
        this.x = x;
        this.y = y;
        onePiece = onTile;
        this.color = color;
        modifier = 0;
        this.up = up;
        this.Down = Down;
        this.Left = Left;
        this.Right = Right;

    }

    public String toString() {
        if(color==1) {return "White";}
        if(color==0) {return "Black";}

        return null;
    }


}
