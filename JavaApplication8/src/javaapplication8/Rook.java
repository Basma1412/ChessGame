/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;

/**
 *
 * @author Basma Mohamed
 */
public class Rook  extends Piece {

    
    public void setBlack()
    {
        this.image="..\\pictures\\black\\rook.png";
    }
    
    
    
    public void setWhite()
    {
        this.image="..\\pictures\\white\\rook.png";
    }
    

    @Override
    public ArrayList<Square> getValidMoves(Square[][] squares, Location current_location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
