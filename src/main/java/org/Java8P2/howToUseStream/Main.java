package org.Java8P2.howToUseStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


       /* getPhoneFromDb().stream().
                filter(p -> p.getMaker().equals("Apple") && p.getMemory() >= 64)
                .forEach(p -> System.out.println(p.getModel()));

        */

        List<String> models = getModelsByMakerAndMemory("Apple", 64);
        System.out.println(models);
    }

    private static List<String> getModelsByMakerAndMemory (String makers, int memory) {
        List<String> models = getPhoneFromDb().stream().
                filter(p -> p.getMaker().equals(makers) && p.getMemory() >= memory)
                .map(Phone::getModel)
                .collect(Collectors.toList());
        return models;
    }

    private static List<Phone> getPhoneFromDb() {
        List<Phone> phones = new ArrayList<>();
        Phone.Builder IphoneBuilder = new Phone.Builder("Apple");
        Phone iPhoneX = IphoneBuilder.setModel("Iphone X").setMemory(64).setScreenDiagonal(5.8).setBatteryLife(22).build();
        Phone iPhone7 = IphoneBuilder.setModel("iPhone 7").setMemory(32).setScreenDiagonal(4.7).setBatteryLife(30).build();
        Phone iPhone12 = IphoneBuilder.setModel("iPhone 12").setMemory(64).setScreenDiagonal(6.2).setBatteryLife(48).build();
        Phone iPhone14 = IphoneBuilder.setModel("iPhone 14").setMemory(128).setScreenDiagonal(6.5).setBatteryLife(50).build();


        Phone.Builder samsungBuilder = new Phone.Builder("Samsung");
        Phone samsungA5 = samsungBuilder.setModel("A5").setMemory(32).setScreenDiagonal(5.8).setBatteryLife(19).build();
        Phone samsungS20 = samsungBuilder.setModel("S20").setMemory(64).setScreenDiagonal(6.8).setBatteryLife(22).build();


        phones.add(iPhoneX);
        phones.add(iPhone7);
        phones.add(iPhone12);
        phones.add(iPhone14);

        phones.add(samsungA5);
        phones.add(samsungS20);
        return phones;
    }

}
