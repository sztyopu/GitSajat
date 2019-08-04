package com.company;

import java.util.Scanner;

public class Main {

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            scanner.close();
            //start
            //az ans valtozoval egyszerubb lesz a kod
            String ans = "";
            if (N >= 1 && N <= 100) {

                if (N % 2 != 0) {
                    //System.out.println("Weird");
                    ans = "Weird";
                } else {
                    if (N >= 2 && N <= 5) {
                       // System.out.println("Not Weird");
                        ans = "Not Weird";
                    } else if (N >= 6 && N <= 20) {
                      //  System.out.println("Weird");
                        ans ="Weird";
                    } else if (N >20) {
                        //System.out.println("Not Weird");
                        ans = "Not Weird";
                    }
                }

            }else {//System.out.println("Invalid no! Enter a number between 1 and 100.");
                ans = "Invalid no! Enter a number between 1 and 100.";
            }
            System.out.println(ans);
            //end
        }


}
