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

			Soru : Verilen int arrayi i�in, herhangi iki de�erinin fark�n�n mutlak de�eri, min olan  say� �iftinin fark�n� istiyor.
			
			��z�m : 1- �nce dizi s�ralan�rki s�ral�da i�lem yapal�m
			2- E�er 2 say�n aras�ndaki veya birden fazla say�n�n aras�ndaki  en k���k fark� bulmak istedi�imizde  ilk de�er max de�er atan�r.

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
