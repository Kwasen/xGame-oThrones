//Contains panel for game

package xgame.othrones;


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Mabweh
 */
public class gameBoard extends JFrame {
    
    //JPanel myContain = new JPanel();
    JPanel myContain = new JPanel();
    xoButtons buttons[] = new xoButtons[9];
    
    
    
    public gameBoard(){
        
        super("xoGame");
     
        setResizable(false);                         //window can not be resized
        setSize(400,400);                           //width is 400 and so is height(Square)
        //setDefaultCloseOperation(EXIT_ON_CLOSE);   //application closes when exit button is pressed.. oops I no longer need this sonce I control the flow of activity using the menuGame class
        myContain.setLayout(new GridLayout(3,3)); //panel layout for buttons is in a GRID arrangement
        
        for (int i=0;i<9;i++){                  //loop indicates nine stuffs to be added to container  
        
            buttons[i]=new xoButtons();
         // myContain.add(buttons[i]);
        
        }
        add(myContain);
        setVisible(true);                      //window can be visible
         
        
    }     
}

