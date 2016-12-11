package com.sd.yutgame;

class Player {
	private String name = null;
	private int number = 0;
	private String yut = null;
	private static final int DICE = 1, YUT = 2;
	public Player(String name) {
		setName(name);
	}
	public void play(int gNum) {
		switch(gNum) {
		case DICE:
			Dice d = new Dice();
			number = d.roll();
			break;
		case YUT:
			Yut y = new Yut();
			number = y.roll();
			yut = y.getYut();
			break;
		default:
			break;
		}
	}
	
	public int getresult() {
		return this.number;
	}
	
	public String getYut() {
		return this.yut;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}