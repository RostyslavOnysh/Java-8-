package org.Java8P2.collectToMap.model;

public class Advertisement {
    private User owner;
    private Car car;

    public Advertisement(User owner, Car car) {
        this.owner = owner;
        this.car = car;
    }

    public User getOwner() {
        return owner;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "owner=" + owner +
                ", car=" + car +
                '}';
    }
}
