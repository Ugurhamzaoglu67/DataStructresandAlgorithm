package com.ugurhmz.selectionsort;


/*
 
 5- Selection Sort ( Seçerek Sýralama)
	•	Sayýlardan oluþan, sýrasýz dizi verildiðinde
	•	Selection sort -> Listedeki en küçüðü bulur.
	•	Listenin üstünden bir kere geçiyor ve en küçüðü buluyor. En küçük sayýyý baþtaki sayýyla yer deðiþtiriyor. 
		Sonra en küçük sayýyý 1.sýraya aldýktan sonra 1’den sonrakinde en küçük sayýlara bakýyor. 
		ilk 2 sayý bulduktan sonra sabitlenip, diðerlerine bakýyor.
	•	Karmaþýklýk ise : n*(n+1)/2   -> O(n^2) dir
		Best: ?(n^2)
		Average: ?(n^2)
		Worst: O(n^2)
	•	Space Complexity O(1)


 
 */





public class Main {
	
    public static void main(String a[]){  
       
    	
    	int[] myArr = {9,14,3,2,5,8,23,-5,12,7,8,43,11,58,22};  
    	
    	// BEFORE SELECTION
    	System.out.println("Before : ");
    	
    	for(int temp : myArr) {
    		System.out.print(temp+ " ");
    	}
    	
    	
    	// selectionSort()
    	selectionSort(myArr);
    	
    	
    	// AFTER SELECTION
    	System.out.println("\nAfter  : ");
    	
    	for(int temp : myArr) {
    		System.out.print(temp + " ");
    	}
    	
    	
    	
    }  
    
    
    public static void selectionSort(int[] myArr) {
    	
    	for(int i=0;  i < myArr.length -1 ;i++) {
    		
    		int min = i;
    		
    		
    		
    		for(int j=i+1 ; j < myArr.length; j++  ) {
    			
    			if(myArr[j] < myArr[min]) {
    				min = j;		
    			}
    		}
    		
    		
    		int smallerNumber = myArr[min];
    		myArr[min] = myArr[i];
    		myArr[i] = smallerNumber;
    		
    	}
    }
    
    
}
