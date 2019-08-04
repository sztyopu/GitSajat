package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int begin = scan.nextInt();
        int end = scan.nextInt();

        System.out.println(S.substring(begin,end));





      /*  //kis kezdo betuk nagy beture
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" ");
        System.out.print(B.substring(0,1).toUpperCase()+B.substring(1));
        */
    }
}
