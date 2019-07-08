package cars;

import java.util.Random;

public class Car1 {
    private static final Random r = new Random();

    private  static String brand = "Car1";
    private  static Integer maxSpeed = 380;
    private  static Integer minSpeed = 0;
    private  static Integer engineNumber = r.nextInt();
    private  static String driverName = "Trololoshkin";

    String getBrand() {
        return brand;
    }

    static Integer getMaxSpeed() {
        return maxSpeed;
    }

    static Integer getMinSpeed() {
        return minSpeed;
    }

    static Integer getEngineNumber() {
        return engineNumber;
    }

    static String getDriverName() {
        return driverName;
    }

    static void setBrand(String brand) {
        Car1.brand = brand;
    }

    void setMaxSpeed(Integer maxSpeed) {
        Car1.maxSpeed = maxSpeed;
    }

    void setMinSpeed(Integer minSpeed) {
        Car1.minSpeed = minSpeed;
    }

    void setEngineNumber(Integer engineNumber) {
        Car1.engineNumber = engineNumber;
    }

    void setDriverName(String driverName) {
        Car1.driverName = driverName;
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
