import java.awt.image.BufferedImage;


public class Rook extends Piece {
    
    public Rook(int color, int x, int y, BufferedImage im) {
        super(color,x,y,im);
    }

    public int math(int val, int tmp) {
        return val + tmp;
    }
    public boolean check(int n1, int n2, Board board) {
        if(n2>=0 && n2<=7 && n1>=0 && n1<=7) {
            if(color==0) {
                if(board.GameBoard[n1][n2].onePiece!=null) {
                    if(board.GameBoard[n1][n2].onePiece.color==1) {
                        board.GameBoard[n1][n2].modifier = 1;
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
            if(color==1) {
                
                if(board.GameBoard[n1][n2].onePiece!=null) {
                    if(board.GameBoard[n1][n2].onePiece.color==0) {
                        board.GameBoard[n1][n2].modifier = 1;
                        return true;
                    }
                    else {
                        return false;
                    }
                }


                
            }
            if(board.GameBoard[n1][n2].onePiece==null) {
                board.GameBoard[n1][n2].modifier = 1;
                return true;
            }
        }

        return false;
    }



    public void Movement(Board board) {
        int tmpx = 1;
        int tmpy = 1;
        int[] f = new int[]{1,1,1,1};
        while(true) {
            if (color==1) {
                if(f[0]==1) {
                    int n = math(x,tmpx);
                    boolean g = check(y, n, board);

                    if(g==false) {
                        f[0] = 0;
                    }

                    
                }
                if(f[1]==1) {
                    int v = -1*tmpx;
                    int n = math(x,v);
                    boolean g = check(y, n, board);

                    if(g==false) {
                        f[1] = 0;
                    }

                    
                }
                /*if(f[2]==1) {
                    int n = math(y,tmpy);
                    boolean g = check(n, x, board);

                    if(g==false) {
                        f[2] = 0;
                    }

                    
                }
                if(f[3]==1) {
                    int n = math(y,tmpy*-1);
                    boolean g = check(n, x, board);

                    if(g==false) {
                        f[3] = 0;
                    }

                tmpx++;
                tmpy++;

                    
                }*/
            }

            /*if (color==0) {
                if(board.GameBoard[this.y][this.x+tmpx].onePiece!=null) {
                    if(board.GameBoard[this.y][this.x+tmpx].onePiece.color==1) {
                        board.GameBoard[this.y][this.x+tmpx].modifier = 1;
                    }
                    else {
                        break;
                    }
                }
            }*/
            tmpx+=1;
            if(tmpx+x>7) {
                break;
            }
        
        }
    }

    public void spec(Board board) {}
}
