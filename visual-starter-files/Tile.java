public class Tile {

    //initialize Variables
    boolean col;
    int x;
    int y;
    Piece onePiece;
    //declare variables
    public Tile(int x, int y, Piece onTile, boolean color) {
        this.x = x;
        this.y = y;
        onePiece = onTile;
        col = color;
        
    }


}
