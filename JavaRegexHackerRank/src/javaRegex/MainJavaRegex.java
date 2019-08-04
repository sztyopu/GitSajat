package javaRegex;

import java.util.Scanner;

public class MainJavaRegex {
	public static void main (String[] args) {
	//Begin
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String IP = scan.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		
		scan.close();
		
		
	//End	
	}

}
