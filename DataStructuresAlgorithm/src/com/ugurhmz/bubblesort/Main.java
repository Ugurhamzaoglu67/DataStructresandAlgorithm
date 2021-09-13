package com.ugurhmz.bubblesort;

/*7- 
 * Buble Sort ( Karbarcýk Sýralamasý, Baloncuk)
 
•	Sýrasýz verilen dizi üzerinde, Bir kabarcýk, ikiþer-ikiþer elemanlarýn üstünden  kayýyor gibi düþünebiliriz. 
•	Baþtan baþlayýp, sonuna kadar dizinin bir kabarcýk kayýyor gibi ve her seferinde 
	iki elemana bakarak kayýyor gibi.
•	ilk 2 elemana bakýyor. 1. eleman mý küçük, 2. eleman mý ona göre. Küçük olaný baþa alýyor diðeri sonraya.

•	Complexity
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
