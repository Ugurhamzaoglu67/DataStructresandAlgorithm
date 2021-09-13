package com.ugurhmz.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ShoppingCart {

	public static void main(String[] args) {
		
		int[] myArr = {5,6,4,3,4};
		
		
		
		boolean sayac = true;
		int count = 0;
		
		while(sayac) {
			if( !(myArr.length > 1 && myArr.length < 100)) {
				sayac = false;
				break;
			}
			
			
			for(int i=0 ; i< myArr.length ; i++) {
				if( !( myArr[i] > 1 && myArr[i] < 2000)  ) {
						sayac = false;
						break;
				}
			}
			
			
			
			if(count == myArr.length) {
				shoppingCart(myArr);
				sayac=false;
				break;
			}
			count++;
		}
		
		
		
	}
	
	public static void shoppingCart(int[] myArr) {
	
		int arrLength = myArr.length;
		
		// NO DISCOUNT LISTS
		List<Integer> mylist = new ArrayList<>();
		
		
		for(int i=0 ; i< arrLength-1; i++) {
			if( ( myArr[i] > 1) && (myArr[i] < 2000)) {
				if(myArr[i] <= myArr[i+1]) {
					
					mylist.add(myArr[i]);
					
				}  
			}
			
			
		}
		
		int sonEleman = myArr[arrLength-1];
		mylist.add(sonEleman);
		
	
		int[] noDiscounts= new int[mylist.size()];
		
		for(int i = 0 ; i<mylist.size() ; i++) {
			noDiscounts[i] = mylist.get(i);
		}
		
		Arrays.sort(noDiscounts);
		//printMyArr(noDiscounts);
		
		// NO DISCOUNT LISTS -END
		
		
		
		
		// FOR NEW DISCOUNT ARRAY
		for(int i=0 ; i< (arrLength) -1; i++) {
			
			if(myArr[i] > myArr[i+1]) {
				
				myArr[i] = myArr[i] -myArr[i+1];
				
			}       
		}
		
		
		int[] newArr = new int[arrLength];
		
		for(int i=0 ; i<newArr.length  ; i++) {
			newArr[i] = myArr[i];
			
		}
	
		//Arrays.sort(newArr);
		
		
		
		int sum = 0;
		for(int i = 0 ; i<newArr.length ;i++) {
			sum += newArr[i];
		}
		
		
		System.out.print("Toplam tutar : "+sum);
		System.out.print(" Ýndirim yapýlmayan kalemler, C = ");
		printMyArr(noDiscounts);
		
	}
	
	
	public static void printMyArr(int[] printMyArr) {
		
		for(int temp : printMyArr) {
			
			System.out.print(temp+" ");
		}
	}
	
	
}


/*	
	// Sort
	for(int i=0;  i < newArr.length -1 ;i++) {
		
		int min = i;
		
		for(int j=i+1 ; j < newArr.length; j++  ) {
			
			if(newArr[j] < newArr[min]) {
				min = j;		
			}
		}
		
		
		int smallerNumber = newArr[min];
		newArr[min] = newArr[i];
		newArr[i] = smallerNumber;
		
		
	}*/
	