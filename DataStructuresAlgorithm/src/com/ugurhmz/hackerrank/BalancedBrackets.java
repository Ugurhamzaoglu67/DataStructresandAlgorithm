package com.ugurhmz.hackerrank;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
				/*AÇIKLAMA*/
		/*

					(3)Balanced Brackets

	Soru: (,), {,}, [, or ] þeklinde String verilmiþ.
	      Parantez Hangi þekilde açýldýysa,o þekilde kapanmalý.Dengeli olmalý
	
	çözüm : 1- Stack<Character>  oluþtur
		2- verilen Stringin boyutu kadar dolaþ, length()
		3-Stringin içindeki karakterlere bak EÐER baþlangýç içeriyorsa, bunu stacke pushla 
		4- String içinde baþlangýç içermiyorsa þunlarý yap:
				-stackin boyutu 0 ise "NO" dönder.
				-stackin boyutu 0 deðilse, Karakter oluþtur ve ona Stackin en üstündeki elemaný alarak,silerek ata
					-Eðer stringin o anki i elemaný baþlangýç içeriyor ve en üstteki elemaný sonu içermiyorsa "NO" dönder ,x3 kez kontrol et
					
				 
	5- Fordan çýktýk artýk, stackin boyutu == 0 ise YES Dönder, demekki stack boþaltýlmýþ pop ile
	   Stackin boyutu 0 deðilse "NO" dönder demekki dizide eleman var þart saðlanmamýþ.


	*Not-> Stack veri yapýsý, tek giriþ ve çýkýþsa sahip ve ilk giren son çýkar LIFO ( Last in First out ) mantýðý ile çalýþmaktadýr.
	Stack Yapýsýnda kullanýlan önemli fonksiyonlar:
	
	Push () =>  Stack’a yeni veri eklemek için kullanýlýr.
	
	Peek()  =>  Stack’ýn en üstünde bulunan veriyi okur.
	
	Pop()   => Stack’ýn en üstünde bulunan veriyi siler.
	
	Contains () => Stack’ta arama yapmaya yarar.
	
	Clear()   =>  Stack’ý temizler.
	
	toArray()  => Stack’ý diziye aktarýr.
	
	Stacklarýn Çalýþma süresi ( Running time )
	
	En kötü durum ( Worst Case ) : Ekleme & Silme O(1) , Arama O(n)
	
	Orta ( Average ) : Ekleme & Silme O(1), Arama O(n)

		 * 
		 * */

	}
	
	/***********************HACKERRANK ÇÖZÜMÜ******************/
	public static String isBalanced(String s) {
		Stack<Character> mystack = new Stack<>();
		
		for(int i=0 ; i< s.length(); i++) {
			
			
			
				if(s.charAt(i) == '(' || s.charAt(i) =='{' || s.charAt(i) =='[' ) {
					mystack.push(s.charAt(i));
				}
		
				else {
				
					if(mystack.size() == 0) {
						return "NO";
						
					} else {
						
							Character topStack = mystack.pop();
							
							if(s.charAt(i) ==')' && topStack != '(') {
								return "NO";
							}
							
							else if(s.charAt(i) =='}' && topStack != '{') {
								return "NO";
							}
							
							else if(s.charAt(i) ==']' && topStack != '[') {
								return "NO";
							}
					}	
					}
		}
		
			if(mystack.size() == 0) {
				return "YES";
			} else {
				return "NO";
			}

	    }
	/***********************HACKERRANK ÇÖZÜMÜ******************/
}
