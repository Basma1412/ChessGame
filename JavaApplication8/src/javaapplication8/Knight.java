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
    public ArrayList<Square> getValidMoves(Square[][] squares, Location current_location) {
       int x = current_location.getI();
        int y = current_location.getJ();
        
        int maxX = squares[0].length;
        int maxY = squares.length;


        ArrayList<Square> valid_moves = new ArrayList<>();

        int Xrightup = x-1;
        int Yrightup = y+2;
        
        int Xleftup = x-1;
        int Yleftup = y-2;
        
        int Xupright = x-2;
        int Yupright = y+1;
        
        int Xupleft = x-2;
        int Yupleft = y-1;
        
        int Xrightdown = x+1;
        int Yrightdown = y+2;
        
        int Xleftdown = x+1;
        int Yleftdown = y-2;
        
        int Xdownright = x+2;
        int Ydownright = y+1;
        
        int Xdownleft = x+2;
        int Ydownleft = y-1;
        
        if (Xrightup>0 && Xrightup<maxX && Yrightup>0 && Yrightup<maxY){
            valid_moves.add(squares[Xrightup][Yrightup]);
        }
         if (Xleftup>0 && Xleftup<maxX && Yleftup>0 && Yleftup<maxY){
            valid_moves.add(squares[Xleftup][Yleftup]);
        }
         if (Xupright>0 && Xupright<maxX && Yupright>0 && Yupright<maxY){
            valid_moves.add(squares[Xupright][Yupright]);
        }
         if (Xupleft>0 && Xupleft<maxX && Yupleft>0 && Yupleft<maxY){
            valid_moves.add(squares[Xupleft][Yupleft]);
        }
         if (Xrightdown>0 && Xrightdown<maxX && Yrightdown>0 && Yrightdown<maxY){
            valid_moves.add(squares[Xrightdown][Yrightdown]);
        }
         if (Xleftdown>0 && Xleftdown<maxX && Yleftdown>0 && Yleftdown<maxY){
            valid_moves.add(squares[Xleftdown][Yleftdown]);
        }
         if (Xdownright>0 && Xdownright<maxX && Ydownright>0 && Ydownright<maxY){
            valid_moves.add(squares[Xdownright][Ydownright]);
        }
         if (Xdownleft>0 && Xdownleft<maxX && Ydownleft>0 && Ydownleft<maxY){
            valid_moves.add(squares[Xdownleft][Ydownleft]);
        }
        
        
        
        return valid_moves;
    }
    
}
