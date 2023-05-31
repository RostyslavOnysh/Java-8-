package org.Java8P2.mapVSflatmap.service;

import org.Java8P2.mapVSflatmap.model.Truck;
import org.Java8P2.mapVSflatmap.model.Wheel;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TruckServiceImpl implements TruckService {
    @Override
    public List<String> getEngineModel(List<Truck> trucks) {
        return trucks
                .stream()
                .map(t -> t.getEngine().getModel())
                .distinct() // - дозволяє отримувати тільки унікальні значення
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getWheelMakers(List<Truck> trucks) {
        return trucks.stream()
                .map(Truck::getWheels).
                flatMap(Collection::stream)
                .map(Wheel::getMaker)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
