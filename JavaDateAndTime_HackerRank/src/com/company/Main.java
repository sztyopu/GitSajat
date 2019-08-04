package com.company;

import java.util.*;

import static com.company.JavaDateAndTime.getDay;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));



    }
}
