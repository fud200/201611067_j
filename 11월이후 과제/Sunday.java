import java.util.Calendar;

public class Sunday {
	public void find() {
		Calendar c = Calendar.getInstance();
		int sum = 0;
		for(int i= 1901; i <=2000; i++) {
			for(int j=0; j<12; j++) {
				c.set(i, j,1);
				if(c.get(Calendar.DAY_OF_WEEK)==1){
					sum++;
				}
			}
		}
		System.out.println("20th centry have "+sum+" times of Sunday");
	}
	public static void main(String[] args){
		Sunday s = new Sunday();
		s.find();
	}
}