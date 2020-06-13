package LeetCodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class isAnagram {
	public static boolean isAnagram(String s, String t) {
//		Set<Character> word1 = new HashSet<Character>();
//		Set<Character> word2 = new HashSet<Character>();
//		//word1.add(s); word2.add(t);
//		for(int i = 0; i < s.length(); i++) {
//			word1.add(s.charAt(i));
//		}
//		for(int i = 0; i < t.length(); i++) {
//			word2.add(t.charAt(i));
//		}
//		//word1.removeAll(word2);
//		if(word1.equals(word2)) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
//		Map<Integer, Character> word1 = new HashMap<>();
//		Map<Integer, Character> word2 = new HashMap<>();
//		for(int i = 0; i < s.length(); i++) {
//			word1.put(i, s.charAt(i));
//		}
//		for(int i = 0; i < t.length(); i++) {
//			word1.put(i, t.charAt(i));
//		}
//		if(word1.equals(word2) || word1.size() == word2.size()) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
		if(s.length() != t.length()) {
			return false;
		}
		char[] word1 = s.toCharArray();
		char[] word2 = t.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return Arrays.equals(word1, word2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a";
		String t = "b";
		boolean result = isAnagram(s, t);
		System.out.println(result);
	}

}
