package supercoding.thirdweek.예외처리3;

public class ThrowUncheckException {

    public static void main(String[] args) {

        System.out.println("메인 메소드가 실행됩니다.");

        int myInt = 0;
        try {
            myInt = getElement(10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Int: " + myInt);

        System.out.println("메인 메소드가 종료됩니다..");
    }

    private static int getElement(int index) throws Exception {
        int[] arrInt = {1,2,3,4,5,6,7,8,9,10};

        if (index >= arrInt.length) {
            throw new Exception("Index는 ArrInt의 길이를 넘을 수 없습니다.");
        }
        return arrInt[index];
    }
}
