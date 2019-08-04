package javaStringTokens;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
	// Begin main
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();	
		//a trim() - kitorli a szokozt a szoveg elejerol
		//az isEmpty - megnezi hogy ezekutan ures lett e?
		 String [] words = {};
	      if( s != null && !s.trim().isEmpty() && s.length() < 400000) {
	          words = s.trim().split("[ !,?.\\_'@]+");
	      }
	      System.out.println(words.length);
	      for( String word : words ) {
	          System.out.println(word);
	      }
		
		
		
/*	//	String [] darabolt = {};
		String karakterek = "[' .,?!\\_@]+";
		if( a != null && !a.trim().isEmpty() && a.length() < 400000) {
	     //     words = s.trim().split("[ !,?.\\_'@]+");
		String [] darabolt = a.split(karakterek);
		
		System.out.println(darabolt.length);
		for(int i=0; i<darabolt.length; i++) {
			System.out.println(darabolt[i]);
		}
		}
*/		
		
		
	//End main
	}
//End class
}
