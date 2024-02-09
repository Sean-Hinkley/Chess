import java.awt.image.BufferedImage;

public class Queen extends Piece{

    public Queen(int color, int x, int y, BufferedImage im) {
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
                        return false;
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
                        return false;
                    }
                    else {
                        return false;
                    }
                }


                
            }
            if(board.GameBoard[n1][n2].onePiece==null) {
                board.GameBoard[n1][n2].modifier = 1;
                System.out.println("hello");
                return true;
            }
            if(n1 >=7 || n1<=0 || n2 >=7 || n2 <=0) {
                return false;
            }
        }

        return false;
    }



    public void Movement(Board board) {
        int tmpx = 1;
        //int tmpy = 1;
        int[] f = new int[]{1,1,1,1,1,1,1,1};
        while(true) {
                if(f[0]==1) {
                    int n = math(tmpx,x);
                    int n1 = math(tmpx,y);
                    boolean g = check(n, n1, board);

                    if(g==false) {
                        f[0] = 0;
                    }

                    
                }
                
                if(f[1]==1) {
                    int v = -tmpx;
                    int n = math(x,v);
                    int n1 = math(y,v);
                    boolean g = check(n, n1, board);

                    if(g==false) {
                        f[1] = 0;
                    }

                    
                }
                if(f[2]==1) {
                    int n2 = -tmpx;
                    int n = math(y,n2);
                    
                    int n1 = math(x, tmpx);
                    boolean g = check(n1, n, board);

                    if(g==false) {
                        f[2] = 0;
                    }

                    
                }
                if(f[3]==1) {
                    int n = math(y,tmpx);
                    int n1 = -tmpx;
                    int n2 = math(x,n1);
                    boolean g = check(n2, n, board);

                    if(g==false) {
                        f[3] = 0;
                    }

                

                    
                }
                
                //straight
                if(f[4]==1) {
                    int n = math(tmpx,x);
                    
                    boolean g = check(n, y, board);

                    if(g==false) {
                        f[4] = 0;
                    }

                    
                }
                
                if(f[5]==1) {
                    int v = -tmpx;
                    int n = math(x,v);
                    boolean g = check(n, y, board);

                    if(g==false) {
                        f[5] = 0;
                    }

                    
                }
                if(f[6]==1) {
                    int n2 = -tmpx;
                    int n = math(y,n2);
                    

                    boolean g = check(x, n, board);

                    if(g==false) {
                        f[6] = 0;
                    }

                    
                }
                if(f[7]==1) {
                    int n = math(y,tmpx);
                    int n1 = -tmpx;

                    boolean g = check(x, n, board);

                    if(g==false) {
                        f[7] = 0;
                    }

                

                    
                }
                tmpx++;
                //tmpy++;
            
            if(f[0]==0 && f[1]==0 && f[2]==0 && f[3]==0) {
                break;
            }
        
        }
    }
    
}
