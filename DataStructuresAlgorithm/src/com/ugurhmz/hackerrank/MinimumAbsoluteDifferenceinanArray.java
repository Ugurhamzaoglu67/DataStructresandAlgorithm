package com.ugurhmz.hackerrank;

import java.util.*;

public class MinimumAbsoluteDifferenceinanArray {

	public static void main(String[] args) {
	
		List<Integer> mylist = new ArrayList<>();
		
		mylist.add(5);
		mylist.add(45);
		mylist.add(36);
		mylist.add(12);
		mylist.add(25);
		
		System.out.println(minimumAbsoluteDifference(mylist));
		
		/*
		 * 	(6) Minimum Absolute Difference in an Array

			Soru : Verilen int arrayi için, herhangi iki deðerinin farkýnýn mutlak deðeri, min olan  sayý çiftinin farkýný istiyor.
			
			çözüm : 1- Önce dizi sýralanýrki sýralýda iþlem yapalým
			2- Eðer 2 sayýn arasýndaki veya birden fazla sayýnýn arasýndaki  en küçük farký bulmak istediðimizde  ilk deðer max deðer atanýr.

		 * 
		 * */
		
		
		
	}

	
	
	public static int minimumAbsoluteDifference(List<Integer> arr) {
		Collections.sort(arr);
		
		int minDifferent = Integer.MAX_VALUE;
		int currentDiff=0;
		
		
		for(int i=0 ; i < arr.size()-1 ;i++) {
			
			currentDiff = Math.abs( (arr.get(i)) - (arr.get(i+1)));
			
			minDifferent = Math.min(minDifferent, currentDiff);
			
		}
		//System.out.print(currentDiff);
		return minDifferent;
	 }

}
