package com.ugurhmz;

import java.util.*;

public class TestClass {
	
	
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> map =Map.of(34,"�stanbul",67,"Zonguldak");
		
		map.put(34,"�STANBUL");
		
		System.out.println(map);
		
		
	}
	
	
	
	public static void printlist(Collection<?> list) {
		for(Object s : list) {
			System.out.println(s);
		}
	}

}
