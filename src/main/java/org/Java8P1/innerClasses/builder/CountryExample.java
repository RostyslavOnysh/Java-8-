package org.Java8P1.innerClasses.builder;

public class CountryExample {
    public static void main(String[] args) {
        Country australia = new Country.Builder("Name", 500_000_000)
                .setRegions(new String[]{"Viktoria"})
                .build();
        System.out.println(australia);
    }
}

