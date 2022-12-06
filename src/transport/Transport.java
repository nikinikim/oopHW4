package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = CheckingObjects.checkString(brand);
        this.model = CheckingObjects.checkString(model);
        if (engineVolume <= 0) {
            this.engineVolume = 2.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 2.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void startMovement();

    public abstract void finishMovement();

    public abstract void printType();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
