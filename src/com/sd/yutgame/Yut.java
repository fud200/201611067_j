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
			yut = "��";
		else if (getNum() == 2)
			yut = "��";
		else if (getNum() == 3)
			yut = "��";
		else if (getNum() == 4)
			yut = "��";
		else if (getNum() == 5)
			yut = "��";
		else 
			yut = null;
	}
	
	public String getYut() {
		return this.yut;
	}
}