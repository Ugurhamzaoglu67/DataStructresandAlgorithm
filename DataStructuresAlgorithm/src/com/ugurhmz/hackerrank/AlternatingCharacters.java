package com.ugurhmz.hackerrank;

public class AlternatingCharacters {

	public static void main(String[] args) {
		
		/*
						(9) Alternating Characters
Soru : verilen string i�inde, Yanyana oaln ayn� karakterlerden, yan yana olan ayn� karakterleri silmeliyiz.

Yani karakterlerden yan yana ayn� olanlardan 1 tanesini siliyoruz. counter ile say�s�n� al�r�z.


*/
		
	}

	
	public static int alternatingCharacters(String s) {
       
        int counter =0;
        	
        for(int i=0 ; i <s.length()-1;i++) {
        	
        	if(s.charAt(i) == s.charAt(i+1)) {
        		counter++;
        	}
        }
        
        return counter;
    }
	
	
	
	
	
}
