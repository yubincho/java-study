package supercoding.secondweek.인터페이스;

public class InterfaceTest2 {

    public static void main(String[] args) {

        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AB12233");

        drone.fly();
        airplane.fly();


        if (drone instanceof Drone) {
            Drone drone2 = (Drone) drone;
            drone2.takePicture();
        }

    }
}
