package com.ugurhmz.hackerrank;

import java.util.*;
public class SalesbyMatch {

	public static void main(String[] args) {
	
				/*
				 * 						(5) Sales by Match

					Soru : 
						1- �orap d�kkan�nda �oraplar�n tiplerini belirten array verilmi�
						2- Ka� Adetinin �ift oldu�unu soruluyor ?  Ka� adet �ift �orap d�nd�rmemiz isteniyor
						3- YAN� FARKLI RENKLERDEN OLU�AN �ORAPLARDAN ��FT OLANLARI SAY.
					
					
					��z�m : HashSet kullanmak, ��nk� HashSet i�inde sadece unique olan de�erleri bar�nd�r�r.
						HashSet i�inde verilen dizinin elemanlar� tutacaz, Ne zamanki �orap �iftine denk gelirsek,
						o �oraplardan bir tanesini silece�iz ve count'u 1 art�rcaz

				 * 
				 * */
	}
	
	
	public static int sockMerchant(int n, List<Integer> ar) {
	    Set<Integer> myset = new HashSet<>();
	    int count = 0;
	    
	    
	    for(Integer el : ar) {
	    	
	    	if( !myset.contains(el)) {
	    		myset.add(el);
	    	}
	    	else {
	    		count++;
	    		myset.remove(el);
	    	}
	    }
	    
	   
	    return count;

	}

}
