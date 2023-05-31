package org.Java8P2.collectToMap.service;

import org.Java8P2.collectToMap.db.Storage;
import org.Java8P2.collectToMap.model.Advertisement;
import org.Java8P2.collectToMap.model.Car;
import org.Java8P2.collectToMap.model.User;

import javax.swing.plaf.synth.SynthRootPaneUI;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvertisementServiceImpl implements AdvertisementService {

    @Override
    public Map<User, List<Car>> getAllYearGreaterThan(int year) {
        return Storage.getAdvertisements().stream()
                .filter(a -> a.getCar().getYear() >= year)
                .collect(Collectors.groupingBy(Advertisement::getOwner,
                        Collectors.mapping(Advertisement::getCar, Collectors.toList())));
    }
}
