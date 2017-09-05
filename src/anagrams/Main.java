package anagrams;

public class Main {
	
	static final String a = "qwerty123456";
	static final String b = "q1w2e3r4t5y6";
	static final String c = "123456789012";
	static final String d = "123";

	public static void main(String[] args) {
		
		try {
			System.out.println(AnagramsChecker.isAnagrams(a, c));
			System.out.println(AnagramsChecker.isAnagrams_v2(a, b));
			System.out.println(AnagramsChecker.isAnagrams_v2(a, d));
		} catch (DifferentLengthException e) {
			//e.printStackTrace();
		}
	}

}