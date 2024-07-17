package supercoding.내부클래스유틸래스;

public class OuterStaticClass {

    private static int outerData;

    public OuterStaticClass(int outerData) {

    }

    public static class InnerClass {
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display() {
            System.out.println("OuterData: " + outerData);
            // static 클래스가 OuterClass 보다 먼저 만들어지기 때문에 바로 접근 불가.
            // outerData 를 static 으로 만들어야 접근 가능
            System.out.println("InnerData: " + innerData);
        }
    }
}
