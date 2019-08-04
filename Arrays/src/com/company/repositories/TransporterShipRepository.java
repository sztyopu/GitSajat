package com.company.repositories;

import com.company.data.TransporterShip;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TransporterShipRepository {
    private ArrayList<TransporterShip> ships = new ArrayList<>();

    public TransporterShipRepository() {
    }

    public void add(TransporterShip ship) {
        ships.add(ship);
    }

    public void remove(Long id) {
        for (TransporterShip transporterShip : ships) {
            if (transporterShip.getId().equals(id)) {
                ships.remove(transporterShip);
                break;
            }
        }
    }

    public void printOneNameById(Long id) {
        boolean hasThatId = false;
        for (TransporterShip transporterShip : ships) {
            if (transporterShip.getId().equals(id)) {
                System.out.println("Név: " + transporterShip.getName());
                hasThatId = true;
                break;
            }
        }
        if (!hasThatId) {
            System.out.print("Nincs ilyen azonosítójú elem");
        }
    }

    public void printAll() {
        for (TransporterShip transporterShip : ships) {
            System.out.print("Azonosító: " + transporterShip.getId() + ", ");
            System.out.print("Név: " + transporterShip.getName() + ", ");
            System.out.print("Típus: " + transporterShip.getType() + ", ");
            System.out.print("Kapacitás: " + transporterShip.getCapacity() + " ");
            System.out.println();
        }
    }
}
