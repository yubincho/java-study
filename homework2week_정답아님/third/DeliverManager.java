package homework2week_정답아님.third;

public class DeliverManager {

    private int daysForDeliver = 3;
    private int costForDeliver = 15_000;


    public void sayDelDateAndMoneyToStaffAndCustomer() {
        System.out.println("배송 예정 소요일자 " + this.daysForDeliver + "일과 배송료는" + this.costForDeliver + "입니다.");
        System.out.println("배송료 + 신발가격을 '고객'에게 전달");
    }


    public void makePackage() {
        System.out.println("'배송 담당자'는 Nike 운동화 요청 받아 운동화가 들어있는 택배 패키지를 만듭니다.");
    }

    public long income() {
        return costForDeliver += costForDeliver;
    }

    public void deliverPackage() {
        System.out.println("'배송 담당자'는 '고객'에게 택배 패키지를 전달합니다.");
    }

}
