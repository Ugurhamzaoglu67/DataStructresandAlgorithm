package com.ugurhmz.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		
		/*1. y�ntem
		ArrayList<ArrayList<Integer>> mylists = new ArrayList<>();
		
		mylists.add(new ArrayList<Integer>(Arrays.asList(5, 4, 6)));
		mylists.add(new ArrayList<Integer>(Arrays.asList(7, -3, 9)));
		mylists.add(new ArrayList<Integer>(Arrays.asList(10, 11, -4)));
		
		
		int sum = 0;
		
		for(int i=0 ; i<mylists.size() ; i++) {
			for(int j=0 ; j < mylists.size(); j++) {
				
				if(i==j) {
					sum += mylists.get(i).get(j);
				}
				
				if(i + j == (mylists.size() -1 )) {
					sum -= mylists.get(i).get(j);
				}
			}
		}
		
		System.out.println(Math.abs(sum));*/
		
	}
	
	
	
	/*******************HACKER RANK ��Z�M�*************************/
	
	/*1- Verilen kare  matris i�inde , Sol �st-sol alt �apraz ve sa� �st-alt sol alt diagonallerin toplam�n�n 
		 mutlak de�er olarak fark�n� bul.

	��z�m  : 1.sol �st -> 00, 11, 22, 33  =x ve y 'ler e�it
	 	 2.sa� �st -> 03, 12, 21, 30  => burdada x+y =3 yani nxn Matrisin , n-1'i oluyor.

	
     
	 */
	  public static int diagonalDifference(List<List<Integer>> arr) {
	        int n = arr.size();
	        int sum = 0;
	        
	        
	        for(int i=0 ; i< n ; i++){
	            for(int j=0 ; j < n ; j++){
	                
	                if(i == j){
	                    sum += arr.get(i).get(j);
	                }
	                
	                if( i+j == n-1 ){
	                    sum -= arr.get(i).get(j);
	                }
	            }
	        }
	        
	        return Math.abs(sum);

	    }
	
	/*******************HACKER RANK ��Z�M�*************************/

}
