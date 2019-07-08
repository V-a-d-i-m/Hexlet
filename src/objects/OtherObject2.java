package objects;

import java.util.Random;

public class OtherObject2 {
    private Random random = new Random();


    public String address = "Super street";// Строку можно инициализировать без явного указания конструктора
    public String owner = new String("Chelebombers");// и с явным указанием конструктора.

    public int countOfFloors = random.nextInt();
    public int apartmentsCount = random.nextInt();
}
