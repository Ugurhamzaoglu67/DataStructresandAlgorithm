package com.ugurhmz.fibonacci;

import java.util.Scanner;

/*
 * 2- Fibonacci 
	* Genelde 0,1 ile ba�lat�l�r bu seri. Bazende 1,1 ile ba�lat�l�r.
	* Her bir eleman� = Kendinden �nceki 2 eleman�n toplam�na e�it olan seridir.
	* Ard���k iki eleman� aras�ndaki oran -> Alt�n orand�r.
	* Verilen indeksteki fibonacci say�s� �eklinde bulunur.
	recursiveFibonacci -> Order 2^n algoritmiktir. ve �ok yava� bir algoritmad�r.
	
 */





public class MainFibo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the index of Fibo : ");
		int N = scanner.nextInt();
		
		Fibo(N);
		
		System.out.println("");
		
		
		
		// RECURSIVE
		System.out.print("Enter the number for  recursiveFibo : ");
		int myNumber = scanner.nextInt();
		
		for(int i = 0 ; i<=myNumber ; i++ ) {
			System.out.print(recursiveFibo(i) + " ");
		}
		

	}
	
	
	// NORMAL
	public static void Fibo(int  N) {
		
		int num1= 0, num2=1;
		int counter = 0;
		
		while(counter < N) {
			
			// Print the number
            System.out.print(num1 + " ");
  
			
			int num3 = num2 + num1;
			
			num1 = num2;
			num2 = num3;
			
			counter += 1;
		}
	
	}
	
	
	
	// RECURSIVE
	public static int recursiveFibo(int n) {
		if( n <= 1) {
			return n;
		}
		
		return recursiveFibo(n - 1 )+ recursiveFibo(n - 2);	
	}
	

}







