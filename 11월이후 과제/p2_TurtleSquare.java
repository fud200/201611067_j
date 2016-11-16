import ch.aplu.turtle.*;
import java.util.ArrayList;

class TurtleSquare {
	public ArrayList<Double[]> posArr = new ArrayList<Double[]>();
	Turtle t1 = new Turtle();
	
	public void drawSquare() {
		
		for (int i = 0; i < 4; i++) {
			Double[] pos = new Double[2];
			pos[0] = t1.getX();
			pos[1] = t1.getY();
			posArr.add(pos);
			t1.fd(100);
			t1.right(90);
		}
		
		for (Double[] d : posArr)
			System.out.printf("(%.1f, %.1f)", d[0], d[1]);
	}
	
	public static void main(String[] args) {
		TurtleSquare ts = new TurtleSquare(); 
		ts.drawSquare();
	}
}