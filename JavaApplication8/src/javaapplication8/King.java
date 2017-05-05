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
public class King extends Piece {


    public void setBlack()
    {
        this.image="..\\pictures\\black\\king.png";
    }
    
    
    
    public void setWhite()
    {
        this.image="..\\pictures\\white\\king.png";
    }
    
    @Override
    public ArrayList<Square> getValidMoves(Square[][] squares, Location current_location) {

        int x = current_location.getI();
        int y = current_location.getJ();

        int maxX = squares[0].length;
        int maxY = squares.length;
        ArrayList<Square> valid_moves = new ArrayList<>();

        int forward = y + 1;
        int backward = y - 1;
        int up = x - 1;
        int down = x + 1;

        if (down < maxX) {
            valid_moves.add(squares[down][y]);
        }
        if (up >= 0) {
            valid_moves.add(squares[up][y]);
        }
        if (forward < maxX) {
            valid_moves.add(squares[x][forward]);
            if (down < maxX) {
                valid_moves.add(squares[down][forward]);
            }
            if (up >= 0) {
                valid_moves.add(squares[up][forward]);
            }
        }
        if (backward >= 0) {
            valid_moves.add(squares[x][backward]);
            if (up >= 0) {
                valid_moves.add(squares[up][backward]);
            }
            if (down < maxX) {
                valid_moves.add(squares[down][backward]);
            }
        }

        return valid_moves;
    }

}
