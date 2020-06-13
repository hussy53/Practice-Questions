package LeetCodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class addTwoNumbers {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode();
		ListNode curr = head; //curr will keep changing
		int carry = 0;
		while(l1 != null || l2 != null) {
			int x = l1.val;
			int y = l2.val;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		if(carry > 0) {
			curr.next = new ListNode(carry); //incase we have an overflow 
											 //for a single digit addition 
		}
		return head.next; //will go through the sum. Doing curr.next will output
		                  // 0 if carry is 0 since it is the last condition that
		                  // updates curr.next
    	}
		

public static void main(String[] args) {
	// TODO Auto-generated method stub
	 	
		}
	
	

}
