package org.Java8P2.collectToMap.service;

import org.Java8P2.collectToMap.model.Car;
import org.Java8P2.collectToMap.model.User;

import java.util.List;
import java.util.Map;

public interface AdvertisementService {
    Map<User, List<Car>> getAllYearGreaterThan(int year);
}
