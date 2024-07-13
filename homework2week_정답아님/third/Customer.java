package homework2week_정답아님.third;

public class Customer {

    private long reservedCash = 100_000;

    private boolean isCustomerLikeDelivery = false; // 고객의 배송 주문 선호 여부


    public void askProductInfo() {
        System.out.println("Nike 운동화에 대해 알려주세요");
    }

    public boolean isPayable(long productPrice) {
        if(productPrice > reservedCash) {
            System.out.println("다음에 올게요");
            return false;
        }
        return true;
    }

    // delivery price
    public void isdeliveryWithMoneyOk(long productPrice, long deliveryMoney) {
        long delWithProductPrice = productPrice + deliveryMoney;
        if(reservedCash < deliveryMoney) {
            System.out.println("다음에 올게요");
        } else {
            System.out.println("주문 진행");
        }
    }


    public long payProduct(long productPrice) {
        return reservedCash -= productPrice;
    }


    public static void sayDontBuy() {
        System.out.println("다음에 올게요.");
    }


    // '고객'은 신규 구매한 Nike 브랜드의 운동화를 신고,
    public void feeling() {
        System.out.println("운동화의 특징(편안함| 가벼움 등)을 경험하며 기분이 좋아집니다.");
        System.out.println("자신의 상태를 말하고 상황이 종료됩니다.");
    }

    public long payDeliveryCash(long deliveryMoney) {
        return reservedCash -= deliveryMoney;
    }



}
