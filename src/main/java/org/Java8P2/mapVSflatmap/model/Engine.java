package org.Java8P2.mapVSflatmap.model;

public class Engine {
    private String model;
    private int horsePower;

    public Engine(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
