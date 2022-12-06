package transport;

public class Truck extends Transport implements Competitive {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
    public String toString() {
        return "Truck{} " + super.toString();
    }

}
