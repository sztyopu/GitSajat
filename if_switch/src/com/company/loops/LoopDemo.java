package com.company.loops;

public class LoopDemo {
    public void forLoopDemo(int size) {

        for (int i = 0; i < size; i++) {
            System.out.println(i + ". futása a for ciklusnak");
        }
    }

    public void whileLoopDemo(int size) {
        int i = 0;
        while (i < size) {
            System.out.println(i + ". futása a while ciklusnak");
            i++;
        }
    }

}
