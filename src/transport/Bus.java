package transport;

import transport.enums.Capacity;

public class Bus extends Transport implements Competitive{
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
        if (capacity == null) {
            System.out.println("Данных по автомобилю недостаточно");
        }else {
            System.out.println("Вместимость: от " + capacity.getFrom() + " до " + capacity.getTo() + "мест.");
        }
    }

    @Override
    public boolean getDiagnosed() {
        System.out.println("Автобусу не требуется диагностика");
        return true;
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
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен");
    }

    @Override
    public String toString() {
        return "Bus{}" + super.toString();
    }

}
