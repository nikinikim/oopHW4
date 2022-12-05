package transport;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A4", 2.0);
        Car bmw = new Car("Bmw", "X5", 3.0);
        Car mercedes = new Car("Mercedes", "C200", 1.8);
        Car kia = new Car("KIA", "K5", 2.4);

        Truck kamaz = new Truck("Камаз", "К5", 8.0);
        Truck man = new Truck("Man", "TGX", 5.0);
        Truck ural = new Truck("Урал", "4320", 11.5);
        Truck scania = new Truck("Scania", "G2", 9.2);

        Bus ikarus = new Bus("Икарус", "250", 5.0);
        Bus paz = new Bus("ПАЗ", "32053", 4.0);
        Bus zil = new Bus("ЗиЛ", "118", 5.0);
        Bus gaz = new Bus("ГАЗ", "651", 5.0);

        System.out.println(audi);
        audi.startMovement();
        audi.finishMovement();
        audi.pitStopped();
        audi.bestTimeOfLap();
        audi.maxSpeed();

        DriverB ben = new DriverB("Ben Beno Benov", "B", 5, audi);

        System.out.println(ben);
        ben.reFill();




    }
}