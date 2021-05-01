package org.mocuishla.spring.helloworld.car;

public class Car {

    private long id;
    private String model;
    private String color;

    public Car(long id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
