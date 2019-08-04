package com.company;

import com.company.data.TransporterShip;
import com.company.repositories.TransporterShipRepository;

public class Main {

    public static void main(String[] args) {

        TransporterShipRepository shipRepository = new TransporterShipRepository();

        TransporterShip transporterShip = new TransporterShip();
        transporterShip.setId(1L);
        transporterShip.setName("Első hajó");
        transporterShip.setType("Személyszállító");
        transporterShip.setCapacity(12);

        TransporterShip secondShip = new TransporterShip();
        secondShip.setId(2L);
        secondShip.setName("Második hajó");
        secondShip.setType("Személyszállító");
        secondShip.setCapacity(12);

        TransporterShip thirdShip = new TransporterShip();
        thirdShip.setId(3L);
        thirdShip.setName("Harmadik hajó");
        thirdShip.setType("Személyszállító");
        thirdShip.setCapacity(2);

        shipRepository.add(transporterShip);
        shipRepository.add(secondShip);
        shipRepository.add(thirdShip);

        shipRepository.printAll();

        System.out.println();
        shipRepository.remove(3L);
        shipRepository.printAll();

        System.out.println();
        shipRepository.printOneNameById(1L);
        shipRepository.printOneNameById(3L);

    }

}
