package Gui2;

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fram 
{
	JFrame frame;
	JTextField txt1;
	JTextField txt2;
	JButton but1;
	JButton but2;
	
	public void frame()
	{
		frame=new JFrame();
		frame.setBounds(300, 300, 500, 500);
		frame.setTitle("copy_paste");
		frame.setVisible(true);
		frame.setLayout(null);
	
	
		txt1 = new JTextField();
		txt1.setBounds(100, 100, 100, 30);
		
		
		txt2 = new JTextField();
		txt2.setBounds(250, 100,100,30);
		
		
		but1 = new JButton();
		but1.setBounds(100, 200, 100, 30);
		but1.setText("COPY");
		
		but2 = new JButton();
		but2.setBounds(250, 200, 100, 30);
		but2.setText("CLEAR");
	
		
		
		
		frame.add(txt1);
		frame.add(txt2);
		frame.add(but1);
		frame.add(but2);
	
		
	}

}
