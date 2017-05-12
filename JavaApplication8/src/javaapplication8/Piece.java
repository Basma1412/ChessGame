package javaapplication8;

import java.util.ArrayList;

public abstract class Piece {

    String col;
    protected int x;
    protected int y;
    protected int piecenumber;
    protected String image;

    protected boolean userOwnership;

//    public void setColor(String color) {
//        col = color;
//        Board ss = new Board(col);
//        ss.setBoard(col);
//        ss.setGame();
//    }
//    
    public void setPieceToUser() {
        this.userOwnership = true;
    }

    public String getImage() {
        return this.image;
    }

    public Piece() {
        this.userOwnership = false;
    }

    public Piece(int piecenumber, int x, int y, String image) {
        this.x = x;
        this.y = y;
        this.piecenumber = piecenumber;
        this.image = image;

        this.userOwnership = false;
    }

    public boolean valid(Square squares[][], int a, int b, boolean temp) {
        Piece pieceonSquare = squares[a][b].getPiece();
        if (pieceonSquare == null) {
            return true;
        } else {
            if (pieceonSquare.userOwnership != temp) {
                return true;
            }
        }
        return false;
    }

    public abstract void setWhite();

    public abstract void setBlack();

    public abstract ArrayList<Square> getValidMoves(Square[][] squares, Location current_location);

}
