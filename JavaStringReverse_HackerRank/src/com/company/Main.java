package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String [] words = new String[S.length()];

        //Feltoltom a tombot a szo darabokkal forditottan
        for (int i=0; i<words.length; i++) {
            words[i] = S.substring(i, i + 1);
        }
       /* //Kiiratas tomb
        for (String i : words) {
            System.out.println(i);
        }*/

        //forditott szum tomb
        String reverseS ="";
        for (int i = words.length-1; i>=0; i--) {
            reverseS = reverseS + words[i];
        }

        if (S.compareTo(reverseS) != 0){
            System.out.println("No. This string not a palindrome.");
        }else{
            System.out.println("Yes. This string a palindrome.");
        }




        //main end
    }
}
/* És van egysoros megoldás is :D

System.out.println( A.equals( new StringBuilder(A).reverse().toString())
    ? "Yes" : "No" );

 */