package cars;

import java.util.Random;

public class Car2 {

    private static final Random r = new Random();

    private  String brand = "Korch";
    private   Integer maxSpeed = 80;
    private   Integer minSpeed = 0;
    private   Integer engineNumber = r.nextInt();
    private   String driverName = "mrSpeedy";

    static String getBrand(Car2 car2) {
        return car2.brand;
    }

    Integer getMaxSpeed() {
        return maxSpeed;
    }

    Integer getMinSpeed() {
        return minSpeed;
    }

    Integer getEngineNumber() {
        return engineNumber;
    }

    static String getDriverName(Car2 car2) {
        return car2.driverName;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void setMinSpeed(Integer minSpeed) {
        this.minSpeed = minSpeed;
    }

    void setEngineNumber(Integer engineNumber) {
        this.engineNumber = engineNumber;
    }

    static void setDriverName(Car2 car2, String driverName) {
        car2.driverName = driverName;
    }

    @Override
    public String toString() {
        return String.format("{brand: %s, maxSpeed: %d, minSpeed: %d, engineNumber: %d, driverName: %s}",
                brand,
                maxSpeed,
                minSpeed,
                engineNumber,
                driverName);
    }
}
