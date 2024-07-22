package supercoding.fifthweek.meta1;

import supercoding.fifthweek.meta2.MyAnnotation;

import java.io.Serializable;
import java.util.Objects;

/**
 * This is a Customer class.
 */
public class Customer implements Serializable {

    public static int serialNums = 1;
    public static final int FINAL_VALUE = 5;

    public String customerID;
    protected String name;
    protected String customerGrade;

    int bonusPoint;
    double bonusRatio;

    public Customer() {
    }

    public String showCustomerInfo() {
        return String.format("(ID: %s, 이름: %S) 님의 등급은 %s 이며, 보너스 포인트는  %d ", this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    // 고객이 직접 포인트 쌓기
    @MyAnnotation(name= "가격 계산하기")
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusRatio;
        return price;
    }

    Customer(String name) {
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
        this.bonusPoint = 0;
    }
    Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusRatio +
                '}';
    }

    @MyAnnotation(name = "Equal")
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (obj instanceof Customer){
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }


}

