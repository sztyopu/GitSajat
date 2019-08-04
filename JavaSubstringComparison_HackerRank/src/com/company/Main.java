package com.company;

import java.util.Scanner;

public class Main {
//a program feldarabolja az adott szot akkorakra amennyire kell es megmondja lexicografikailag melyik a legnagyobb, legkisebb.
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();

        //System.out.println(getSmallestAndLargest(s, k));
        getSmallestAndLargest(s, k);



    //end
    }

    public static String getSmallestAndLargest(String s, int k){
        String smallest;
        String largest;

        //Ez egy ures String tomb, ami megfelelo hosszu, hogy beferjen minden szo
        String [] words = new String[s.length()-(k-1)];

        //Feltoltom a tombot a szo darabokkal
        for (int i=0; i<words.length; i++){
            words[i] = s.substring(i,i+k);
        }
        //kiirom a tombot és a hosszat
        //System.out.println(words.length);
        for (String i: words){System.out.println(i);}
        System.out.println("--------------------------------");
        //minimum kereses
        smallest = words[0];
        for (int i=0; i<words.length; i++){
           int m = smallest.compareTo(words[i]);
            if (m > 0){smallest = words[i];}
        }
        System.out.println(smallest);

        //maximum kereses
        largest = words[0];
        for (int i=0; i<words.length; i++){
            int m = largest.compareTo(words[i]);
            if (m < 0){largest = words[i];}
        }
        System.out.println(largest);
        return "";

    }

}


