package javaapplication8;

 
public class Player {
    
    WelcomePage ww = new WelcomePage();
    String color = (String)ww.CBColor.getSelectedItem();
    Board bb = new Board(color);
    
    
    public void takeTurns(){
       bb.setGame();
    }
}
