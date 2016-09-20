System.out.println("Homework");
class Hello {
    String toWhom="khb";
    Hello() {}
    void sayHello() {
        System.out.println("hello "+toWhom);
    }
}
Hello h=new Hello();
h.sayHello();

class Subway {
    int line;
    void run() {    System.out.println("3 lines runs");
    }
}
Subway mySub=new Subway();
mySub.run()

class Subway {
    int line;
    void run() {    System.out.println(line+"  lines runs");
    }
    void setLine(int l)  {
        line=l;
    }
}
Subway mySub=new Subway();
mySub.setLine(6);
mySub.run();
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