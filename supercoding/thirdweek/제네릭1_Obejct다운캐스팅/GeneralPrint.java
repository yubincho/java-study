package supercoding.thirdweek.제네릭1_Obejct다운캐스팅;

public class GeneralPrint {

    private Object material;

    public void printMyInfo() {
        System.out.println(material + "를 출력합니다.");
    }

    public Object getMaterial() {
        return material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }
}
