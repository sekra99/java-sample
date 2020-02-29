package com.dilshan.sample;

public class Sensor {

    public Sensor(String name, double value) {
        this.name = name;
        this.value = value;

    }

    private String name;
      private double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public void setValue(double value) {
        this.value = value;

    }
}
