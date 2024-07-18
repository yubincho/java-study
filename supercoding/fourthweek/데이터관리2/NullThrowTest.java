package supercoding.fourthweek.데이터관리2;

public class NullThrowTest {

    public static void main(String[] args) {

        
        // 원래 메인 메소드에 try ~ catch 안에 Exception을 던지면 안되는데 편의상 구성하였음
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            throw new CustomException("CustomException이 발생하였습니다");
        }




    }

    static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }
}
