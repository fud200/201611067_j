package com.sd.yutgame;

 
public class Yut extends Dice {

	private String yut = null;

	public int roll() {
		setNum((int) (Math.random() * 5) + 1);
		setYut();
		return getNum();
	}

	public void setYut() {
		if (getNum() == 1)
			yut = "µµ";
		else if (getNum() == 2)
			yut = "°³";
		else if (getNum() == 3)
			yut = "°É";
		else if (getNum() == 4)
			yut = "À·";
		else if (getNum() == 5)
			yut = "¸ð";
		else 
			yut = null;
	}
	
	public String getYut() {
		return this.yut;
	}
}