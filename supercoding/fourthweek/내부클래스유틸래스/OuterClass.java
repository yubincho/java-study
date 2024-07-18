package supercoding.fourthweek.내부클래스유틸래스;

public class OuterClass {

    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public class InnerClass {
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display() {
            System.out.println("OuterData: " + outerData);
            // outerData 가 private 이라도  inner class가 OuterClass 클래스 안이라서 바로 접근 가능하다.
            System.out.println("InnerData: " + innerData);
        }
    }
}
