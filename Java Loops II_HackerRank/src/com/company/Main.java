package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// begin
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        if (q >= 0 && q <= 500){
            for (int i=0; i<q; i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                if (a >= 0 && a <= 50 && b >= 0 && b <= 50 && n >= 1 && n <= 15 ){

                    double sum = 0;
                    double ans = 0;
                    for (double j=0; j<n; j++){
                        if (j == 0){
                            sum = a + (Math.pow(2,j)) * b;
                        }else{
                            sum = (Math.pow(2,j)) * b;
                        }

                       // sum = (Math.pow(2,j)) * b;
                      //  sum = sum0+sum;
                        ans = ans +sum;
                        System.out.print((int)ans + " ");
                        //System.out.print(sum + " ");

                    }
                    System.out.println();

                }else{
                    System.out.println("Wrong NUMBER! a >= 0 and a <= 50 and b >= 0 and b <= 50 and n >= 1 and n <= 15");
                }
            }
        }else {
            System.out.println("Wrong NUMBER! q >= 0 and q <= 500");
        }


    // end
    }
}
