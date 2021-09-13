package com.ugurhmz.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClosestNumbers {
	public static void main(String[] args) {
		
		int[] arr = {3,5,12};
		
		System.out.println(closestNumbers(arr));
		
	    
	}
	
	
	  public static List<Integer> closestNumbers(int[] arr) {
	        Arrays.sort(arr);
	        
	        Map<Integer, List<Integer>> mymap = new HashMap<>();
	        
	        int minDifferent = Integer.MAX_VALUE;
	        
	        for(int i=0;i<arr.length-1;i++){
	            int currentDifferent = arr[i+1] - arr[i];
	            
	            if(minDifferent > currentDifferent ){
	                
	                if(mymap.containsKey(currentDifferent)){
	                    mymap.get(currentDifferent).add(arr[i]);
	                    mymap.get(currentDifferent).add(arr[i+1]);
	                }
	            } else {
	                List<Integer> tempList = new ArrayList<>();
	                tempList.add(arr[i]);
	                tempList.add(arr[i+1]);
	                
	                mymap.put(currentDifferent, tempList);
	            }
	            
	            minDifferent = currentDifferent;
	        }
	        
	        List<Integer> minDifEl =mymap.get(minDifferent);
		    int[] result = new int[minDifEl.size()];
		    
		    for(int i=0;i< result.length;i++) {
		        result[i] = minDifEl.get(i);
		    }
		    	
		    List<Integer> newList = new ArrayList<>();
		    for(int i=0; i < result.length ;i++ ) {
		    	newList.add(result[i]);
		    }
		    
		    
		    return newList;
	    }
	 
	    
	   
}
