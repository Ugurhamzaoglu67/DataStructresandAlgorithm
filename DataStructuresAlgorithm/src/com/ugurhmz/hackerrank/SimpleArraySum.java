package com.ugurhmz.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {

	public static void main(String[] args) {
		
		List<Integer> mylist = new ArrayList<>();
		mylist.add(5);
		mylist.add(8);
		mylist.add(4);
		
		SimpleArraySum(mylist);
		
		
	}
	
	public static int SimpleArraySum(List<Integer> ar) {
		
		int sum = 0;
		
		for(Integer el : ar) {
			sum += el;
		}
		
		return sum;
	}
	
	
}
