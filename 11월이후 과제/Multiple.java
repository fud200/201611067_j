class Multiple {

	public void getSum() {
		int sum = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		
		System.out.println("Multiple sum = " + sum);
	}
		public static void main(String[] args) {
		Multiple m = new Multiple();
		m.getSum();
	}
}