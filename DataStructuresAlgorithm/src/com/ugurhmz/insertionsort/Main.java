package com.ugurhmz.insertionsort;


/*
 6 - Insertion Sort (Ekleme S�ralamas�, Sokma S�ralamas�)
�	Say�lar�n aras�na soktu�umuz, do�ru yeri bulana kadar.
�	�lk ge�i�te ilk eleman s�ralan�yor. Yani hi�bir �ey yapm�yor.
�	2. ge�i�te ise ilk say� ile di�er say� k�yaslan�yor. k���k olan solda kal�yor.
�	**Her yeni gelen say�, O ana kadar olan s�ral� say�larla kar��la�t�r�l�yor. Bu say� �nceki say�lardan daha k���k ise sola ge�er.
�	Yani bir �ncekiyle, bir sonrakinin yer de�i�imi yap�l�yor.En k���k say� en ba�a getirilene kadar  i�lem yapar. Burdaki problem ise b�t�n say�lar�n oynat�lmas� gerekiyor.
�	selection sorta g�re best case�de, average case de biraz daha avantajl�. 
�	Complexity
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
