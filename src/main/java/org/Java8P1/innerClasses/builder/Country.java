package org.Java8P1.innerClasses.builder;


import java.util.Arrays;

public class Country {
    private String name;
    private int population;
    private Country[] neighbours;
    private String[] regions;
    private String[] previousName;


    public Country(Builder builder) {
        this.name = builder.name;
        this.population = builder.population;
        this.neighbours = builder.neighbours;
        this.regions = builder.regions;
        this.previousName = builder.previousName;
    }

    public static class Builder {    // це статичний вкладений клас
        private String name;
        private int population;
        private Country[] neighbours;
        private String[] regions;
        private String[] previousName;


        public Builder(String name, int population) {
            this.name = name;
            this.population = population;
        }



        public Builder setNeighbours(Country[] neighbours) {
            this.neighbours = neighbours;
            return this;
        }

        public Builder setRegions(String[] regions) {
            this.regions = regions;
            return this;
        }

        public Builder setPreviousName(String[] previousName) {
            this.previousName = previousName;
            return this;
        }
        public Country build () {
            if (this.population <= 0) {
                throw new RuntimeException("Can't create Country object. Population cannot be less than 0");
            }return new Country(this);
        }
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", neighbours=" + Arrays.toString(neighbours) +
                ", regions=" + Arrays.toString(regions) +
                ", previousName=" + Arrays.toString(previousName) +
                '}';
    }
}
