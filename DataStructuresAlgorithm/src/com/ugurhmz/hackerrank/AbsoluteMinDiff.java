package com.ugurhmz.hackerrank;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbsoluteMinDiff {

	public static void main(String[] args) {
		
		int[] myArr = {3,1,5,23,2,4,9,10,15,31};
		
		
		boolean sayac = true;
		int count = 0;
		
		while(sayac) {
			if( !(myArr.length > 1 && myArr.length < 100)) {
				sayac = false;
				break;
			}
			
			
			for(int i=0 ; i< myArr.length ; i++) {
				if( !( myArr[i] > -20000 && myArr[i] < 20000)  ) {
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
	
		int minDif = Integer.MAX_VALUE;
		
		Arrays.sort(myArr);
		
	
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0 ; i< myArr.length-1 ;i++) {
			int currentValueDif = Math.abs(myArr[i] - myArr[i+1]);
				minDif = Math.min(minDif, currentValueDif);
				
				if(  (Math.abs(myArr[i] - myArr[i+1] )) == minDif) {
					
					map.put(myArr[i], myArr[i+1]);
				
				}
		}
		
		
		Iterator iterator = map.keySet().iterator();

		while(iterator.hasNext()){
		  Object key   = iterator.next();
		  Object value = map.get(key);
		  System.out.println(key + " "+value);
		}
		
	}
	
	
	
	
	
}


	