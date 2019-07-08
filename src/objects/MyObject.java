package objects;

public class MyObject {

    public String address;

    public int countOfFloors;

    public int apartmentsCount;

    public String owner;

    // Это поле инициализировать в методе `createObject()` не надо.
    public OtherObject2 objectInObject = new OtherObject2();

}