package LeetCodePractice;

public class ReverseString {
	public static void revHelper(int left, int right, char[] s) {
		if(left >= right) {
			return;
		}
		else {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			revHelper(++left, --right, s);
		}
			
	}
		
	
	public static void reverseString(char[] s) {
		revHelper(0, s.length - 1, s);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char[] s = {'h','e','l','l','o'};
			reverseString(s);
			System.out.println(s);
	}

}
