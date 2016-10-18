System.out.println("homework");
/classpath lib/aplu5.jar
import ch.aplu.turtle.*;
Turtle t1=new Turtle();
void DrawSquareAt(int size,double x,double y){
	t1.setPos(x,y);
	for(int i=0;i<4;i++){
		t1.fd(size);
		t1.rt(90);
	}
}
DrawSquareAt(50,-30,-40)