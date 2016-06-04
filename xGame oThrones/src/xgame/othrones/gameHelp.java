//this is the help class

package xgame.othrones;
import javax.swing.*;

/**
 *
 * @author Mabweh
 */
public class gameHelp {
    
    
    public gameHelp(){
     JOptionPane.showMessageDialog(null, ">>->First PLAYER is 'x'\n>>->Second PLAYER is 'o'\n>>->click on the empty grid boxes to paint with your playing shape, either 'x' or 'o'.\n>>->Align your shapes diagonally, vertically or horizontally to win.\n>>->At the same time, be defensive towards your opponent who also has the same objective to win","HELP",JOptionPane.INFORMATION_MESSAGE);
    }
}
