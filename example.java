
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class example implements ActionListener {
	JButton button4 = new JButton("Lesson 1.4");
	JButton button3 = new JButton("Lesson 1.3");
	JButton button2 = new JButton("Lesson 1.2");
	JButton button = new JButton("Lesson 1.1");
public static void main (String[] args)
{   
	
	example l = new example();
	l.window();
}
public void window()
{
	//LABEL
	  JPanel panel = new JPanel();
	  panel.setLayout(null);
  JLabel label = new JLabel();
  panel.setSize(500,200);
  label.setText("Algebra 1");
  label.setLocation(0, 0);
  JLabel label2 = new JLabel();
  label2.setText("Chapter 1 - Lines");
  label2.setForeground(Color.black);
  label.setBounds(258, -30, 300, 140);
  label2.setBounds(35,100,200,50);
  JLabel into = new JLabel();
  into.setText("An lesson-based education game");
  into.setForeground(Color.black);
  into.setBounds(240,-20,500,200);
  panel.add(into);
  
  JLabel chapter2 = new JLabel();
  JLabel blah = new JLabel();
  
  
  panel.add(blah);

  panel.add(chapter2);
  chapter2.setText("Chapter 2 - Graphs");
  chapter2.setForeground(Color.black);
  chapter2.setBounds(280,100,200,50);


  //SET FONT FOR LABEL
  Font fun = new Font("Tahoma", Font.BOLD,16);
  Font font = new Font("Tahoma", Font.BOLD,50);
  Font font2 = new Font("Tahoma", Font.BOLD,20);
  chapter2.setFont(font2);
  into.setFont(fun);
 

  
  //FRAME
  JFrame frame = new JFrame("Test");
  frame.setVisible(true);
  frame.setSize(800,600);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  panel.setBackground(Color.white);
  

  

  panel.add(label);
  panel.add(label2);
  
  label.setFont(font);
  label2.setFont(font2);
  
  label.setForeground(Color.PINK);
 
  frame.add(panel);

  
  ImageIcon i = new ImageIcon("Images/allilogo.gif", "BPawn");
  button.setIcon(i);
  panel.add(button);
  button.setBounds(20, 140, 100, 25);
 
  button.addActionListener (this);

  
  panel.add(button2);
  button2.setToolTipText("Click for Lesson 1.2");
  JButton button3 = new JButton("Lesson 1.3");
  panel.add(button3);
  
  
  panel.add(button4);
  
  button3.setBounds(20, 168, 100, 25);
  button4.setBounds(125,168, 100, 25);
  button2.setBounds(125,140,100,25);
  button2.addActionListener(this);
  

 
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()==button){
		P j = new P();
		
		j.setVisible(true);
		j.pop();
	}
	if(arg0.getSource()==button2){
		P2 j = new P2();
		j.setVisible(true);
		j.pop();
	}
	if(arg0.getSource()==button3){
		
	}
	if(arg0.getSource()==button4){
		
	}
}



}   
