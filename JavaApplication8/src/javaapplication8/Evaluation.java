package javaapplication8;

public class Evaluation {
   private int pawnBoardUser[][]={
        { 0,  0,  0,  0,  0,  0,  0,  0},
        { 50, 50, 50, 50, 50, 50, 50, 50},
        { 10, 10, 20, 30, 30, 20, 10, 10},
        { 5,  5, 10, 25, 25, 10,  5,  5},
        { 0,  0,  0, 20, 20,  0,  0,  0},
        { 5, -5,-10,  0,  0,-10, -5,  5},
        { 5, 10, 10,-20,-20, 10, 10,  5},
        { 0,  0,  0,  0,  0,  0,  0,  0}};
   
    private int pawnBoardMachine[][]={
        { 0,  0,  0,  0,  0,  0,  0,  0},
        { 5, 10, 10,-20,-20, 10, 10,  5},
        { 5, -5,-10,  0,  0,-10, -5,  5},
        { 0,  0,  0, 20, 20,  0,  0,  0},
        { 5,  5, 10, 25, 25, 10,  5,  5},
        { 10, 10, 20, 30, 30, 20, 10, 10},
        { 50, 50, 50, 50, 50, 50, 50, 50},
        { 0,  0,  0,  0,  0,  0,  0,  0}};
    
    private int rookBoardUser[][]={
        { 0,  0,  0,  0,  0,  0,  0,  0},
        { 5, 10, 10, 10, 10, 10, 10,  5},
        {-5,  0,  0,  0,  0,  0,  0, -5},
        {-5,  0,  0,  0,  0,  0,  0, -5},
        {-5,  0,  0,  0,  0,  0,  0, -5},
        {-5,  0,  0,  0,  0,  0,  0, -5},
        {-5,  0,  0,  0,  0,  0,  0, -5},
        { 0,  0,  0,  5,  5,  0,  0,  0}};
        
    private int rookBoardMachine[][]={
        { 0,  0,  0,  5,  5,  0,  0,  0},
        {-5,  0,  0,  0,  0,  0,  0, -5},
        {-5,  0,  0,  0,  0,  0,  0, -5},
        {-5,  0,  0,  0,  0,  0,  0, -5},
        {-5,  0,  0,  0,  0,  0,  0, -5},
        {-5,  0,  0,  0,  0,  0,  0, -5},
        { 5, 10, 10, 10, 10, 10, 10,  5},
        { 0,  0,  0,  0,  0,  0,  0,  0}};
       
    private int knightBoardUser[][]={
        {-50,-40,-30,-30,-30,-30,-40,-50},
        {-40,-20,  0,  0,  0,  0,-20,-40},
        {-30,  0, 10, 15, 15, 10,  0,-30},
        {-30,  5, 15, 20, 20, 15,  5,-30},
        {-30,  0, 15, 20, 20, 15,  0,-30},
        {-30,  5, 10, 15, 15, 10,  5,-30},
        {-40,-20,  0,  5,  5,  0,-20,-40},
        {-50,-40,-30,-30,-30,-30,-40,-50}};
    
    private int knightBoardMachine[][]={
        {-50,-40,-30,-30,-30,-30,-40,-50},
        {-40,-20,  0,  5,  5,  0,-20,-40},
        {-30,  5, 10, 15, 15, 10,  5,-30},
        {-30,  0, 15, 20, 20, 15,  0,-30},
        {-30,  5, 15, 20, 20, 15,  5,-30},
        {-30,  0, 10, 15, 15, 10,  0,-30},
        {-40,-20,  0,  0,  0,  0,-20,-40},
        {-50,-40,-30,-30,-30,-30,-40,-50}};
    
    private int bishopBoardUser[][]={
        {-20,-10,-10,-10,-10,-10,-10,-20},
        {-10,  0,  0,  0,  0,  0,  0,-10},
        {-10,  0,  5, 10, 10,  5,  0,-10},
        {-10,  5,  5, 10, 10,  5,  5,-10},
        {-10,  0, 10, 10, 10, 10,  0,-10},
        {-10, 10, 10, 10, 10, 10, 10,-10},
        {-10,  5,  0,  0,  0,  0,  5,-10},
        {-20,-10,-10,-10,-10,-10,-10,-20}};
    
       private int bishopBoardMachine[][]={
        {-20,-10,-10,-10,-10,-10,-10,-20},
        {-10,  5,  0,  0,  0,  0,  5,-10},
        {-10, 10, 10, 10, 10, 10, 10,-10},
        {-10,  0, 10, 10, 10, 10,  0,-10},
        {-10,  5,  5, 10, 10,  5,  5,-10},
        {-10,  0,  5, 10, 10,  5,  0,-10},
        {-10,  0,  0,  0,  0,  0,  0,-10},
        {-20,-10,-10,-10,-10,-10,-10,-20}};
       
    private int queenBoardUser[][]={
        {-20,-10,-10, -5, -5,-10,-10,-20},
        {-10,  0,  0,  0,  0,  0,  0,-10},
        {-10,  0,  5,  5,  5,  5,  0,-10},
        { -5,  0,  5,  5,  5,  5,  0, -5},
        {  0,  0,  5,  5,  5,  5,  0, -5},
        {-10,  5,  5,  5,  5,  5,  0,-10},
        {-10,  0,  5,  0,  0,  0,  0,-10},
        {-20,-10,-10, -5, -5,-10,-10,-20}};
    
    private int queenBoardMachine[][]={
        {-20,-10,-10, -5, -5,-10,-10,-20},
        {-10,  0,  5,  0,  0,  0,  0,-10},
        {-10,  5,  5,  5,  5,  5,  0,-10},
        {  0,  0,  5,  5,  5,  5,  0, -5},
        { -5,  0,  5,  5,  5,  5,  0, -5},
        {-10,  0,  5,  5,  5,  5,  0,-10},
        {-10,  0,  0,  0,  0,  0,  0,-10},
        {-20,-10,-10, -5, -5,-10,-10,-20}};
    
    private int kingMidBoard[][]={
        {-30,-40,-40,-50,-50,-40,-40,-30},
        {-30,-40,-40,-50,-50,-40,-40,-30},
        {-30,-40,-40,-50,-50,-40,-40,-30},
        {-30,-40,-40,-50,-50,-40,-40,-30},
        {-20,-30,-30,-40,-40,-30,-30,-20},
        {-10,-20,-20,-20,-20,-20,-20,-10},
        { 20, 20,  0,  0,  0,  0, 20, 20},
        { 20, 30, 10,  0,  0, 10, 30, 20}};
    private int kingEndBoard[][]={
        {-50,-40,-30,-20,-20,-30,-40,-50},
        {-30,-20,-10,  0,  0,-10,-20,-30},
        {-30,-10, 20, 30, 30, 20,-10,-30},
        {-30,-10, 30, 40, 40, 30,-10,-30},
        {-30,-10, 30, 40, 40, 30,-10,-30},
        {-30,-10, 20, 30, 30, 20,-10,-30},
        {-30,-30,  0,  0,  0,  0,-30,-30},
        {-50,-30,-30,-30,-30,-30,-30,-50}};

    
    
    public int evaluate(Square [][] squares, String col){
       return this.evalMaterial(squares, col)+ this.evalMobility()+ this.evalKingTropism(squares, col)+ this.evalPosition(squares, col);
    
    }
    public int evalMaterial(Square[][] squares, String col){
        int result=0;
        for (int i=0;i<8;i++)
        {  for (int j=0;j<8;j++)
            {  if(squares[i][j].getPiece().name=="King")
                {
                    if(squares[i][j].getPiece().getColor()==col)
                        result+=20000;
                    else
                        result-=20000;
                }
                else if (squares[i][j].getPiece().name=="Queen")
                {
                    if(squares[i][j].getPiece().getColor()==col)
                        result+=900;
                    else
                        result-=900;
                }
                else if (squares[i][j].getPiece().name=="Rook")
                {
                    if(squares[i][j].getPiece().getColor()==col)
                        result+=500;
                    else
                        result-=500;
                }
                else if (squares[i][j].getPiece().name=="Bishop")
                {
                    if(squares[i][j].getPiece().getColor()==col)
                        result+=330;
                    else
                        result-=330;
                }
                else if (squares[i][j].getPiece().name=="Knight")
                     {
                    if(squares[i][j].getPiece().getColor()==col)
                        result+=320;
                    else
                        result-=320;
                }
                    
                else if (squares[i][j].getPiece().name=="Pawn")
                {
                    if(squares[i][j].getPiece().getColor()==col)
                        result+=100;
                    else
                        result-=100;
                }
            }
        }
        return result;
    
    }
    
      public int evalPosition(Square [][] squares, String col){
        int result=0;
        if (SquarePanel.machineTurn)
        {
            for (int i=0;i<8;i++) {
                for (int j=0;j<8;j++)
                {
                if(squares[i][j].getPiece().name=="Knight") 
                {
                    if (squares[i][j].getPiece().getColor()==col)
                    {
                        result+=knightBoardMachine[i][j];
                    }
                }
                else if(squares[i][j].getPiece().name=="Bishop")
                {
                    if (squares[i][j].getPiece().getColor()==col)
                    { 
                        result+=bishopBoardMachine[i][j];
                    }
                }
                else if(squares[i][j].getPiece().name=="Rook")
                {
                    if (squares[i][j].getPiece().getColor()==col)
                       
                    {
                        result+=rookBoardMachine[i][j];
                    }
                    
                }
                else if(squares[i][j].getPiece().name=="Queen")
                {
                    if (squares[i][j].getPiece().getColor()==col)
                    { 
                        result+=queenBoardMachine[i][j];
                    }
                }
                else if(squares[i][j].getPiece().name=="Pawn")
                {
                    if (squares[i][j].getPiece().getColor()==col)
                    {
                        result+=pawnBoardMachine[i][j];
                    }
                    
                }
            }
        }
        }
        else //if user's turn
        {
        for (int i=0;i<8;i++) {
                for (int j=0;j<8;j++)
                {
                if(squares[i][j].getPiece().name=="Knight") 
                {
                    if (squares[i][j].getPiece().getColor()==col)
                    {
                        result+=knightBoardUser[i][j];
                    }
                }
                else if(squares[i][j].getPiece().name=="Bishop")
                {
                    if (squares[i][j].getPiece().getColor()==col)
                    { 
                        result+=bishopBoardUser[i][j];
                    }
                }
                else if(squares[i][j].getPiece().name=="Rook")
                {
                    if (squares[i][j].getPiece().getColor()==col)
                       
                    {
                        result+=rookBoardUser[i][j];
                    }
                    
                }
                else if(squares[i][j].getPiece().name=="Queen")
                {
                    if (squares[i][j].getPiece().getColor()==col)
                    {
                        result+=queenBoardUser[i][j];
                    }
                  
                }
                else if(squares[i][j].getPiece().name=="Pawn")
                {
                    if (squares[i][j].getPiece().getColor()==col)
                    { 
                        result+=pawnBoardUser[i][j];
                    }
                }
                    
            }
        }}
        return result;
    }
      public int evalKingTropism(Square [][] squares, String col){
          int result=0;
          int kX=0,kY=0;
          for (int i=0;i<8;i++) 
          {
            for (int j=0;j<8;j++)
            {
                if (squares[i][j].getPiece().name=="King")
                {  if (squares[i][j].getPiece().getColor()!=col)
                    {
                    kX=i;
                    kY=j;
                    }
                }
            }    
          }
          for (int i=0;i<8;i++) 
          {
            for (int j=0;j<8;j++)
            {
                
                if (squares[i][j].getPiece().name=="Queen" &&(squares[i][j].getPiece().getColor()==col))
                {
                    result-= Math.min( Math.abs( kX - i ),Math.abs( kY - j));

                }
                else  if (squares[i][j].getPiece().name=="Knight" &&(squares[i][j].getPiece().getColor()==col))
                {
                    result+= 5-(Math.min( Math.abs( kX - i ),Math.abs( kY - j)));

                }
                else  if ((squares[i][j].getPiece().name=="Rook"||squares[i][j].getPiece().name=="Bishop") &&(squares[i][j].getPiece().getColor())==col)
                {
                    result-= Math.min( Math.abs( kX - i ), Math.abs( kY - j));

                }
            }
          }
          
      return result;
      }
 public int evalMobility(){
    return 0;
    }



}
