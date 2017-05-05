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
public class Knight  extends Piece{

    public void setBlack()
    {
        this.image="..\\pictures\\black\\knight.png";
    }
    
    
    
    public void setWhite()
    {
        this.image="..\\pictures\\white\\knight.png";
    }
    
    
    @Override
    public ArrayList<SquarePanel> getValidMoves(SquarePanel[][] squares, Location current_location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
