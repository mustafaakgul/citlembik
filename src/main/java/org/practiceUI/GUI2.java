package Proje.src;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;

public class GUI2 extends JFrame {

	private JTextField text=new JTextField(8);
	private JButton btn = new JButton();
	private JButton btn2=new JButton();
	private JButton btn3=new JButton();
	JCheckBox ses=new JCheckBox("SES");
	
	
	
	public GUI2()
	{
		JPanel pnl1=new JPanel(new FlowLayout());
		pnl1.add(new JLabel("ID:"));
		pnl1.add(text);
		Color c2=new Color(0,0,0);
		text.setForeground(c2);

		JPanel pnl2=new JPanel();
		pnl2.setLayout(new FlowLayout());
		
		ImageIcon myicon = new ImageIcon("C:\\Users\\Lenovo\\workspace\\Proje\\src\\Adsýz.png");
		btn.setIcon(myicon);
		Color c1 = new Color(255, 255, 255);
		btn.setBackground(c1);

		ImageIcon myicon2 = new ImageIcon("C:\\Users\\Lenovo\\workspace\\Proje\\src\\Adsýz2.png");
		btn2.setIcon(myicon2);
		btn2.setBackground(c1);

		ImageIcon myicon3 = new ImageIcon("C:\\Users\\Lenovo\\workspace\\Proje\\src\\Adsýz3.png");
		btn3.setIcon(myicon3);
		btn3.setBackground(c1);

		pnl2.add(btn2,BorderLayout.EAST);
		pnl2.add(btn3,BorderLayout.WEST);
		pnl2.add(btn,FlowLayout.CENTER);

		JPanel pnl3=new JPanel(new BorderLayout());
		
		pnl3.add(ses,BorderLayout.SOUTH);

		JLabel background=new JLabel(new ImageIcon("C:\\Users\\Lenovo\\workspace\\Proje\\src\\Adsýzl.png"));
		background.setLayout(new FlowLayout());
		
		background.add(pnl1);
		background.add(pnl2);
		background.add(pnl3);
		
		add(background);
		
		Dinle a=new Dinle();
		btn.addActionListener(a);
		btn2.addActionListener(a);
		btn3.addActionListener(a);
		ses.addActionListener(a);

	}

	public class Dinle implements ActionListener{

		public void actionPerformed(ActionEvent e){
			String ýd=text.getText();

			if(e.getSource()==btn){
				System.out.println("saaaa");

			}

			else if(e.getSource()==btn2){
				System.out.println("dddds");
			}
			else if(e.getSource()==btn3){
				System.out.println("sddsa");
			}
			else if(ses.isSelected())
				System.out.println("abc");

		}
	}



}






