package com.ugurhmz.binarysearch;



/*
  4- Binary Search
�	Aranan liste s�ral� liste ise, Binary ( ikili) search  daha iyi sonu� verir.
�	Ortaya bak�yor, sonra kalanlar�n yar�s�na, kalanlar�n yar�s�na
�	Her ad�mda, ihtimal k�mesini yar�ya indiriyorum.
�	Dizinin ba��n� ve sonunu tutuyoruz. Aranan say�, ortan�n sa��nda ise   oraya getiriyoruz. aranan say� solda ise, tutulan sondaki say�y�, ortan�n 1 eksi�ine getiriyoruz.

*/








public class Main {
	
	
	 public static void main(String[] args) {
		
		 	int arr[] = {10,20,30,40,50,15,8,5,2,5,15,18,25,32,31};  
	        int keyword = 18;  
	        int lastNum=arr.length-1;  
	        binarySearch(arr,0,lastNum,keyword);     
		 
	}
	 
	 
	 
	 public static void binarySearch(int arr[], int firstNum, int lastNum, int keyword){  
		 
		   int midNum = (firstNum + lastNum)/2;  
		   
		   while( firstNum <= lastNum ){  
			   
		      if ( arr[midNum] < keyword ){  
		    	  firstNum = midNum + 1;    // right zone 
		        
		      } else if ( arr[midNum] == keyword ){  
		    	  
		        System.out.println("Element is found at index: " + midNum);  
		        break;  
		        
		        
		      } else{  
		    	  
		    	  lastNum = midNum - 1;  // left zone
		      }  
		      midNum = (firstNum + lastNum)/2;  
		   }  
		   
		   if ( firstNum > lastNum ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
	 
	 
}
