package com.sd.gui;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Container;
import java.awt.*;

public class CalcAreaGUIMain{
	public static void main(String[] args){
		JFrame f = new JFrame();
		JPanel panel = new JPanel(new GridLayout(3,2));
		f.getContentPane().add(panel);
		JLabel label = new JLabel("������");
		JTextField radiousTf1 = new JTextField(10);
		JButton b1 = new JButton("���");
		JButton b2 = new JButton("���");
		panel.add(label);
		panel.add(radiousTf1);
		panel.add(b1);
		panel.add(b2);
		f.pack();
		f.setVisible(true);
	}
}