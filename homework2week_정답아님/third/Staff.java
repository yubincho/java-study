package homework2week_정답아님.third;

public class Staff {

    private long nikeSneakersPrice = 50_000;

    private String[] nikeSneakersFeature = {"안정감", "편안함", "가벼움"};

    private boolean havingNikeSneakersInStore = false; // 매장 Nike sneakers 재고 여부

    public void sayToCustomerAboutProduct() {
        System.out.println("해당 운동화의 특징과(안정감, 편암함, 가벼움)과 가격("
                + this.nikeSneakersPrice + ")을 자세히 설명해줍니다.");
    }

    public void isHavingNikeSneakersInStore(boolean havingNikeSneakersInStore) {
        if (!havingNikeSneakersInStore) {
            System.out.println("Nike 운동화 재고 있습니다.");
            System.out.println("Nike 운동화는 " + this.nikeSneakersPrice + "입니다.");
            //
        }
    }

    public void askDeliveryOrNot(boolean isCustomerLikeDelivery) {
        System.out.println("재고가 부족합니다. 물품 배송 해드릴까요?");
        if (isCustomerLikeDelivery) {
            Customer.sayDontBuy();
        } else {
            System.out.println("신발 결제 안내드립니다.");
        }
    }


    public long incomeMoney(long customerMoney) {
        return nikeSneakersPrice += customerMoney;
    }


    public void deliverProduct() {
        System.out.println("'매장 직원'은 운동화를 찾아 '고객'에게 전달합니다.");
    }

    ////////////////////////////////////////////////////////////////////////////


    public void askDeliveryToMan() {
        System.out.println(" '배송 담당자'에게  Nike 운동화 요청");
    }








}
