package supercoding.fifthweek.meta3;

public class MyClass {

    @Repeat(value = 3)
    public void printMessage() {
        System.out.println("Hello World!");
    }

    @Repeat(value = 10)
    public void foo() {
        System.out.println("This is another method.");
    }
}
