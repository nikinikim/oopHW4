package transport.drivers;

import transport.Transport;

public abstract class Driver <T extends Transport>{
    private final String fullName;
    private final String license;
    private final int driveExperience;
    private final T car;

    public Driver(String fullName, String license, int driveExperience, T car) {
        this.fullName = fullName;
        this.license = license;
        this.driveExperience = driveExperience;
        this.car = car;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLicense() {
        return license;
    }

    public int getDriveExperience() {
        return driveExperience;
    }

    public T getCar() {
        return car;
    }

    public void startDriving() {
        System.out.println("Водитель " + getFullName() + " начал движение.");

    }
    public void finishDriving() {
        System.out.println("Водитель " + getFullName() + " закончил движение.");

    }
    public void reFill() {
        System.out.println("Водитель " + getFullName() + " заправляет машину " + this.car.getBrand() + this.car.getModel());
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде", getFullName(), car.getBrand(), car.getModel());
    }
}
