package javaapplication8;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Location {

    private int i;
    private int j;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public Location(int a, int b) {
        i = a;
        j = b;
    }
}

class Square extends JButton {

    Piece piece;

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return this.piece;
    }
}

class SquarePanel extends JPanel {

    public Square[][] squares = new Square[8][8];
    String Col;
    static boolean old = false;
    static Piece nIcon;
    static Piece temp;
    Square originSquare;
    static boolean machineTurn = false;

    public void setWhitePieces(Piece[] whitePieces) {
        whitePieces[0] = new Rook();
        whitePieces[1] = new Knight();
        whitePieces[2] = new Bishop();
        whitePieces[3] = new King();
        whitePieces[4] = new Queen();
        whitePieces[5] = new Bishop();
        whitePieces[6] = new Knight();
        whitePieces[7] = new Rook();

        for (int i = 8; i < 16; i++) {

            whitePieces[i] = new Pawn();
        }

        for (int i = 0; i < 16; i++) {
            whitePieces[i].setWhite();
        }

    }

    public void setBlackPieces(Piece[] blackPieces) {
        blackPieces[0] = new Rook();
        blackPieces[1] = new Knight();
        blackPieces[2] = new Bishop();
        blackPieces[3] = new King();
        blackPieces[4] = new Queen();
        blackPieces[5] = new Bishop();
        blackPieces[6] = new Knight();
        blackPieces[7] = new Rook();

        for (int i = 8; i < 16; i++) {

            blackPieces[i] = new Pawn();
        }

        for (int i = 0; i < 16; i++) {
            blackPieces[i].setBlack();
        }

    }

    public void getSquare(Location oldLocation, Location newLocation) {

        int iold = oldLocation.getI();
        int jold = oldLocation.getJ();
        int inew = newLocation.getI();
        int jnew = newLocation.getJ();
        Icon old = squares[iold][jold].getIcon();
        resetSquare(oldLocation);
        squares[inew][jnew].setIcon(old);

    }

    public void setPieceOnSquare(Square square, Piece piece) {
        square.setPiece(piece);
        if (piece != null) {
            square.setIcon(new ImageIcon(piece.getImage()));
        } else {
            square.setIcon(null);
        }
    }

    public void resetBoard(String Col) {
        this.Col = Col;
        int cnt = 0;
        this.setLayout(new GridLayout(8, 8));

        boolean white = true;
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                cnt++;
                if (cnt == 9) {
                    white = !white;
                    cnt = 1;
                }
                squares[i][j] = new Square();
                if (white == true) {
                    squares[i][j].setBackground(Color.WHITE);
                    this.add(squares[i][j]);
                    white = !white;

                } else {
                    squares[i][j].setBackground(Color.black);
                    this.add(squares[i][j]);
                    white = !white;
                }

            }
        }

        Piece[] whitePieces = new Piece[16];
        Piece[] blackPieces = new Piece[16];

        setWhitePieces(whitePieces);
        setBlackPieces(blackPieces);

        int counter1 = 0;
        int counter2 = 0;
        if (Col.equalsIgnoreCase("White")) {

            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {

                    setPieceOnSquare(squares[i][j], blackPieces[counter1++]);

                }
            }

            for (int i = 0; i < 1; i++) {
                for (int j = 7; j > 4; j--) {
                    setPieceOnSquare(squares[0][j], blackPieces[counter1++]);

                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 8; j++) {
                    setPieceOnSquare(squares[1][j], blackPieces[counter1++]);

                }
            }

            for (int i = 6; i < 7; i++) {
                for (int j = 0; j < 8; j++) {

                    whitePieces[counter2].setPieceToUser();
                    setPieceOnSquare(squares[i][j], whitePieces[counter2++]);

                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 0; j < 5; j++) {

                    whitePieces[counter2].setPieceToUser();
                    setPieceOnSquare(squares[i][j], whitePieces[counter2++]);

                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 7; j > 4; j--) {

                    whitePieces[counter2].setPieceToUser();
                    setPieceOnSquare(squares[i][j], whitePieces[counter2++]);

                }
            }

        } else {

            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {

                    setPieceOnSquare(squares[i][j], whitePieces[counter2++]);

                }
            }

            for (int i = 0; i < 1; i++) {
                for (int j = 7; j > 4; j--) {

                    setPieceOnSquare(squares[0][j], whitePieces[counter2++]);

                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 8; j++) {

                    setPieceOnSquare(squares[1][j], whitePieces[counter2++]);

                }
            }

            for (int i = 6; i < 7; i++) {
                for (int j = 0; j < 8; j++) {

                    blackPieces[counter1].setPieceToUser();
                    setPieceOnSquare(squares[i][j], blackPieces[counter1++]);

                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 0; j < 5; j++) {

                    blackPieces[counter1].setPieceToUser();
                    setPieceOnSquare(squares[i][j], blackPieces[counter1++]);

                }
            }

            for (int i = 7; i < 8; i++) {

                for (int j = 7; j > 4; j--) {

                    blackPieces[counter1].setPieceToUser();
                    setPieceOnSquare(squares[i][j], blackPieces[counter1++]);

                }
            }

        }

    }

    public void resetSquare(Location oldLocation) {
        int iold = oldLocation.getI();
        int jold = oldLocation.getJ();

        squares[iold][jold].setIcon(null);
    }

    public void setLocationViewGame() {
        final Timer t = new Timer(500, null);
        t.addActionListener(new ActionListener() {
            int i = 0;

            public void actionPerformed(ActionEvent e) {

                if (i > 10) {
                    t.stop();
                }

                Random rn = new Random();
                int range = 8;
                int rN = rn.nextInt(range) + 0;
                Random rn2 = new Random();
                int rN2 = rn2.nextInt(range) + 0;

                temp = squares[rN][rN2].getPiece();
                squares[rN][rN2].setIcon(null);

                Random rn3 = new Random();

                int rN3 = rn3.nextInt(range);
                Random rn4 = new Random();
                int rN4 = rn2.nextInt(range);

                squares[rN3][rN4].setIcon(null);
                squares[rN3][rN4].setPiece(temp);

                i++;
            }

        });
        t.setRepeats(true);
        t.start();

    }

    public SquarePanel(String Col) {

        resetBoard(Col);

    }

    public SquarePanel() {
        resetBoard("White");
        setLocationViewGame();
    }

    public void playComputer() {

    }

    public void playUser() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                final int a = i;
                final int b = j;

                squares[a][b].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (old == false) {
                            boolean userPiece = false;
                            Piece pieceonSquare = squares[a][b].getPiece();
                            if (pieceonSquare != null) {
                                userPiece = pieceonSquare.userOwnership;
                            }

                            if (userPiece) {
                                temp = squares[a][b].getPiece();
                                nIcon = temp;
                                originSquare=squares[a][b];
                                setPieceOnSquare(squares[a][b], null);
                                old = true;
                            }
                        } else {
                            boolean userPiece2 = false;
                            Piece piece2onSquare = squares[a][b].getPiece();
                            if (piece2onSquare != null) {
                                userPiece2 = piece2onSquare.userOwnership;
                            }
                            if (!userPiece2) {
                                setPieceOnSquare(squares[a][b], null);
                                setPieceOnSquare(squares[a][b], nIcon);
                            }
                            else 
                            {
                               setPieceOnSquare(originSquare, nIcon);   
                            }

                            old = false;
                        }
                    }
                });
            }
        }

    }

    public void playGame() {

        if (machineTurn) {
            playComputer();
            playUser();
            machineTurn = false;
        } else {
            playUser();
            playComputer();
            machineTurn = true;

        }

    }

    public void td() {

        playGame();
    }

}
