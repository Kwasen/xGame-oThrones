//buttons for the game

package xgame.othrones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mabweh
 */
class xoButtons {

public class xoButtons {
    public class xoButtons extends JButton {
    
        ImageIcon x,o;
        int value=0;
        value++;
            //value%=2;
            //0is nothing
            //1 is x
            //2 is o
    
    
    
    public xoButtons(){
        public x=new ImageIcon(this.getClass().getResource ("xButton.png"));
        public o=new ImageIcon(this.getClass().getResource("oButton.png"));
        this.addActionListener(this);           //trigger action and listen to it
    }
    
   
        
            }
        
        }
                
    

