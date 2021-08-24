package com.ugurhmz;





public class MyClass {

	public static void main(String[] args) {
		
		
		calculateTime(10000000);
		calculateTime(100000000);
		calculateTime(1000000000);
	}
	
	
	private static  void calculateTime(int n) {
		long startTime = System.currentTimeMillis();
		long k= 0;
		
		for(int i=0 ; i < n ;i++) {
			k = k + 5;
		}
		
		long endTime = System.currentTimeMillis();
		
		
		System.out.println("n = "+n+" -> " + (endTime-startTime) + " ms");
	 	
	}
	
	
	
	
}











