System.out.println("homework");
/classpath lib/aplu5.jar
import ch.aplu.turtle.*;
Turtle t1=new Turtle();
void DrawTriangle(int size){
	for(int i=0;i<3;i++){
		t1.fd(size);
		t1.rt(120);
	}
}
DrawTriangle(60)