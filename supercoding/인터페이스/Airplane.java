package supercoding.인터페이스;

public class Airplane implements Flyable{

    private String airplaneID;
    private long remainFuelAmount;
    private long maximumCapacity;


    public Airplane(String airplaneID) {
        this.airplaneID = airplaneID;
    }


    @Override
    public void fly() {
        System.out.println("비행기 ID(" + airplaneID + ")가 납니다." );
    }

    public void refillFuel(long fuel) {
        remainFuelAmount += fuel;
    }

}
