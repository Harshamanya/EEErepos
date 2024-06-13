package sample;
//yrdrydytre
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=602,169
	 */
	private final JTextField textField = new JTextField();
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(new Color(166, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTERATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(67, 31, 337, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel text = new JLabel("NAME");
		text.setFont(new Font("Tahoma", Font.BOLD, 12));
		text.setBounds(53, 72, 46, 14);
		frame.getContentPane().add(text);
		
		JLabel rl1 = new JLabel("ROLL NO");
		rl1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rl1.setBounds(53, 115, 76, 14);
		frame.getContentPane().add(rl1);
		
		JLabel b1 = new JLabel("BRANCH");
		b1.setFont(new Font("Tahoma", Font.BOLD, 12));
		b1.setBounds(53, 154, 76, 14);
		frame.getContentPane().add(b1);
		
		JLabel newlable = new JLabel("GENDER");
		newlable.setFont(new Font("Tahoma", Font.BOLD, 12));
		newlable.setBounds(53, 186, 89, 14);
		frame.getContentPane().add(newlable);
		
		JLabel pl1 = new JLabel("PROG LAN");
		pl1.setFont(new Font("Tahoma", Font.BOLD, 12));
		pl1.setBounds(53, 219, 76, 14);
		frame.getContentPane().add(pl1);
		
		tb1 = new JTextField();
		tb1.setBounds(159, 69, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(159, 112, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JRadioButton g1 = new JRadioButton("FEMALE");
		g1.setBackground(new Color(159, 255, 255));
		g1.setFont(new Font("Tahoma", Font.BOLD, 11));
		g1.setBounds(148, 182, 109, 23);
		frame.getContentPane().add(g1);
		
		JRadioButton g2 = new JRadioButton("MALE");
		g2.setBackground(new Color(159, 255, 255));
		g2.setFont(new Font("Tahoma", Font.BOLD, 11));
		g2.setBounds(274, 182, 109, 23);
		frame.getContentPane().add(g2);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBackground(new Color(159, 255, 255));
		c1.setFont(new Font("Tahoma", Font.BOLD, 11));
		c1.setBounds(148, 215, 97, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("PYTHON");
		c2.setBackground(new Color(159, 255, 255));
		c2.setFont(new Font("Tahoma", Font.BOLD, 11));
		c2.setBounds(247, 215, 76, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("JAVA");
		c3.setBackground(new Color(159, 255, 255));
		c3.setFont(new Font("Tahoma", Font.BOLD, 11));
		c3.setBounds(331, 215, 97, 23);
		frame.getContentPane().add(c3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "EEE", "ECE", "CSE", "AIML", "IOT", "CS"}));
		cb1.setBounds(158, 143, 87, 22);
		frame.getContentPane().add(cb1);
		
		
		ButtonGroup  bg=new ButtonGroup();
		bg.add(g1);
		bg.add(g2);
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String rollno=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender="";
				String langs="";
				
				if(g2.isSelected())
				{
					gender="male";
				}
				if (g1.isSelected())
				{
					gender="female";
				}
				if (c1.isSelected())
				{
					langs=langs+",C";
				}
				if (c2.isSelected())
				{
					langs=langs+",PYTHON";
				}
				if (c3.isSelected())
				{
					langs=langs+" JAVA";
				}
				
				JOptionPane.showMessageDialog(btnNewButton, "NAME:"+name+"\n ROLLNO :"+rollno+
						"\n BRANCH :"+branch+"\n GRNDER :"+gender+"\n PROG LAN :"+langs);
				
			}
			});
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton.setBounds(168, 238, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
