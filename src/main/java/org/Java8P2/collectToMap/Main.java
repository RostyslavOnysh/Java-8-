package org.Java8P2.collectToMap;

import org.Java8P2.collectToMap.model.Car;
import org.Java8P2.collectToMap.model.User;
import org.Java8P2.collectToMap.service.AdvertisementService;
import org.Java8P2.collectToMap.service.AdvertisementServiceImpl;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AdvertisementService advertisementService = new AdvertisementServiceImpl();
        Map<User, List<Car>> allYearGreaterThan = advertisementService.getAllYearGreaterThan(2015);
        allYearGreaterThan.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}

