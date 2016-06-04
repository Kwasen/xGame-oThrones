//display after a game ends in a tie

package xgame.othrones;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Mabweh
 */


public class endGameTie  implements ActionListener{
    
    
    JFrame boxEnd = new JFrame("R-E-S-U-L-T");
    JButton tryAgain = new JButton("Battle Field");
    JButton returnMenu = new JButton("My Palace");
    JLabel msgTie = new JLabel("Click on Battle field to try again, click on My Palace to return to the main menu");
    
 public endGameTie(){
 
 boxEnd.setLayout(new FlowLayout());
 boxEnd.add(msgTie);
 boxEnd.add(tryAgain);
 boxEnd.add(returnMenu);
 
 
    boxEnd.setSize(200,200); 
    
    tryAgain.addActionListener(this);
    returnMenu.addActionListener(this);
    
    
    boxEnd.setVisible(true);
    
 }
  
     
     public void tryAgainActionPerformed(java.awt.event.ActionEvent evt){                                     
        
        TicTacToeV1 ticTacToeV1 = new TicTacToeV1();
    } 
     
      public void returnMenuActionPerformed(java.awt.event.ActionEvent evt){                                     
        
        
        TicTacToeV1 ticTacToeV1 = new TicTacToeV1();
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
}
   

    

