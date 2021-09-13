package com.ugurhmz.hackerrank;

public class ViralAdvertising {

	
	
	public static void main(String[] args) {
	
		System.out.println(viral(3));
	}
	
	
	public static int viral(int n) {
		
		int people = 2;
		int likeCount = 2;
		
		
		for(int i=2 ; i<=n ; i++) {
			people = (people *3) /2;
			likeCount += people;
		}
		
		return likeCount;
		
	}

}
