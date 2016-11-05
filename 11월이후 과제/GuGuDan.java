public class GuGuDan {
 
    void gugudan() {
        for(int i=1; i<=9; i++) {
            System.out.print(i+"´Ü- ");
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %2d", i, j, (j*i));
                System.out.print("\t");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
			GuGuDan g=new GuGuDan();
			g.gugudan();
	}
 
}
