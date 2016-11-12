import java.util.ArrayList;
class Numbers{
	ArrayList<Integer> H = new ArrayList<Integer>();
	int sum=0;
	void findnumber(){
		for(int i=0; i<1001; i++){
			if(i%4==0 && i%5!=0){
				H.add(i);
			}
		}
		for(int a:H){
			sum=sum+a;
		}
		System.out.println("List of Numbers is "+H);
		System.out.println("Sum of Numbers is "+sum);
	}
	public static void main(String[] args) {
		Numbers N = new Numbers();
		N.findnumber();
	}
}