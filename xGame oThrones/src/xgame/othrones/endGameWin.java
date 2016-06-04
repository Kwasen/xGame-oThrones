//display after a game ends in victory

package xgame.othrones;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mabweh
 */
   
public class endGameWin extends JFrame implements ActionListener{
    
    
    JFrame  boxEnd = new JFrame("R-E-S-U-L-T");
    JButton tryAgain = new JButton("Another Battle");
    JButton returnMenu = new JButton("My Palace");
    JLabel  msgTie = new JLabel("Hurray! You won this Battle Round.\nClick 'Another Battle' to launch a new field, click on My Palace to return to the main menu");
    
 public endGameWin(){
 
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
    
