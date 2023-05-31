package org.Java8P2.mapVSflatmap.service;

import org.Java8P2.mapVSflatmap.model.Truck;

import java.util.List;

public interface TruckService {
    List<String> getEngineModel(List<Truck> trucks);
    List<String> getWheelMakers(List<Truck> trucks);
}
