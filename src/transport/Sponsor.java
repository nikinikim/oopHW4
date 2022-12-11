package transport;

public class Sponsor {


    private String name;

    private final double supportSum;

    public Sponsor(String name, double supportSum) {
        this.name = name;
        this.supportSum = supportSum;
    }

    public String getName() {
        return name;
    }

    public double getSupportSum() {
        return supportSum;
    }

    public void contributeRace() {
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n рублей", name, supportSum);
    }

    @Override
    public String toString() {
        return name + " сумма поддержки: " + supportSum;
    }
}
