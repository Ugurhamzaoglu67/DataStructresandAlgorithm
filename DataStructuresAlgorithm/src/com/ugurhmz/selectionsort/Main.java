package com.ugurhmz.selectionsort;


/*
 
 5- Selection Sort ( Se�erek S�ralama)
	�	Say�lardan olu�an, s�ras�z dizi verildi�inde
	�	Selection sort -> Listedeki en k����� bulur.
	�	Listenin �st�nden bir kere ge�iyor ve en k����� buluyor. En k���k say�y� ba�taki say�yla yer de�i�tiriyor. 
		Sonra en k���k say�y� 1.s�raya ald�ktan sonra 1�den sonrakinde en k���k say�lara bak�yor. 
		ilk 2 say� bulduktan sonra sabitlenip, di�erlerine bak�yor.
	�	Karma��kl�k ise : n*(n+1)/2   -> O(n^2) dir
		Best: ?(n^2)
		Average: ?(n^2)
		Worst: O(n^2)
	�	Space Complexity O(1)


 
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
