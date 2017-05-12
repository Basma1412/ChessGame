
package javaapplication8;

import java.awt.Color;

public class Controller {
    WelcomePage ww = new WelcomePage();
    
    public void startNewGame(String Col){
        Board ss = new Board(Col);
        ss.setVisible(true);
    }
    
    
    public void ChooseColor(Color color){
        color = (Color)ww.CBColor.getSelectedItem();
    }
}
