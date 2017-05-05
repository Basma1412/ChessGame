package javaapplication8;

import java.util.ArrayList;

public abstract class Piece {

    String col;
    protected int x;
    protected int y;
    protected int piecenumber;
    protected String image;

    public void setColor(String color) {
        col = color;
        Board ss = new Board(col);
        ss.setBoard(col);
        ss.setGame();
    }
    
    
    public String getImage()
    {
        return this.image;
    }
    
    public Piece ()
    {
        
    }

    public Piece(int piecenumber, int x, int y, String image) {
        this.x = x;
        this.y = y;
        this.piecenumber = piecenumber;
        this.image = image;
    }

    
    
    
    public abstract void setWhite();
    
    
    public abstract void setBlack();
    
    
    public abstract ArrayList<Square> getValidMoves(Square[][] squares, Location current_location);

}
