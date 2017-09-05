package anagrams;

public class DifferentLengthException extends Exception {

	private static final long serialVersionUID = 1L;

	DifferentLengthException() {
		System.out.println("Exception! Strings have different length.");
	}

}