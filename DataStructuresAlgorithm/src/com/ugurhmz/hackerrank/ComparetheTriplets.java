package com.ugurhmz.hackerrank;

import java.util.*;
import java.util.stream.IntStream;

public class ComparetheTriplets {

	public static void main(String[] args) {
	
		List<Integer> newlist1 = new ArrayList<>();
		
		newlist1.add(3);
		newlist1.add(4);
		newlist1.add(8);
		
		List<Integer> newlist2 = new ArrayList<>();
		
		newlist2.add(3);
		newlist2.add(4);
		newlist2.add(8);
		
		System.out.println(compareTriplets(newlist1,newlist2));
		
	}
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	   
		int bob = 0;
		int alice = 0;
		
		
		for(int i=0 ; i<a.size(); i++) {
			if(a.get(i) > b.get(i) ) {
				alice++;
			} 
			else if(a.get(i) < b.get(i)) {
				bob++;
			} 
			else if(a.get(i) == b.get(i)) {
				continue;
			}
		}
		
		List<Integer> newlist = new ArrayList<>();
		
		newlist.add(bob);
		newlist.add(alice);
		
		return newlist;
	}
	

}
