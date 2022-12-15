package transport;

import transport.enums.LoadCapacity;

public class Truck extends Transport implements Competitive {

    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMovement() {
        System.out.println("Движение начато");
    }

    @Override
    public void finishMovement() {
        System.out.println("Движение закончено");
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по автомобилю недостаточно");
        }else {
            String from = loadCapacity.getFrom() == null ? "" : "от " + loadCapacity.getFrom() + " ";
            String to = loadCapacity.getTo() == null ? "" : " до " + loadCapacity.getTo();
            System.out.println("Грузоподъемность: " + from + to + " тонн.");
        }
    }

    @Override
    public boolean getDiagnosed() {
        return Math.random() > 0.5;
    }

    @Override
    public void pitStopped() {
        System.out.println("Приехал на пит-стоп");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Лучшее время круга: ...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: ...");
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен");
    }


    @Override
    public String toString() {
        return "Truck{} " + super.toString();
    }

}
