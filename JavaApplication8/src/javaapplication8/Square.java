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

class Square extends JPanel {

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

    public JButton[][] sqaures = new JButton[8][8];


    public void getSquare(Location oldLocation, Location newLocation) {

        int iold = oldLocation.getI();
        int jold = oldLocation.getJ();
        int inew = newLocation.getI();
        int jnew = newLocation.getJ();
        Icon old = sqaures[iold][jold].getIcon();
        resetSquare(oldLocation);
        sqaures[inew][jnew].setIcon(old);

    }



    public void setPiece(JButton square, Piece piece) {
        square.setIcon(new ImageIcon(piece.getImage()));
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
                sqaures[i][j] = new JButton(" ");
                if (white == true) {
                    sqaures[i][j].setBackground(Color.WHITE);
                    this.add(sqaures[i][j]);
                    white = !white;

                } else {
                    sqaures[i][j].setBackground(Color.black);
                    this.add(sqaures[i][j]);
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

                    setPiece(sqaures[i][j], blackPieces[counter1++]);

                }
            }

            for (int i = 0; i < 1; i++) {
                for (int j = 7; j > 4; j--) {
                    setPiece(sqaures[0][j], blackPieces[counter1++]);

                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 8; j++) {
                    setPiece(sqaures[1][j], blackPieces[counter1++]);

                }
            }

            for (int i = 6; i < 7; i++) {
                for (int j = 0; j < 8; j++) {

                    setPiece(sqaures[i][j], whitePieces[counter2++]);

                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 0; j < 5; j++) {

                    setPiece(sqaures[i][j], whitePieces[counter2++]);

                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 7; j > 4; j--) {

                    setPiece(sqaures[i][j], whitePieces[counter2++]);

                }
            }

        } else {

            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {

                    setPiece(sqaures[i][j], whitePieces[counter2++]);

                }
            }

            for (int i = 0; i < 1; i++) {
                for (int j = 7; j > 4; j--) {

                    setPiece(sqaures[0][j], whitePieces[counter2++]);

                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 8; j++) {

                    setPiece(sqaures[1][j], whitePieces[counter2++]);

                }
            }

            for (int i = 6; i < 7; i++) {
                for (int j = 0; j < 8; j++) {

                    setPiece(sqaures[i][j], blackPieces[counter1++]);

                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 0; j < 5; j++) {
                    setPiece(sqaures[i][j], blackPieces[counter1++]);

                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 7; j > 4; j--) {
                    setPiece(sqaures[i][j], blackPieces[counter1++]);

                }
            }

        }

    }

    String Col;

    public void resetSquare(Location oldLocation) {
        int iold = oldLocation.getI();
        int jold = oldLocation.getJ();

        sqaures[iold][jold].setIcon(null);
    }

    static boolean old = false;
    static Icon nIcon;

    static Icon temp;

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

                temp = sqaures[rN][rN2].getIcon();
                sqaures[rN][rN2].setIcon(null);

                Random rn3 = new Random();

                int rN3 = rn3.nextInt(range);
                Random rn4 = new Random();
                int rN4 = rn2.nextInt(range);

                sqaures[rN3][rN4].setIcon(null);
                sqaures[rN3][rN4].setIcon(temp);

                i++;
            }

        });
        t.setRepeats(true);
        t.start();

    }

    public Square(String Col) {

        resetBoard(Col);

    }

    public Square() {
        resetBoard("White");
        setLocationViewGame();
    }

    static boolean machineTurn = false;

    public void setLocationPlayGame() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                final int a = i;
                final int b = j;

                sqaures[a][b].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        machineTurn = false;

                        Random randomGenerator = new Random();
                        int ii = randomGenerator.nextInt(8);

                        Random randomGenerator2 = new Random();
                        int jj = randomGenerator.nextInt(2);

                        Random randomGenerator3 = new Random();
                        int ii2 = randomGenerator.nextInt(8);

                        Random randomGenerator4 = new Random();
                        int jj2 = randomGenerator.nextInt(8);

                        machineTurn = true;

                        Location l;
                        l = new Location(a, b);
                        if (old == false) {
                            temp = sqaures[a][b].getIcon();
                            nIcon = temp;
                            sqaures[a][b].setIcon(null);
                            old = true;
                        } else {

                            sqaures[a][b].setIcon(null);
                            sqaures[a][b].setIcon(nIcon);
                            old = false;

                        }

                        temp = sqaures[jj][ii].getIcon();
                        sqaures[jj][ii].setIcon(null);
                        sqaures[ii2][jj2].setIcon(null);
                        sqaures[ii2][jj2].setIcon(temp);

                    }
                });
            }

        }
    }

    public void td() {

        setLocationPlayGame();
    }

}
