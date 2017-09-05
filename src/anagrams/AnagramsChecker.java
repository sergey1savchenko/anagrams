package anagrams;

import java.util.HashMap;

public class AnagramsChecker {

	/*
	 * This variant has O(n*log n) performance
	 * We just sort char arrays we get from input strings and then compare them
	 */
	public static boolean isAnagrams (String a, String b) throws DifferentLengthException {

		if (a.length() != b.length()){
			throw new DifferentLengthException();
		}else{
			char [] a_arr = a.toCharArray();
			char [] b_arr = b.toCharArray();

			// Default sorting algorithm is Timsort with O(n*log n) average performance
			java.util.Arrays.sort(a_arr);
			java.util.Arrays.sort(b_arr);

			return (new String(a_arr)).equals(new String(b_arr));
		}
	}

	/*
	 * First we make a HashMap of characters and number of their entries (first for loop)
	 * Then we check if there are the same characters in String b deducting number of entries (second for loop)
	 * 
	 * HashMap's put and containsKey time complexity in general is O(1)
	 * So this variant has O(n) performance
	 */
	public static boolean isAnagrams_v2 (String a, String b) throws DifferentLengthException {

		if (a.length() != b.length()){
			throw new DifferentLengthException();
		}else{

			HashMap<Character, Integer> entries = new HashMap<Character, Integer>(a.length());

			for (int i=0; i<a.length(); i++){
				if(entries.containsKey(a.charAt(i))){
					entries.put(a.charAt(i), entries.get(a.charAt(i)) + 1);			// this will replace the value (+1)
				}else{
					entries.put(a.charAt(i), 1);
				}
			}

			for (int i=0; i<b.length(); i++){
				if(entries.containsKey(b.charAt(i))){
					if(entries.get(b.charAt(i)) == 0){								// String b contains more temporary character than String a
						return false;
					}else{
						entries.put(b.charAt(i), entries.get(b.charAt(i)) - 1);		// this will replace the value (-1)
					}
				}else{																// String b has character witch String a not
					return false;
				}
			}
			return true;															// Otherwise, everything is OK.
		}
	}

}