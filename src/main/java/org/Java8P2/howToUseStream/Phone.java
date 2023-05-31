package org.Java8P2.howToUseStream;


public class Phone {
    private String maker;
    private String model;
    private int memory;
    private double screenDiagonal;
    private int batteryLife;

    private Phone(Builder builder) {
        this.maker = builder.maker;
        this.model = builder.model;
        this.memory = builder.memory;
        this.screenDiagonal = builder.screenDiagonal;
        this.batteryLife = builder.batteryLife;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public static class Builder {
        private String maker;
        private String model;
        private int memory;
        private double screenDiagonal;
        private int batteryLife;

        public Builder(String maker) {
            this.maker = maker;
        }

        public Builder setMaker(String maker) {
            this.maker = maker;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setMemory(int memory) {
            this.memory = memory;
            return this;
        }

        public Builder setScreenDiagonal(double screenDiagonal) {
            this.screenDiagonal = screenDiagonal;
            return this;
        }

        public Builder setBatteryLife(int batteryLife) {
            this.batteryLife = batteryLife;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}