

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JSpinner;

public class P2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblThisLessonWill;
	private JLabel lblName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblYourSlopeIs;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private String textFieldValue;
	private String X;
	private String Y;
	/**
	 * Launch the application.
	 */
	public void f() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P2 frame = new P2();
					frame.setVisible(true);
					frame.pop();
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void pop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 485);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtpnPerpendicularLines = new JLabel();
		txtpnPerpendicularLines.setBounds(12, 12, 597, 40);
		txtpnPerpendicularLines.setForeground(UIManager.getColor("Label.disabledShadow"));
		txtpnPerpendicularLines.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		txtpnPerpendicularLines.setFont(new Font("Poplar Std", Font.PLAIN, 33));
		txtpnPerpendicularLines.setText("                                                                        Parallel Lines 1.2");
		contentPane.add(txtpnPerpendicularLines);
		
		lblThisLessonWill = new JLabel("This lesson will teach you how to form perpendicular lines based off an original given line.");
		lblThisLessonWill.setBounds(35, 56, 551, 15);
		lblThisLessonWill.setHorizontalTextPosition(SwingConstants.CENTER);
		lblThisLessonWill.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisLessonWill.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblThisLessonWill);
		
		lblName = new JLabel("Name: ___________________________   Date: ___ / ___ / ___");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblName.setBounds(111, 88, 402, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		textField.setBounds(382, 82, 27, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		textField_1.setColumns(10);
		textField_1.setBounds(415, 82, 27, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		textField_2.setColumns(10);
		textField_2.setBounds(449, 82, 27, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		textField_3.setBounds(148, 82, 194, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblYouWillEnter = new JLabel("You will enter a slope 'm' and a (x,y) point to pass through");
		lblYouWillEnter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblYouWillEnter.setBounds(35, 113, 345, 33);
		contentPane.add(lblYouWillEnter);
		
		JLabel lblEnterASlope = new JLabel("Enter a SLOPE");
		lblEnterASlope.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterASlope.setBounds(35, 159, 102, 14);
		contentPane.add(lblEnterASlope);
		
		JLabel lblEnterxValue = new JLabel("Enter \"X\" value");
		lblEnterxValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterxValue.setBounds(35, 195, 102, 14);
		contentPane.add(lblEnterxValue);
		
		JLabel lblEnteryValue = new JLabel("Enter \"Y\" value");
		lblEnteryValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnteryValue.setBounds(35, 233, 102, 14);
		contentPane.add(lblEnteryValue);
		
		JLabel lblYourSlopeIs = new JLabel();
		lblYourSlopeIs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblYourSlopeIs.setBounds(174, 157, 168, 14);
		contentPane.add(lblYourSlopeIs);
		
		textField_4 = new JTextField();
		textField_4.setBounds(122, 157, 27, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.addActionListener(this);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(122, 193, 27, 20);
		contentPane.add(textField_5);
		textField_5.addActionListener(this);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(122, 231, 27, 20);
		contentPane.add(textField_6);
		textField_6.addActionListener(this);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource()==textField_4)
		{
			textFieldValue = textField_4.getText();
			
		}
		if(event.getSource()==textField_5)
		{
			X = textField_5.getText();
		
		}repaint();
		
		
		
		if(event.getSource()==textField_6)
		{
			Y = textField_6.getText();
			int here = Integer.parseInt(Y);
			int slope = Integer.parseInt(textFieldValue);
			int x = Integer.parseInt(X);
		
			JLabel hey = new JLabel();
			hey.setText("Your point is ("+X+","+Y+")");
			hey.setBounds(200,160,300,50);
			contentPane.add(hey);
			
			JLabel slopeRE = new JLabel();
			slopeRE.setText("Your slope is : "+textFieldValue);
			slopeRE.setBounds(200,180,300,50);
			contentPane.add(slopeRE);
			
			Font fun =  new Font("Tahoma", Font.BOLD, 12);
			JLabel line1 = new JLabel();
			line1.setText("The slope intercept form of any line is");
			line1.setFont(fun);
			line1.setBounds(200,140,300,30);
			contentPane.add(line1);
			
			Font love = new Font("Tahoma", Font.PLAIN,12);
			
			JLabel line2 = new JLabel();
			line2.setText("y = mx + b");
			line2.setForeground(Color.RED);
			line2.setFont(love);
			line2.setBounds(280,145,300,50);
			contentPane.add(line2);
			int B;
			B = here-(slope*x);
			JLabel line = new JLabel();
			line.setText(Y +" = "+"("+textFieldValue+")("+X+") + b");
			line.setBounds(200,220,300,50);
			
			JLabel b = new JLabel();
			b.setText("y = "+ x+"x "+B);
			b.setBounds(200,240,300,50);
			contentPane.add(line);
			contentPane.add(b);
		}
	
		
	}
}
