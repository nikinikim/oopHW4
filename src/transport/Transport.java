package transport;

import transport.drivers.Driver;

import java.util.*;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    Set<Mechanic> mechanicSet;

    Set<Sponsor> sponsorSet;


    public Transport(String brand, String model, double engineVolume) {
        this.brand = CheckingObjects.checkString(brand);
        this.model = CheckingObjects.checkString(model);
        if (engineVolume <= 0) {
            this.engineVolume = 2.0;
        } else {
            this.engineVolume = engineVolume;
        }
        this.mechanicSet = new HashSet<>();
        this.sponsorSet = new HashSet<>();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 2.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public Set<Mechanic> getMechanicSet() {
        return mechanicSet;
    }

    public Set<Sponsor> getSponsorSet() {
        return sponsorSet;
    }

    public abstract void startMovement();

    public abstract void finishMovement();

    public abstract void printType();

    public abstract boolean getDiagnosed();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public abstract void repair();
}
