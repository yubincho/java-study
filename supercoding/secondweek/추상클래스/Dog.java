package supercoding.secondweek.추상클래스;

public class Dog extends Animal {



    @Override
    public void eat(String food) {
        System.out.printf("개는 %s을 단단하 이빨로 물어 먹습니다.", food);
        System.out.println();
    }

    @Override
    public void sleep() {
        System.out.println("개는 잠을 잡니다.");
    }
}
