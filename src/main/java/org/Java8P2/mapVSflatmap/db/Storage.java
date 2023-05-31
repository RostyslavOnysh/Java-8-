package org.Java8P2.mapVSflatmap.db;

import org.Java8P2.mapVSflatmap.model.Engine;
import org.Java8P2.mapVSflatmap.model.Truck;
import org.Java8P2.mapVSflatmap.model.Wheel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TransferQueue;

public class Storage {

    public static List<Truck> getTrucks() {
        List<Truck> trucks = new ArrayList<>();
        Truck t100 = new Truck("T100");
        t100.setEngine(new Engine("Engine 1", 4000));
        List<Wheel> t100Wheels = new ArrayList<>();
        t100Wheels.add(new Wheel("Hankook", 43));
        t100Wheels.add(new Wheel("Hankook", 43));
        t100Wheels.add(new Wheel("Continental", 43));
        t100Wheels.add(new Wheel("Continental", 43));
        t100.setWheels(t100Wheels);



        Truck t150 = new Truck("T150");
        t150.setEngine(new Engine("Engine 1", 4500));
        List<Wheel> t150Wheels = new ArrayList<>();
        t150Wheels.add(new Wheel("Bridgestone", 45));
        t150Wheels.add(new Wheel("Bridgestone", 45));
        t150Wheels.add(new Wheel("Bridgestone", 45));
        t150Wheels.add(new Wheel("Bridgestone", 45));
        t150.setWheels(t150Wheels);


        Truck k18 = new Truck("K18");
        k18.setEngine(new Engine("Engine 2", 4000));
        List<Wheel> k18Wheels = new ArrayList<>();
        k18Wheels.add(new Wheel("Hankook", 40));
        k18Wheels.add(new Wheel("Hankook", 40));
        k18Wheels.add(new Wheel("Hankook", 40));
        k18Wheels.add(new Wheel("Hankook", 40));
        k18.setWheels(k18Wheels);


        Truck m99 = new Truck("K18");
        m99.setEngine(new Engine("Engine 3", 3000));
        List<Wheel> m99Wheels = new ArrayList<>();
        m99Wheels.add(new Wheel("Continental", 40));
        m99Wheels.add(new Wheel("Continental", 40));
        m99Wheels.add(new Wheel("Continental", 40));
        m99Wheels.add(new Wheel("Continental", 40));
        m99.setWheels(m99Wheels);

        trucks.add(t100);
        trucks.add(t150);
        trucks.add(k18);
        trucks.add(m99);
        return trucks;
    }
}
