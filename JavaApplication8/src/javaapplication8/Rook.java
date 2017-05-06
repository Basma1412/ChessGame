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
        int x = current_location.getI();
        int y = current_location.getJ();
        
         int maxX = squares[0].length;
        int maxY = squares.length;


        ArrayList<Square> valid_moves = new ArrayList<>();
//left
        for (int i = y; i < maxY; i++) {
            valid_moves.add(squares[x][i]);
        }
//down
        for (int a = x; a < maxX; a++) {
            valid_moves.add(squares[a][y]);
        }
//up
        for (int a = 0; a < x; a++) {
            valid_moves.add(squares[a][y]);
        }
//right
        for (int a = 0; a < y; a++) {
            valid_moves.add(squares[x][a]);
        }
        return valid_moves;
    }
    
}
