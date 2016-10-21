package com.sd.DiceGame;
class Player {
    private String name=null;
    private int num=0;
    public Player(String _name) {
        name=_name;
    }
    public void play() {
        Dice d=new Dice();
        //num=d.roll();
        d.roll();
        this.num=d.getNum();
    }
    public String getName() {
        return this.name;
    }
    public int getNum() {
	return this.num;
    }
}
