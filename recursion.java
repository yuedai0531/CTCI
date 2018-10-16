import java.util.Arrays;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(fibonacci(20));
	}
	
	public static int fibonacci(int i) {
		
//		if(i==0 || i==1) {
//			int b = (i == 1) ? 1:0;
//			return b;
//		}
//		return fibonacci(i-1) + fibonacci(i-2);
		
		return fibonacci(i,new int[i+1]);
	}
	
	
	public static int fibonacci(int i, int[] memo) {
		
		if(i==0 || i==1)
			return i;
		
		if(memo[i]==0) {
			memo[i] = fibonacci(i-1,memo) + fibonacci(i-2,memo);
		}
		System.out.println("memo:" + memo[i]);
		System.out.println(Arrays.toString(memo));
		return memo[i];
	
	}
	

}
