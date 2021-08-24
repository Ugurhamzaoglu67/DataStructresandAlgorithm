package com.ugurhmz.linearsearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		int [] myArr = {10,20,30,40,100,50,70,80};
		int keyword = 50;
		
		System.out.println(keyword + " found at index : "+linearSearch(myArr,keyword));
		
	}
	
	
	
	// LINEAR SEARCH
	public static int linearSearch(int[] myArr, int keyword) {
		
		for(int i =0 ; i <= myArr.length; i++) {
			if(keyword == myArr[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	
	
	
}
