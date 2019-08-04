package com.company;

import java.util.Scanner;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    //start
        if (N >= 2 && N <= 20){
           for (int i=1; i<11; i++){
            System.out.println(N + " x " + i + " = " + N*i);}
        }else{
            System.out.println("Wrong NUMBER. Number >=2 and Number <= 20!");
        }

/* ez egy masik modszer
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.printf("%d x %d = %d%n", N, i, N*i);
        }
    }
}
* */
    //end
    }
}
