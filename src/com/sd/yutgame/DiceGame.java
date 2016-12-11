package com.sd.yutgame;

public class DiceGame {
	private Player p1;
	private Player p2;
	int num1;
	int num2;
		
	public DiceGame(String name1, String name2) {
		p1 = new Player(name1);
		p2 = new Player(name2);
	}
	public void play() {
		p1.play(1);
		p2.play(1);
		
		num1 = p1.getresult();
		num2 = p2.getresult();
		
	}
	
	public Player getP1() {
		return p1;
	}
	
	public Player getP2() {
		return p2;
	}
	
	public String result() {
		if (num1 > num2)
			return p1.getName();
		else if (num1 < num2)
			return p2.getName();
		else
			return "¹«½ÂºÎ";
	}
}