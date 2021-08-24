package com.ugurhmz.insertionsort;


/*
 6 - Insertion Sort (Ekleme Sýralamasý, Sokma Sýralamasý)
•	Sayýlarýn arasýna soktuðumuz, doðru yeri bulana kadar.
•	Ýlk geçiþte ilk eleman sýralanýyor. Yani hiçbir þey yapmýyor.
•	2. geçiþte ise ilk sayý ile diðer sayý kýyaslanýyor. küçük olan solda kalýyor.
•	**Her yeni gelen sayý, O ana kadar olan sýralý sayýlarla karþýlaþtýrýlýyor. Bu sayý önceki sayýlardan daha küçük ise sola geçer.
•	Yani bir öncekiyle, bir sonrakinin yer deðiþimi yapýlýyor.En küçük sayý en baþa getirilene kadar  iþlem yapar. Burdaki problem ise bütün sayýlarýn oynatýlmasý gerekiyor.
•	selection sorta göre best case’de, average case de biraz daha avantajlý. 
•	Complexity
Complexity	Best Case	Average Case	Worst Case
Time			(n)		(n2)			o(n2)
Space									o(1)



  
  
  
  */



public class Main {

	public static void main(String[] args) {
		
		 int[] a = {67,52,-4,-5,10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
		    for(int k=1; k<10; k++)   
		    {  
		        int temp = a[k];  
		        int j= k-1;  
		        while(j>=0 && temp <= a[j])  
		        {  
		            a[j+1] = a[j];   
		            j = j-1;  
		        }  
		        a[j+1] = temp;  
		    }  
		    System.out.println("printing sorted elements ...");  
		    for(int i=0;i<10;i++)  
		    {  
		        System.out.print(a[i] + " ");  
		    }  
		
		

	}

}
