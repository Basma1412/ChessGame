package javaapplication8;

import java.util.ArrayList;

import java.util.ArrayList;

public class Pawn extends Piece {

    public void setBlack() {
        this.image = "..\\pictures\\black\\pawn.png";
    }

    public void setWhite() {
        this.image = "..\\pictures\\white\\pawn.png";
    }

    @Override
    public ArrayList<SquarePanel> getValidMoves(SquarePanel[][] squares, Location current_location) {
        int x = current_location.getI();
        int y = current_location.getJ();

        int maxX = squares[0].length;
        int maxY = squares.length;

        ArrayList<SquarePanel> valid_moves = new ArrayList<>();
        if (userOwnership == false) {
            int up = x + 1;
            int diaglefX = x + 1;
            int diaglefY = y - 1;
            int diagRightX = x + 1;
            int diagRightY = y + 1;
            if (x == 1) {
                for (int a = x; a < 4; a++) {
                    valid_moves.add(squares[a][y]);
                }
            } else {
                valid_moves.add(squares[up][y]);
                valid_moves.add(squares[diaglefX][diaglefY]);
                valid_moves.add(squares[diagRightX][diagRightY]);
            }

        } else {
            int upme = x - 1;
            int diaglefXme = x - 1;
            int diaglefYme = y - 1;
            int diagRightXme = x - 1;
            int diagRightYme = y + 1;
            if (x == 6) {
                for (int a = x; a < 3; a++) {
                    valid_moves.add(squares[a][y]);
                }
            } else {
                valid_moves.add(squares[upme][y]);
                valid_moves.add(squares[diaglefXme][diaglefYme]);
                valid_moves.add(squares[diagRightXme][diagRightYme]);
            }
        }
        return valid_moves;
    }

}
