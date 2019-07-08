package objects;

public class Main {

    public static MyObject creatObject(){
        MyObject myObject = new MyObject();

        myObject.address = myObject.objectInObject.address;
        myObject.apartmentsCount = myObject.objectInObject.apartmentsCount;
        myObject.countOfFloors = myObject.objectInObject.countOfFloors;
        myObject.owner = myObject.objectInObject.owner;

        MyObject returnObject = myObject;

        return returnObject;
    }

}
