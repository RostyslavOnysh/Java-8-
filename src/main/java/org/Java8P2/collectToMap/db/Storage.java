package org.Java8P2.collectToMap.db;

import org.Java8P2.collectToMap.model.Advertisement;
import org.Java8P2.collectToMap.model.Car;
import org.Java8P2.collectToMap.model.User;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    public static List<Advertisement> getAdvertisements() {
        List<Advertisement> advertisementList = new ArrayList<>();

        User bob = new User("Bob", "+ 353 89 526 2462");
        User alice = new User("Alice", "+ 380 63 7954432");
        User john = new User("John", "+ 48 78 567896");

        Advertisement camry = new Advertisement(bob, new Car("Toyota", "Camry", 2011));
        Advertisement corolla = new Advertisement(bob, new Car("Toyota", "Corolla", 2018));
        Advertisement yaris = new Advertisement(bob, new Car("Toyota", "Yaris", 2020));
        Advertisement accord = new Advertisement(alice, new Car("Honda", "Accord", 2018));
        Advertisement matiz = new Advertisement(john, new Car("Deewoo", "Matiz", 2008));
        Advertisement lanos = new Advertisement(john, new Car("Deewoo", "Lanos", 2017));


        advertisementList.add(camry);
        advertisementList.add(corolla);
        advertisementList.add(yaris);
        advertisementList.add(accord);
        advertisementList.add(matiz);
        advertisementList.add(lanos);

        return advertisementList;
    }
}
