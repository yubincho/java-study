package supercoding.fourthweek.데이터관리1;

import supercoding.thirdweek.예외처리3.exceptions.IDFormatException;
import supercoding.thirdweek.예외처리3.exceptions.PositiveNumberException;

public class PTMember {

    private String ID;
    private String name;
    private Integer height;
    private Integer weight;
    private Gender gender;  // enum

    public PTMember(String name, Integer height, Integer weight, String gender) {
        if (height <= 0 || weight <= 0) throw new PositiveNumberException("0이하 일 수 없습니다.");

        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = Gender.valueOfTerm(gender);
    }

    public void setID(String ID) {
        if (ID == null) throw new IDFormatException("ID는 null 이 될 수 없습니다.");
        if (ID.length() < 8 || ID.length() > 20 ) throw new IDFormatException("ID 길이는 8자 이상 20자 이하여야 합니다.");
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PTMember{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
