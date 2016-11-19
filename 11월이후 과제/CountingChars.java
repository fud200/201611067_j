import java.util.*;

class CountingChars {
	
	static Map countChars(String str) {
		Map<String, Integer> wc = new HashMap<String, Integer>();
		String t;
		char[] strarray = str.toCharArray();
		
		for (char c : strarray) {
			t = Character.toString(c);
			if (wc.containsKey(t))
				wc.put(t, wc.get(t) + 1);
			else
				wc.put(t, 1);
		}
		
		return wc;
	}
	
	public static void main(String[] args) {
		String letters = "sangmyung university";
		System.out.println("'" + letters + "' counting result: " + countChars(letters));
	}
}