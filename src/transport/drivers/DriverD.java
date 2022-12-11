package transport.drivers;

import transport.Bus;

public class DriverD extends Driver<Bus>{
    public DriverD(String fullName, String license, int driveExperience, Bus car) {
        super(fullName, license, driveExperience, car);
    }
}
