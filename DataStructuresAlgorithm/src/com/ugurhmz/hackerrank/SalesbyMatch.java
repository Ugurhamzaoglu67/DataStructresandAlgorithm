package com.ugurhmz.hackerrank;

import java.util.*;
public class SalesbyMatch {

	public static void main(String[] args) {
	
				/*
				 * 						(5) Sales by Match

					Soru : 
						1- Çorap dükkanýnda çoraplarýn tiplerini belirten array verilmiþ
						2- Kaç Adetinin çift olduðunu soruluyor ?  Kaç adet çift çorap döndürmemiz isteniyor
						3- YANÝ FARKLI RENKLERDEN OLUÞAN ÇORAPLARDAN ÇÝFT OLANLARI SAY.
					
					
					Çözüm : HashSet kullanmak, çünkü HashSet içinde sadece unique olan deðerleri barýndýrýr.
						HashSet içinde verilen dizinin elemanlarý tutacaz, Ne zamanki çorap çiftine denk gelirsek,
						o Çoraplardan bir tanesini sileceðiz ve count'u 1 artýrcaz

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
