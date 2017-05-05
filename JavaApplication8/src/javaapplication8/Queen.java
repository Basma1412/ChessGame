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
public class Queen extends Piece {

 

   
    
    public void setBlack()
    {
        this.image="..\\pictures\\black\\queen.png";
    }
    
    
    
    public void setWhite()
    {
        this.image="..\\pictures\\white\\queen.png";
    }
    
    
    @Override
    public ArrayList<Square> getValidMoves(Square[][] squares, Location current_location) {

        int x = current_location.getI();
        int y = current_location.getJ();

        int maxX = squares[0].length;
        int maxY = squares.length;

        int up = x - 1;
        int down = x + 1;

        ArrayList<Square> valid_moves = new ArrayList<>();
//left
        for (int a = y; a < maxY; a++) {
            valid_moves.add(squares[x][a]);

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
