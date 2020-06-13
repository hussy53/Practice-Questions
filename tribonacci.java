package LeetCodePractice;

public class tribonacci {
	public static int tribonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
		}
//		int curr = 0;
//		int first = 0, second = 1; 
//        int third = 1;
//        if(n == 1 || n  == 2){
//            return 1;
//        }
//        for (int i = 3; i <= n; i++)  
//        { 
//            curr = first + second + third; 
//            first = second; 
//            second = third; 
//            third = curr; 
//        } 
//        return curr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 35;
		System.out.println(tribonacci(n));

	}

}
