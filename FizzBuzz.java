package LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	 public static List<String> fizzBuzz(int n) {
		 List<String> list = new ArrayList<String>();
		 int i = 1;
		 while(i < n + 1) {
			 if(i % 3 == 0 && i % 5 == 0) {
				 list.add("FizzBuzz\n");
			 }
			 else if(i % 3 == 0) {
				 list.add("Fizz");
			 }
			 else if(i % 5 == 0) {
				 list.add("Buzz");
			 }
			 else {
				 list.add(String.valueOf(i));
			 }
			 i++;
		 }
		return list;   
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		System.out.println(fizzBuzz(n));
	}

}
