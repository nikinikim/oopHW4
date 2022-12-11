package transport;

import transport.drivers.Driver;
import transport.drivers.DriverB;
import transport.drivers.DriverC;
import transport.enums.Capacity;
import transport.enums.LoadCapacity;
import transport.enums.TypeOfBody;

import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Mechanic<Car> maxim = new Mechanic<Car>("Максим", "Сергеев", "Компания Автоспорт");
        Mechanic<Truck> sanya = new Mechanic<Truck>("Александр", "Минеев", "Компания Болид");
        Sponsor magnat = new Sponsor("Магнат", 2_000_000.00);
        Sponsor zoloto = new Sponsor("Золото", 2_500_000.00);

        Car audi = new Car("Audi", "A4", 2.0, TypeOfBody.COUPE);
        audi.addDriver(new DriverB("Ben Beno Benov", "B", 5, audi));
        audi.addMechanic(maxim);
        audi.addSponsor(magnat);

        Car bmw = new Car("Bmw", "X5", 3.0, TypeOfBody.CROSSOVER);
        Car mercedes = new Car("Mercedes", "C200", 1.8, TypeOfBody.HATCHBACK);
        Car kia = new Car("KIA", "K5", 2.4, TypeOfBody.SEDAN);

        Truck kamaz = new Truck("Камаз", "К5", 8.0, LoadCapacity.N2);
        kamaz.addDriver(new DriverC("Leon L Leonov", "C", 6, kamaz));
        kamaz.addMechanic(sanya);
        kamaz.addSponsor(zoloto);

        Truck man = new Truck("Man", "TGX", 5.0, LoadCapacity.N3);
        Truck ural = new Truck("Урал", "4320", 11.5, LoadCapacity.N3);
        Truck scania = new Truck("Scania", "G2", 9.2, LoadCapacity.N1);

        Bus ikarus = new Bus("Икарус", "250", 5.0, Capacity.MEDIUM);
        Bus paz = new Bus("ПАЗ", "32053", 4.0, Capacity.SMALL);
        Bus zil = new Bus("ЗиЛ", "118", 5.0, Capacity.LARGE);
        Bus gaz = new Bus("ГАЗ", "651", 5.0, Capacity.EXTRA_LARGE);

        getDiagnostic(audi, bmw, mercedes, kia, kamaz, man, ural, scania, ikarus, paz, zil, gaz);

        System.out.println(audi);
        audi.startMovement();
        audi.finishMovement();
        audi.pitStopped();
        audi.bestTimeOfLap();
        audi.maxSpeed();
        audi.printType();

        System.out.println();
        List<Transport> transports = List.of(audi, kamaz);

        for (Transport transport : transports) {
            printInfo(transport);
        }

        ServiceStation<Transport> serviceStation = new ServiceStation<Transport>();
        serviceStation.addTransport(audi);
        serviceStation.addTransport(kamaz);

        serviceStation.makeService();






    }
    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю "  + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водитель: " + transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механик: " + transport.getMechanics());
        System.out.println();
    }
    private static void getDiagnostic(Transport ... transports) {
        for (Transport transport : transports) {
                getDiagnosticTransport(transport);
        }
    }

    private static void getDiagnosticTransport(Transport transport) {
        if (!transport.getDiagnosed()) {
            try {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}