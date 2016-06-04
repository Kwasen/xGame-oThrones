/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xgame.othrones;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TicTacToeV1 implements ActionListener {
/*Instance Variables*/
private JFrame window = new JFrame("xGame oThrones");
private JButton button1 = new JButton("");
private JButton button2 = new JButton("");
private JButton button3 = new JButton("");
private JButton button4 = new JButton("");
private JButton button5 = new JButton("");
private JButton button6 = new JButton("");
private JButton button7 = new JButton("");
private JButton button8 = new JButton("");
private JButton button9 = new JButton("");
//private String letter = "";

private ImageIcon    emptyclik=new ImageIcon(this.getClass().getResource ("emptyBtn.png"));
private ImageIcon    ex=new ImageIcon(this.getClass().getResource ("xButton.png"));
private ImageIcon    ow=new ImageIcon(this.getClass().getResource("oButton.png"));
private int count = 0;
private boolean win = false;
private boolean winX = false;
private boolean winO = false;

private JFrame boxEnd = new JFrame("R-E-S-U-L-T");

public TicTacToeV1(){
/*Create Window*/
window.setSize(400,400);
//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setLayout(new GridLayout(3,3));



/*Add Buttons To The Window*/
window.add(button1);
window.add(button2);
window.add(button3);
window.add(button4);
window.add(button5);
window.add(button6);
window.add(button7);
window.add(button8);
window.add(button9);

/*Add The Action Listener To The Buttons*/
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
button8.addActionListener(this);
button9.addActionListener(this);

/*Make The Window Visible*/
window.setVisible(true);
}

public void actionPerformed(ActionEvent a) {
count++;

/*Calculate Who's Turn It Is*/
if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9){
    emptyclik=ex;
} else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10){
    emptyclik=ow;
}



/*Display X's or O's on the buttons*/
{
if(a.getSource() == button1){
button1.setIcon(emptyclik);
button1.setEnabled(false);
} else if(a.getSource() == button2){
button2.setIcon(emptyclik);
button2.setEnabled(false);
} else if(a.getSource() == button3){
button3.setIcon(emptyclik);
button3.setEnabled(false);
} else if(a.getSource() == button4){
button4.setIcon(emptyclik);
button4.setEnabled(false);
} else if(a.getSource() == button5){
button5.setIcon(emptyclik);
button5.setEnabled(false);
} else if(a.getSource() == button6){
button6.setIcon(emptyclik);
button6.setEnabled(false);
} else if(a.getSource() == button7){
button7.setIcon(emptyclik);
button7.setEnabled(false);
} else if(a.getSource() == button8){
button8.setIcon(emptyclik);
button8.setEnabled(false);
} else if(a.getSource() == button9){
button9.setIcon(emptyclik);
button9.setEnabled(false);
}
}

//button1.getIcon() 


/*Determine who won*/

//ex button

//horizontal wins
if(button1.getIcon() == ex){

if(button2.getIcon() == ex){

if(button3.getIcon() == ex){
    win = true;
    winX=true;
    winO=false;
    
}
}
}
if(button4.getIcon() == ex){

if(button5.getIcon() == ex){

if(button6.getIcon() == ex){
    win = true;
    winX=true;
    winO=false;
    
}
}
}
if(button7.getIcon() == ex){

if(button8.getIcon() == ex){

if(button9.getIcon() == ex){
    win = true;
    winX=true;
    winO=false;
    
}
}
}

//virticle wins
if(button1.getIcon() == ex){

if(button4.getIcon() ==ex){

if(button7.getIcon() == ex){
    win = true;
    winX= true;
    winO= false;
    
}
}
}
if(button2.getIcon() == ex){

if(button5.getIcon() ==ex){

if(button8.getIcon() == ex){
    win = true;
    winX= true;
    winO= false;
    
}
}
}
if(button3.getIcon() == ex){

if(button6.getIcon() ==ex){

if(button9.getIcon() == ex){
    win = true;
    winX= true;
    winO= false;
    
}
}
}

//diagonal wins
if(button1.getIcon() == ex){

if(button5.getIcon() ==ex){

if(button9.getIcon() == ex){
    win = true;
    winX= true;
    winO= false;
    
}
}
}
if(button7.getIcon() == ex){

if(button5.getIcon() ==ex){

if(button3.getIcon() == ex){
    win = true;
    winX= true;
    winO= false;
    
}
}
}

//ow button

//horizontal wins
if(button1.getIcon() == ow){

if(button2.getIcon() == ow){

if(button3.getIcon() == ow){
    win = true;
    winX=false;
    winO=true;
    
}
}
}
if(button4.getIcon() == ow){

if(button5.getIcon() == ow){

if(button6.getIcon() == ow){
    win = true;
    winX=false;
    winO=true;
    
}
}
}
if(button7.getIcon() == ow){

if(button8.getIcon() == ow){

if(button9.getIcon() == ow){
    win = true;
    winX=false;
    winO=true;
    
}
}
}

//virticle wins
if(button1.getIcon() == ow){

if(button4.getIcon() ==ow){

if(button7.getIcon() == ow){
    win = true;
    winX=false;
    winO= true;
    
}
}
}
if(button2.getIcon() == ow){

if(button5.getIcon() ==ow){

if(button8.getIcon() == ow){
    win = true;
    winX=false;
    winO= true;
    
}
}
}
if(button3.getIcon() == ow){

if(button6.getIcon() ==ow){

if(button9.getIcon() == ow){
    win = true;
    winX=false;
    winO= true;
    
}
}
}

//diagonal wins
if(button7.getIcon() == ow){

if(button5.getIcon() ==ow){

if(button3.getIcon() == ow){
    win = true;
    winX=false;
    winO= true;
    
}
}
}

if(button1.getIcon() == ex){

if(button5.getIcon() ==ex){

if(button9.getIcon() == ex){
    win = true;
    winX= true;
    winO= false;
    
}
}
}





/*Show a dialog if someone wins or the game is tie*/
boolean tie= count == 9 && win == false;
if(win == true && winX == true){
JOptionPane.showMessageDialog(null,  "Mr x won this Battle round","Victory!",JOptionPane.CLOSED_OPTION);
  //endGameWin endGameWin = new endGameWin();
    window.setVisible(false);
  //window.repaint();

} 
else if(win == true && winO == true){
JOptionPane.showMessageDialog(null,  "Mr O won this Battle round","Victory!",JOptionPane.CLOSED_OPTION);
  //endGameWin endGameWin = new endGameWin();
    window.setVisible(false);
  //window.repaint();

} 

else if(tie){
JOptionPane.showMessageDialog(null, "no Victor, I didn't say loosers!","loosen up",JOptionPane.CLOSED_OPTION);

  //endGameTie endGameTie = new endGameTie();
    window.setVisible(false);
  //window.repaint();
    
}
}


/*public static void main(String[] args){
new TicTacToeV1();
}*/

   
}
