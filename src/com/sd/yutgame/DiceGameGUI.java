package com.sd.yutgame;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
public class DiceGameGUI extends JFrame implements ActionListener {
	JPanel jp = new JPanel(new GridLayout(3,4));
	JLabel l1, l2, ll, lr;
	JTextField p1, p2, rs, winner;
	JButton start, clear;
	public DiceGameGUI() {
		setTitle("Dice game");
		getContentPane().add(jp);
		
		l1 = new JLabel("1P: ");
		l2 = new JLabel("2P: ");
		ll = new JLabel("RESULT: ");
		lr = new JLabel("WINNER: ");
		
		p1 = new JTextField(10);
		p2 = new JTextField(10);
		rs = new JTextField(10);
		winner = new JTextField(10);
		
		start = new JButton("Game Start");
		clear = new JButton("cancel");
		
		start.addActionListener(this);
		clear.addActionListener(this);
		
		jp.add(l1);
		jp.add(p1);
		jp.add(l2);
		jp.add(p2);
		jp.add(ll);
		jp.add(rs);
		jp.add(lr);
		jp.add(winner);
		jp.add(start);
		jp.add(clear);		
	}

	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if (btn == start) {
			if (p1.getText().equals("") || p2.getText().equals(""))
				btn.setText("Please, put your name");
			else {
				btn.setText("Replay");
				String name1 = p1.getText();
				String name2 = p2.getText();
				
				DiceGame dg = new DiceGame(name1, name2);
				
				dg.play();
				rs.setText("1p: "+String.valueOf(dg.getP1().getresult()) + ", " + "2p: " +String.valueOf(dg.getP2().getresult()));
				
				winner.setText(dg.result());
			}
		}
		else if (btn == clear) {
			p1.setText("");
			p2.setText("");
			rs.setText("");
			winner.setText("");
		}
	}
	
	public static void main(String[] args) {
		DiceGameGUI dgg = new DiceGameGUI();
		dgg.setDefaultCloseOperation(EXIT_ON_CLOSE);
		dgg.pack();
		dgg.setVisible(true);
		dgg.setSize(800, 200);
	}
}