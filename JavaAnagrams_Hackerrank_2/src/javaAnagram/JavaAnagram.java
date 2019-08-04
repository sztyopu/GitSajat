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
		// kicseréli a szóközt a semmire és kisbetüssé teszi a Stringet
		a = a.replace(" ", "").toLowerCase();
		b = b.replace(" ", "").toLowerCase();
		// a String minden karakteret át adjuk egy karakter tömbnek
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		// A karakter tömböt ABC sorrenbe rendezzük
		Arrays.sort(c);
		Arrays.sort(d);
		// megvisgáljuk a tömbök elemeit egyenlõek e
		if (Arrays.equals(c, d)) {
			return true;
		} else {
			return false;
		}
		
	//isAnagram end		
	}
	
	
//class end
}
