package javaapplication8;

import java.awt.*;

public class Piece {
    String col;
    private int x;
     private int y;
     private int piecenumber;
     private String image;
    
    public void setColor(String color){
        col = color;
        Board ss = new Board(col);
        ss.setBoard(col);
        ss.setGame();
    }    
     
     public Piece(int piecenumber ,int x,int y,String image ){
         this.x=x;
         this.y=y;
         this.col=col;
         image=image;
     }
     
     
    
}

