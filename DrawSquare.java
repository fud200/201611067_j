System.out.println("homework");
/classpath lib/aplu5.jar
import ch.aplu.turtle.*;
Turtle t1=new Turtle();
void DrawSquare(int size){
	for(int i=0;i<4;i++){
		t1.fd(size);
		t1.rt(90);
	}
}
DrawSquare(50)