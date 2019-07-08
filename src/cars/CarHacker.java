package cars;

public class CarHacker {

    public static Car1 car1 = new Car1();
    public static Car2 car2 = new Car2();

    public void mixer(){

        String brand = car1.getBrand();

        Car1.setBrand(Car2.getBrand(car2));
        car2.setBrand(brand);

        int maxSpeed = Car1.getMaxSpeed();

        car1.setMaxSpeed(car2.getMaxSpeed());
        car2.setMaxSpeed(maxSpeed);

        int minSpeed = Car1.getMinSpeed();

        car1.setMinSpeed(car2.getMinSpeed());
        car2.setMinSpeed(minSpeed);

        int engineNumber = Car1.getEngineNumber();

        car1.setEngineNumber(car2.getEngineNumber());
        car2.setEngineNumber(engineNumber);

        String name = Car1.getDriverName();

        car1.setDriverName(Car2.getDriverName(car2));
        Car2.setDriverName(car2, name);

    }
}
