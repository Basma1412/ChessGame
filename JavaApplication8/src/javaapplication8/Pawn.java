
package javaapplication8;

import java.util.ArrayList;


public class Pawn extends Piece{



    public void setBlack()
    {
        this.image="..\\pictures\\black\\pawn.png";
    }
    
    
    
    public void setWhite()
    {
        this.image="..\\pictures\\white\\pawn.png";
    }
    
    
    @Override
    public ArrayList<Square> getValidMoves(Square[][] squares, Location current_location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
