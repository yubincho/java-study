package supercoding.제네릭1_Obejct다운캐스팅;

public class PrintSituation {

    public static void main(String[] args) {
        // 1.기획 : String 을 출력하는 프린터를 만들어주세요~
        GeneralPrint print = new GeneralPrint();
        print.setMaterial("설계도");

        String material = (String) print.getMaterial();
        print.printMyInfo();

        // 2.기획 : Integer 을 출력하는 프린터를 만들어주세요~
        GeneralPrint print2 = new GeneralPrint();
        print2.setMaterial(1235);

        Integer intMaterial = (Integer) print2.getMaterial();
        print2.printMyInfo();

        // 3.기획 : Boolean 을 출력하는 프린터를 만들어주세요~
        GeneralPrint print3 = new GeneralPrint();
        print3.setMaterial(true);

        Boolean booleanMaterial = (Boolean) print3.getMaterial();
        print3.printMyInfo();
    }
}
