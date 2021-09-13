package com.ugurhmz.bubblesort;

/*7- 
 * Buble Sort ( Karbarc�k S�ralamas�, Baloncuk)
 
�	S�ras�z verilen dizi �zerinde, Bir kabarc�k, iki�er-iki�er elemanlar�n �st�nden  kay�yor gibi d���nebiliriz. 
�	Ba�tan ba�lay�p, sonuna kadar dizinin bir kabarc�k kay�yor gibi ve her seferinde 
	iki elemana bakarak kay�yor gibi.
�	ilk 2 elemana bak�yor. 1. eleman m� k���k, 2. eleman m� ona g�re. K���k olan� ba�a al�yor di�eri sonraya.

�	Complexity
	Scenario					Complexity
	Space							O(1)
	Worst case running time			O(n2)
	Average case running time		O(n)
	Best case running time			O(n2)

 
 * */



public class Main {

	public static void main(String[] args) {
		int[] myArr = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
		
	    for(int i=0;i<10;i++)  
	    {  
	        for (int j=0;j<10;j++)  
	        {  
	            if(myArr[i]<myArr[j])  
	            {  
	                int temp = myArr[i];  
	                myArr[i]=myArr[j];  
	                myArr[j] = temp;   
	            }  
	        }  
	    }  
	    
	    System.out.println("Printing Sorted List : ");  
	    
	    for(int i=0;i<=10;i++)  
	    {  
	        System.out.print(myArr[i] + " ");  
	    }  
	    
	    
	    

	}

}
