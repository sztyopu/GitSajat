package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int a = A.length();
        int b = B.length();
        //add össze a beolvasot két String hosszát, és ird ki
        System.out.println(a+b);
        //hasonlitsd ossze at A-t a B-vel
        if (A.compareTo(B) > 0) {
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
        //kis kezdo betuk nagy beture
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" ");
        System.out.print(B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
