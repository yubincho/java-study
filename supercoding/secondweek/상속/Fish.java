package supercoding.상속;

public class Fish extends Animal {

    private boolean havingPoison;
    private String livingSea;

    @Override
    public void eat(String food) {
        System.out.printf("물고기가 %s 을 주둥이로 먹습니다.", food);
        System.out.println();
    }

    @Override
    public void sleep() {
        System.out.println("물고기가 잠을 자고 있습니다.");
    }

    public void swim() {
        System.out.println("물고기가 헤어을 치고 있습니다.");
    }


}
