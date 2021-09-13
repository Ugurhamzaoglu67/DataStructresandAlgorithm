package com.ugurhmz.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) {
		
		
	}
	
	
	 public static String timeConversion(String s) {
	 			SimpleDateFormat out = new SimpleDateFormat("HH:mm:ss");
		        SimpleDateFormat in = new SimpleDateFormat("hh:mm:ssa");
		        
		        Date date = null;
		        
		        try {
		            date = in.parse(s);
		            
		        } catch (ParseException e) {
		            e.printStackTrace();
		        }
		        return out.format(date);

    }

	
}
