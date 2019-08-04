package com.company;

import com.company.data.Ship;
import com.company.data.Car;
import com.company.data.Plane;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ship ship = new Ship(1L,"Titanic");
        System.out.print("Azonosító: " + ship.getId() + ", ");
        System.out.print("Név: " + ship.getName() + " ");
        System.out.println();


        Car car = new Car(1L, "ZöldKocsi", 5);
        System.out.print("Azonosító: " + car.getId() + ", ");
        System.out.print("Név: " + car.getName() + ", ");
        System.out.print("Ajtók száma: " + car.getDoorNumbers() + " ");
        System.out.println();

        Plane plane = new Plane(1L, "F-14");
        System.out.print("Azonosító: " + plane.getId() + ", ");
        System.out.print("Név: " + plane.getName() + " ");
        System.out.println();


        switch (ship.getType()) {
            case SHIP:
                System.out.println("Ez egy hajó");
                break;
            case PLANE:
                System.out.println("Ez egy repülő");
                break;
            case CAR:
                System.out.println("Ez egy autó");
                break;
            default:
                System.out.println("Nincs ilyen típus");
        }
    }


}
