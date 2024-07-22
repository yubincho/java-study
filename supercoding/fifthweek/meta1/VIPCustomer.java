package supercoding.fifthweek.meta1;

import java.util.Objects;

public class VIPCustomer extends Customer {

    static int serialNums = 1;

    private String customerID;
    private String name;
    private String customerGrade;

    private int bonusPoint;
    private double bonusPointRatio;

    private String agentID;
    private double discountRatio;

    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public void callAgent() {
        System.out.println("담당직원 " + this.agentID + "님 문의드릴게 있어요");
    }


    public VIPCustomer(String name) {
        this.customerID = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;

    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }


    @Override
    public String toString() {
        return "VIPCustomer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusPointRatio +
                ", agentID='" + agentID + '\'' +
                ", discountRatio=" + discountRatio +
                '}';
    }

//    @Override
//    public int hashCode() {
//        return 2000;
//    }
    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }

}
