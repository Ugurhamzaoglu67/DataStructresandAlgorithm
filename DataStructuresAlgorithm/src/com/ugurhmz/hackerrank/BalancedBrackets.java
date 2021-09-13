package com.ugurhmz.hackerrank;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
				/*A�IKLAMA*/
		/*

					(3)Balanced Brackets

	Soru: (,), {,}, [, or ] �eklinde String verilmi�.
	      Parantez Hangi �ekilde a��ld�ysa,o �ekilde kapanmal�.Dengeli olmal�
	
	��z�m : 1- Stack<Character>  olu�tur
		2- verilen Stringin boyutu kadar dola�, length()
		3-Stringin i�indeki karakterlere bak E�ER ba�lang�� i�eriyorsa, bunu stacke pushla 
		4- String i�inde ba�lang�� i�ermiyorsa �unlar� yap:
				-stackin boyutu 0 ise "NO" d�nder.
				-stackin boyutu 0 de�ilse, Karakter olu�tur ve ona Stackin en �st�ndeki eleman� alarak,silerek ata
					-E�er stringin o anki i eleman� ba�lang�� i�eriyor ve en �stteki eleman� sonu i�ermiyorsa "NO" d�nder ,x3 kez kontrol et
					
				 
	5- Fordan ��kt�k art�k, stackin boyutu == 0 ise YES D�nder, demekki stack bo�alt�lm�� pop ile
	   Stackin boyutu 0 de�ilse "NO" d�nder demekki dizide eleman var �art sa�lanmam��.


	*Not-> Stack veri yap�s�, tek giri� ve ��k��sa sahip ve ilk giren son ��kar LIFO ( Last in First out ) mant��� ile �al��maktad�r.
	Stack Yap�s�nda kullan�lan �nemli fonksiyonlar:
	
	Push () =>  Stack�a yeni veri eklemek i�in kullan�l�r.
	
	Peek()  =>  Stack��n en �st�nde bulunan veriyi okur.
	
	Pop()   => Stack��n en �st�nde bulunan veriyi siler.
	
	Contains () => Stack�ta arama yapmaya yarar.
	
	Clear()   =>  Stack�� temizler.
	
	toArray()  => Stack�� diziye aktar�r.
	
	Stacklar�n �al��ma s�resi ( Running time )
	
	En k�t� durum ( Worst Case ) : Ekleme & Silme O(1) , Arama O(n)
	
	Orta ( Average ) : Ekleme & Silme O(1), Arama O(n)

		 * 
		 * */

	}
	
	/***********************HACKERRANK ��Z�M�******************/
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
	/***********************HACKERRANK ��Z�M�******************/
}
