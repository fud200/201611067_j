class RockScissorsPaper {
	String sel1, sel2;
	
	public RockScissorsPaper(String sel1, String sel2) {
		this.sel1 = sel1;
		this.sel2 = sel2;
		
		rspPlay(sel1, sel2);
	}
	
	public void rspPlay(String sel1, String sel2) {
		if (sel1.equals("가위")) {
			if (sel2.equals("바위"))
				System.out.println("플레이어2가 이겼어");
			else if (sel2.equals("보"))
				System.out.println("플레이어1이 이겼어");
			else
				System.out.println("비겻어");
		}
		else if (sel1.equals("바위")) {
			if (sel2.equals("가위"))
				System.out.println("플레이어1이 이겼어");
			else if (sel2.equals("보"))
				System.out.println("플레이어2가 이겼어");
			else
				System.out.println("비겻어");
		}
		else {
			if (sel2.equals("가위"))
				System.out.println("플레이어2가 이겼어");
			else if (sel2.equals("바위"))
				System.out.println("플레이어1이 이겼어");
			else
				System.out.println("비겼어");
		}
	}
	
	public static void main(String[] args) {
		String sel1 = "보";
		String sel2 = "가위";
		
		System.out.println("플래이어1은 " + sel1 + "을 냈고 플레이어 2는 " + sel2 +"을 냈어 그래서");
		RockScissorsPaper rps = new RockScissorsPaper(sel1, sel2);
	}
}