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
public class Bishop  extends Piece{

    public Bishop(int piecenumber, int x, int y, String image) {
        super(piecenumber, x, y, image);
    }
 
    
    
    @Override
    public ArrayList<Square> getValidMoves(Square[][] squares, Location current_location) {

        int x = current_location.getI();
        int y = current_location.getJ();

        int maxX = squares[0].length;
        int maxY = squares.length;

        ArrayList<Square> valid_moves = new ArrayList<>();
 //diagonal up left
        for (int a = y, b = x; a < maxY && b >= 0; a++, b--) {
            valid_moves.add(squares[b][a]);
        }
//diagonal right down
        for (int a = y, b = x; a >= 0 && b < maxX; a--, b++) {
            valid_moves.add(squares[b][a]);
        }
//diagonal up right 
        for (int a = y, b = x; a >= 0 && b >= 0; a--, b--) {
            valid_moves.add(squares[b][a]);
        }
//diagonal down left
        for (int a = y, b = x; a < maxY && b < maxX; a++, b++) {
            valid_moves.add(squares[b][a]);
        }

        return valid_moves;
 
    }
    
}
