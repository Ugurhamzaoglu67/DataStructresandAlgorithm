package com.ugurhmz.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {
	
	
	
	
	public static void main(String[] args) {
		
		List<Integer> mylist =new ArrayList<>();
		
		//0 0 1 0 0 1 0
		mylist.add(0);
		mylist.add(0);
		mylist.add(1);
		mylist.add(0);
		mylist.add(0);
		mylist.add(1);
		mylist.add(0);
		
		System.out.println(jumpingOnClouds(mylist));
		
		/*SORU
		(4) Jumping on the Clouds 

			Soru:
			1- Verilen bulut k�mesinin �zerinde 1 veya 2 bulut z�playarak  ilerleyebiliyoruz. 	
			2- Bulutlar 0 ve 1 olarak belirtilmi�. 
			3- 0'lar  -> G�venli Bulut
			1'ler -> G�venli de�il, g�k g�r�lt�l� bulut. 1'leri es ge�mek gerekiyor.
			En az z�play��ta ilk pozisyondan, son pozisyona ka� adet z�plama ile gidebilirsiniz ?
*/
		
	}
	
	
	
	
	public static int jumpingOnClouds(List<Integer> c) {
	      int jump = 0;
	      int i = 0;
	      
	    //  System.out.println(c.get(i +2 ));
	      
	      
	      while( i < c.size()-1) {
	    		if(  i + 2 == c.size() || c.get(i +2 ) == 1) {
	    			
	    			i++;
	    		} else {
	    			
	    			i +=2;
	    		}
	    	 jump++;
	      }
	      return jump;
    }

	
}
