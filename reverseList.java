package LeetCodePractice;

public class reverseList {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	 //Iterative code
	 public ListNode reverseList(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		while(curr != null) {
			ListNode next = curr.next; //save the next node in next
			curr.next = prev; //now point curr.next of curr 'backward' to prev(which is currently null)
			prev = curr; //we were done and now update curr node to prev for the next iteration
			curr = next; //and update the curr head to the saved next for the next iteration 
		}
		return prev;
	        
	    }
	 //Recursive code
	 public ListNode reverse(ListNode head) {
			if(head == null) {
				return null;
			}
			else if(head.next == null) {
				return head;
			}
			else {
				ListNode next = head.next;
				head.next = null;
				ListNode rest = reverse(next);
				next.next = head; //set next node's as head so it goes backwards
				return rest;   
			}
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
