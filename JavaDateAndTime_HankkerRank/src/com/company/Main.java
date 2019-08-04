package com.company;
import java.time.LocalDate;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        findDay(month, day, year);

        // Stringet csinál integerbol, de ez megsem kell
        // String m = Integer.toString(month);
        //String d = Integer.toString(day);
        //  String y = Integer.toString(year);


        //Ez egy másik megoldásból van. De pontatlan.
        //  Calendar cal= Calendar.getInstance();
        //  cal.set(year,month-1,day);
        //  System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase());


    }

    public static String findDay(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);
        String s = String.valueOf(dt.getDayOfWeek());
        //Nem tudom miert nem eleg a return, de ha nincs println nem ad vissza semmit
       // System.out.println(s);
        return s;

    }

}