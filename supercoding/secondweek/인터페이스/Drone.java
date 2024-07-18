package supercoding.secondweek.인터페이스;

public class Drone implements Flyable {

    private String droneID;
    private long remainFuelAmount;
    private long remainFileStorage;

    public void takePicture() {
        Flyable.printLanding();
        System.out.println("이 드론은 사진을 찍고 있습니다.");

    }
}
