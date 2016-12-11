package com.sd.yutgame;
import java.awt.event.*;
import javax.swing.*;
public class YutGamePlay extends DiceGamePlay {
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if (btn == start) {
			if (p1.getText().equals("") || p2.getText().equals(""))
				btn.setText("Please, put your name");
			else {
				btn.setText("Replay");
				String name1 = p1.getText();
				String name2 = p2.getText();
				
				YutGame yg = new YutGame(name1, name2);
				
				yg.play();
				rs.setText("1p: "+yg.getP1().getYut() + ", " + "2p: "+yg.getP2().getYut());
				
				winner.setText(yg.result());
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
		YutGamePlay ygg = new YutGamePlay();
		ygg.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ygg.pack();
		ygg.setVisible(true);
		ygg.setSize(800, 200);
	}
}