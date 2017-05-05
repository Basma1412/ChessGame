package javaapplication8;

import java.awt.*;
import javax.swing.*;

class Board extends JFrame {

    public JButton[][] box = new JButton[8][8];
    SquarePanel panl;
    Player pp;

    public Board(String Col) {

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 1000);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        Container c = this.getContentPane();

        panl = new SquarePanel(Col);

        c.add(panl);

    }

    public Board() {

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 1000);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        Container c = this.getContentPane();
        panl = new SquarePanel();
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
