package transport;

import transport.enums.TypeOfBody;

public class Car extends Transport implements Competitive {
    private TypeOfBody typeOfBody;
    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
        if (typeOfBody == null) {
            System.out.println("Данных по автомобилю недостаточно");
        }else {
            System.out.println("Тип: " + typeOfBody.getTitle());
        }
    }

    @Override
    public void pitStopped() {
        System.out.println("KПриехал на пит-стоп");

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
    public String toString() {
        return "Car{}" + super.toString();
    }

}
