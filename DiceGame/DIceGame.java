package com.sd.DiceGame;
class DiceGame {
    Player p1;
    Player p2;
    int r11;
    int r12;
    int r21;
    int r22;
    public void startGame() {
        Player p1 = new Player("MJ");
        Player p2 = new Player("HB");
        p1.play();
	r11=p1.getNum();
	p1.play();
	r12=p1.getNum();
        p2.play();
	r21=p2.getNum();
	p2.play();
	r22=p2.getNum();
        if (r11+r12 > r21+r22) {
            System.out.println(p1.getName() + " win the game!");
        }
        else if (r11+r12 == r21+r22) {
            System.out.println(" Let's play again...");
        }
        else
            System.out.println(p2.getName() + " win the game!");
    }

			public static void main(String[] args){
		   DiceGame h = new DiceGame();
      h.startGame();

    }
}
