package com.ugurhmz.hackerrank;

import java.util.*;

public class MiniMaxSum {

	public static void main(String[] args) {
		 List<Integer> arr= new ArrayList<>();
		 
		 arr.add(1);
		 arr.add(2);
		 arr.add(3);
		 arr.add(4);
		 arr.add(5);
		// 3 5 6 7
		 
		 miniMaxSum(arr);
		 
		 /*
						(8) Mini-Max Sum

Soru : Dizinin i�erisinde gezerek, 3 adet de�i�ken hesaplayaca��z.

		1- Dizinin t�m elemanlar�n�n toplam�.
		2- Dizinin en k���k eleman�n� bulmak.
		3- Dizinin en b�y�k eleman�n� bulmak.

		*Not -> Dii�er 4 eleman�n en b�y�k de�eri = Dizi eleman toplam - dizinin en k���k eleman�.
			di�er 4 eleman�n en k���k de�eri =  Dizi eleman toplam - dizinin en b�y�k  eleman�.
*/
		 
		 
	}
	
	/********************HACKER RANK ��Z�M**************/
	public static void miniMaxSum(List<Integer> arr) {
		
		   Collections.sort(arr);
		   long min = Long.MAX_VALUE;
		   long max = Long.MIN_VALUE;
		
		   
		   long sum=0;
		   
		   List<Integer> mylist = new ArrayList<>();
		   
		  for(int i=0 ; i< 5 ; i++) {
			  sum +=arr.get(i);
			  min = Math.min(min,arr.get(i));
			  max = Math.max(max, arr.get(i));
		  }
		   
		   long maxDeger =(sum - min);
		   long minDeger =(sum - max); 
		   
		
		   
		  
		  for(long i=minDeger ; i<=maxDeger ; i++) {
			min = Math.min(minDeger, i);
			max = Math.max(maxDeger, i);
		  }
		   
		  System.out.println(min+" "+max);
		  	 
		}
	
	
	/********************HACKER RANK ��Z�M**************/


}
