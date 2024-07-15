package supercoding.여러기본클캐스;

public class StringBuilderTest {

    public static void main(String[] args) {

        String str = "";

        /////////////////////////
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 5000; i++) {
            str += "Cat";
        }

        long endTime = System.currentTimeMillis();
        System.out.println("String " + (endTime - startTime) + "ms");

        /////////////////////////

        long startTime2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 500; i++) {
            sb.append("Cat");
        }

        long endTime2 = System.currentTimeMillis();
        System.out.println("Sb " + (endTime2 - startTime2) + "ms");

    }
}
