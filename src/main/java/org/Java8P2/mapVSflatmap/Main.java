package org.Java8P2.mapVSflatmap;

import org.Java8P2.mapVSflatmap.db.Storage;
import org.Java8P2.mapVSflatmap.service.TruckService;
import org.Java8P2.mapVSflatmap.service.TruckServiceImpl;

public class Main {
    public static void main(String[] args) {
        TruckService truckService = new TruckServiceImpl();
        truckService.getEngineModel(Storage.getTrucks()).forEach(System.out::println);
        truckService.getWheelMakers(Storage.getTrucks()).forEach(System.out::println);
    }

}
