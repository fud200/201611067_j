class StringBuffer{
	void Triangle(int n){
		int i,j;
		String a="*";
		String b=" ";
		for(i=1;i<n;i++){
			for(j=1;j<n-i;j++){
				System.out.printf(b);
				}
			for(j=1;j<=2*i-1;j++){
				System.out.printf(a);
				}
			System.out.printf("\n");
		}
	}
	public static void main(String[] args) {
	StringBuffer s = new StringBuffer();
	s.Triangle(15);
	}
}