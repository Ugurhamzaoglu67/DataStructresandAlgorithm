package com.ugurhmz.hackerrank;

import java.util.*;

public class TwoStrings {

	public static void main(String[] args) {
		
		String result = twoStrings("hertmerhaba", "hSelam");
		
		
		System.out.println(result);
		
		/*
						(7) Two Strings

		Soru : 2 tane stringimiz var, bu stringden ortak substringi olup olmadýðýný, substring 1 karakter uzunluðundada olabilir
		yani iki dizinin ortak bir karakteri varmý ?
		
		çözüm : linear time'da eleman ekleme,silme HashSet kullan*/

	}
	
	
	/*HACKERRANK ÇÖZÜM*/
	 public static String twoStrings(String s1, String s2) {
		    Set<Character> s1Set = new HashSet<>();
		   
		    
		   for(int i=0 ; i< s1.length() ; i++) {
			  s1Set.add(s1.charAt(i));
		   }
		   
		   
		   for(int i=0; i < s2.length() ; i++) {
			   
			   if(s1Set.contains(s2.charAt(i))) {
				   
				   return "YES";
			   }
			   
		   }
		   
		 
	  return "NO";
	 }
	 
	 /*HACKERRANK ÇÖZÜM*/

}
