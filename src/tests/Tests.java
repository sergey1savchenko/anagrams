package tests;

import org.junit.Assert;
import org.junit.Test;

import anagrams.DifferentLengthException;

public class Tests {
	
	@Test(expected = anagrams.DifferentLengthException.class) 
	public void difLength() throws DifferentLengthException { 
	     anagrams.AnagramsChecker.isAnagrams("test", "t");
	}
	
	@Test(expected = anagrams.DifferentLengthException.class) 
	public void difLength2() throws DifferentLengthException { 
	     anagrams.AnagramsChecker.isAnagrams_v2("test", "t");
	}

    @Test
    public void testAnagrams() {
        try {
			Assert.assertEquals(true, anagrams.AnagramsChecker.isAnagrams("hamlet", "amleth"));
		} catch (DifferentLengthException e) {
			e.printStackTrace();
		}
    }
 
    @Test
    public void testNotAnagrams() {
        try {
			Assert.assertFalse(anagrams.AnagramsChecker.isAnagrams("qwer", "wert"));
		} catch (DifferentLengthException e) {
			e.printStackTrace();
		}
    }
}