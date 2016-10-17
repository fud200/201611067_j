class BrazilCoffee{
	String origin;
	int degreeOfRoast;
	int grade;
	public BrazilCoffee(String o){
	this.origin=o;
	}
	public void roast(){
	System.out.println("roasting..." +origin);
	}
	}

BrazilCoffee c=new BrazilCoffee("Cenya");
c.roast();