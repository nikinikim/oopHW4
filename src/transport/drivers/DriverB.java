package transport.drivers;

import transport.Car;

public class DriverB extends Driver<Car> {
    public DriverB(String fullName, String license, int driveExperience, Car car) {
        super(fullName, license, driveExperience, car);
    }
}
