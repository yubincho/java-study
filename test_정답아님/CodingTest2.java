package test_정답아님;

public class CodingTest2 {

    public static void main(String[] args) {


    String[] arr1 = {"3141592"};
    String[] arr2 = {"271"};

    StringBuilder sb = new StringBuilder();
    for (String s : arr1) {
        sb.append(s);
    }
    String stringArr1 = sb.toString();

    /////////
    StringBuilder sb2 = new StringBuilder();
    for (String k : arr2) {
        sb2.append(k);
    }
    String stringArr2 = sb2.toString();
    System.out.println("[stringArr2]" + stringArr2);
    /////////

    int intArr2 = 0;
//    for (int i = 0; i < stringArr2.length(); i++) {
//        intArr2 = Integer.parseInt(stringArr2);
//    }
    intArr2 = Integer.parseInt(stringArr2);
    System.out.println("[intArr2]" + intArr2);

    int count = 0;
    int newArr = 0;
    String firstStr = arr1[0];
    for (int i = 0; i < firstStr.length() - 3; i++) {
        int end = i + 3;
        String substring = firstStr.substring(i, end);
        newArr = Integer.parseInt(substring);

        if (newArr <= intArr2) {
            System.out.println(newArr);
            count++;
        }
    }

    System.out.println(count);

    }
}
