package transport.drivers;

import transport.Truck;

public class DriverC extends Driver<Truck>{
    public DriverC(String fullName, String license, int driveExperience, Truck car) {
        super(fullName, license, driveExperience, car);
    }
}
