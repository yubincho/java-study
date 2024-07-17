package supercoding.데이터관리2;

public class StringNullDefault {

    public static void main(String[] args) {

        String str = "abc";
        try {
            int length = str.length();
            System.out.println(length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException이 발생했습니다.");
            str = "";
            int length = str.length();
            System.out.println(length);
        }
    }
    // NullPointerException이 발생했습니다.
    //0
}
