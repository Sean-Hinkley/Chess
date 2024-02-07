public class Tile {

    //initialize Variables
    boolean col;
    int x;
    int y;
    Piece onePiece;
    int modifier;
    Tile up;
    Tile Down;
    Tile Left;
    Tile Right;
    //declare variables
    public Tile(int x, int y, Piece onTile, boolean color, Tile up, Tile Down, Tile Left, Tile Right) {
        this.x = x;
        this.y = y;
        onePiece = onTile;
        col = color;
        modifier = 0;
        this.up = up;
        this.Down = Down;
        this.Left = Left;
        this.Right = Right;

    }

    public String toString() {
        return "X" + x + " Y " + y;
    }


}
