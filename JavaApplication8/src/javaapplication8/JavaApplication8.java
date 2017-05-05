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
class Board extends JFrame {

    public JButton[][] box = new JButton[8][8];
    Square panl;
    Player pp;

    public Board(String Col) {

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        Container c = this.getContentPane();

        panl = new Square(Col);

        c.add(panl);

    }

    public Board() {

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        Container c = this.getContentPane();
        panl = new Square();
        c.add(panl);
    }

    public void setBoard(String col) {
        Board ss = new Board(col);
        ss.setVisible(true);
        ss.setGame();
    }

    List getPlayedMoves() {
        return null;
    }

    public void setGame() {
        panl.setLocationPlayGame();

    }
}

public class JavaApplication8 {

    public static void main(String[] args) {
        WelcomePage chess = new WelcomePage();
        chess.setVisible(true);
    }

}