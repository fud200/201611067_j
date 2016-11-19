class Olleh {
	
	static void reverse(StringBuilder sb, String str) {
		char[] charh = str.toCharArray();
		
		for (int i = charh.length - 1; i >= 0; i--)
			sb.append(charh[i]);
	}
	
	public static void main(String[] args) {
		String hello = "hello";
		StringBuilder olleh = new StringBuilder();
		
		reverse(olleh, hello);
		System.out.println("reverse " + hello + " then " + olleh.toString());
	}
}