package com.sd.yutgame;

 
public class YutGame extends DiceGame {
	public YutGame(String name1, String name2) {
		super(name1, name2);
	}
	

	public void play() {
		getP1().play(2);
		getP2().play(2);
		
		num1 = getP1().getresult();
		num2 = getP2().getresult();
		
	}
}