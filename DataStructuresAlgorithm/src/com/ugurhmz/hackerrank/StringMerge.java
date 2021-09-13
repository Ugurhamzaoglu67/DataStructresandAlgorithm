package com.ugurhmz.hackerrank;

public class StringMerge {

	public static void main(String[] args) {
		
		
		myStr("hrte","aars");
			
	}
	
	
	public static void  myStr(String a, String b) {
		

		int aLength = a.length();
		int bLength = b.length();
		
		
		
		
		
		if((1<aLength && aLength <2500)  && (1<bLength && bLength <2500)  ) {
			String oneLine =  a.concat(b);
			
			System.out.print(oneLine);
		}
			
	}

}
