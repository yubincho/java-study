package supercoding.fourthweek.스트림2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TravelCustomerTest {

    public static void main(String[] args) {

        List<TravelCustomer> customers = new ArrayList<>();

        customers.add(new TravelCustomer("아이유", 29, 200000));
        customers.add(new TravelCustomer("박보검", 28, 180000));
        customers.add(new TravelCustomer("송중기", 35, 250000));
        customers.add(new TravelCustomer("김태리", 32, 220000));
        customers.add(new TravelCustomer("전정국", 24, 190000));

        // 고객 명단 이름, 추가된 순서대로 출력
        customers.stream()
                        .map((customer) -> customer.getName())
                .forEach((name) -> System.out.println(name));

        // 고객들의 총 여행 비용
        long result = customers.stream()
                .map((customer) -> customer.getPrice())
                .mapToInt(i -> Math.toIntExact(i))
                        .sum();
        System.out.println(result);








    }
}
