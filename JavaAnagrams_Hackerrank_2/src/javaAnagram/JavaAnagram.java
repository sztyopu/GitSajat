package javaAnagram;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagram {

	public static void main(String[] args) {
	// main begin
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();	
			
		boolean eredmeny = isAnagram(a,b);
		System.out.println(eredmeny? "Anagrams":"Not Anagrams");
				
	//main end
	}
	
	
	public static boolean isAnagram(String a, String b) {
		// kicser�li a sz�k�zt a semmire �s kisbet�ss� teszi a Stringet
		a = a.replace(" ", "").toLowerCase();
		b = b.replace(" ", "").toLowerCase();
		// a String minden karakteret �t adjuk egy karakter t�mbnek
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		// A karakter t�mb�t ABC sorrenbe rendezz�k
		Arrays.sort(c);
		Arrays.sort(d);
		// megvisg�ljuk a t�mb�k elemeit egyenl�ek e
		if (Arrays.equals(c, d)) {
			return true;
		} else {
			return false;
		}
		
	//isAnagram end		
	}
	
	
//class end
}
