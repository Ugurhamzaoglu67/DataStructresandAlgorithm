package com.ugurhmz.hackerrank;

import java.util.Scanner;

public class WeirdProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N=1;
		
		 if(1<= N && N<=100){
	            
	            if(N % 2 != 0){
	                System.out.println("Weird");
	            } 
	            else if( (N % 2 == 0 ) && (N>=2 && N <=5)){
	                System.out.println("Not Weird");
	            }
	            
	            else if( (N % 2 == 0 ) && (N>=6 && N <=20)){
	                System.out.println("Weird");
	            }
	            
	             else if( (N % 2 == 0 ) && (N>20)){
	                System.out.println("Not Weird");
	            }
	            
	            
	        } 
		 
		 Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d = scan.nextDouble();
	        String s = scan.nextLine();

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
		 
		 
		 
		
	}
}
