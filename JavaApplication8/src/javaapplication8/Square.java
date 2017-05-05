package javaapplication8;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.*;

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

    public JButton[][] sqaures = new JButton[8][8];

    ImageIcon[] WhitePieces = new ImageIcon[6];
    ImageIcon[] BlackPieces = new ImageIcon[6];

    public void getSquare(Location oldLocation, Location newLocation) {

        int iold = oldLocation.getI();
        int jold = oldLocation.getJ();
        int inew = newLocation.getI();
        int jnew = newLocation.getJ();
        Icon old = sqaures[iold][jold].getIcon();
        resetSquare(oldLocation);
        sqaures[inew][jnew].setIcon(old);

    }

    public void setBlackPiece() {
        BlackPieces[0] = new ImageIcon(("..\\pictures\\white\\pieces_8.png"));
        BlackPieces[1] = new ImageIcon(("..\\pictures\\white\\pieces_9.png"));
        BlackPieces[2] = new ImageIcon(("..\\pictures\\white\\pieces_10.png"));
        BlackPieces[3] = new ImageIcon(("..\\pictures\\white\\pieces_11.png"));
        BlackPieces[5] = new ImageIcon(("..\\pictures\\white\\pieces_12.png"));
        BlackPieces[4] = new ImageIcon(("..\\pictures\\white\\pieces_13.png"));
    }

    public void setWhitePiece() {
        WhitePieces[0] = new ImageIcon(("..\\pictures\\white\\pieces_2.png"));
        WhitePieces[1] = new ImageIcon(("..\\pictures\\white\\pieces_3.png"));
        WhitePieces[2] = new ImageIcon(("..\\pictures\\white\\pieces_4.png"));
        WhitePieces[3] = new ImageIcon(("..\\pictures\\white\\pieces_5.png"));
        WhitePieces[4] = new ImageIcon(("..\\pictures\\white\\pieces_6.png"));
        WhitePieces[5] = new ImageIcon(("..\\pictures\\white\\pieces_7.png"));
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

        setWhitePiece();
        setBlackPiece();

        if (Col.equalsIgnoreCase("White")) {
            // button.setIcon(new ImageIcon(img));

            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {
                    sqaures[i][j].setIcon((BlackPieces[j]));

                }
            }
            

            for (int i = 0; i < 1; i++) {
                for (int j = 7; j > 4; j--) {
                    sqaures[0][j].setIcon(BlackPieces[7 - j]);
                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 8; j++) {
                    sqaures[1][j].setIcon(BlackPieces[5]);
                }
            }

            for (int i = 6; i < 7; i++) {
                for (int j = 0; j < 8; j++) {
                    sqaures[i][j].setIcon(WhitePieces[5]);
                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 0; j < 5; j++) {
                    sqaures[i][j].setIcon(WhitePieces[j]);
                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 7; j > 4; j--) {
                    sqaures[i][j].setIcon(WhitePieces[7 - j]);
                }
            }

        } else {

            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {
                    sqaures[i][j].setIcon((WhitePieces[j]));

                }
            }

            for (int i = 0; i < 1; i++) {
                for (int j = 7; j > 4; j--) {
                    sqaures[0][j].setIcon(WhitePieces[7 - j]);
                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 8; j++) {
                    sqaures[1][j].setIcon(WhitePieces[5]);
                }
            }

            for (int i = 6; i < 7; i++) {
                for (int j = 0; j < 8; j++) {
                    sqaures[i][j].setIcon(BlackPieces[5]);
                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 0; j < 5; j++) {
                    sqaures[i][j].setIcon(BlackPieces[j]);
                }
            }

            for (int i = 7; i < 8; i++) {
                for (int j = 7; j > 4; j--) {
                    sqaures[i][j].setIcon(BlackPieces[7 - j]);
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
