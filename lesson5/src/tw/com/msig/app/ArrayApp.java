package tw.com.msig.app;

public class ArrayApp {
	
	public static void main(String[] args) {
	
		//        idx:0,1,2,3,4
		int[] nums = {1231,2132,3443,1234,345};
		int[] goodYears = new int[5]; //= {1999,2002,2008,2017,2023};
						
		goodYears[0] = 1999;
		goodYears[1] = 2002;
		goodYears[2] = 2008;
		goodYears[3] = 2017;
		goodYears[4] = 2023;
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		for(int i=0; i<goodYears.length; i++) {
			System.out.println(goodYears[i]);
		}
	
	
	}
	
	
}
