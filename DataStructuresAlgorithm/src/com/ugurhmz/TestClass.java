package com.ugurhmz;

import java.util.*;

public class TestClass {
	
	
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> map =Map.of(34,"Ýstanbul",67,"Zonguldak");
		
		map.put(34,"ÝSTANBUL");
		
		System.out.println(map);
		
		
	}
	
	
	
	public static void printlist(Collection<?> list) {
		for(Object s : list) {
			System.out.println(s);
		}
	}

}
