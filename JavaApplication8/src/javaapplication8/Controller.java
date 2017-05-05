
package javaapplication8;

import java.awt.Color;

public class Controller {
    Player pp = new Player();
    WelcomePage ww = new WelcomePage();
    public void startNewGame(String Col){
        Board ss = new Board(Col);
        ss.setBoard(Col);
        makeMove();
    }
    
    public void viewGame(String Game){
        Square square = new Square();
        Board bb = new Board();
        bb.setVisible(true);
    }
    
    public void makeMove(){
        pp.takeTurns();
    }
    
    public void selectGame(){
        
    }
    
    public void ChooseColor(Color color){
        color = (Color)ww.CBColor.getSelectedItem();
    }
}
