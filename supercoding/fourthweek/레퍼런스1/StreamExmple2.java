package supercoding.fourthweek.레퍼런스1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class StreamExmple2 {

    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("C001", "이순신"));
        customers.add(new Customer("C002", "아이유"));
        customers.add(new Customer("C003", "카리나"));
        customers.add(new Customer("C004", "윈터"));
        customers.add(new Customer("C002", "아이유"));
        customers.add(new Customer("C003", "카리나"));
        customers.add(new Customer("C002", "아이유"));

        Customer myCustomer = new Customer("C002", "아이유");

        // Q. myCustomer와 동일한 객체는 몇 개인지 출력하가.
//        List<Customer> results =
                long result = customers.stream()
//                .filter(i -> myCustomer.equals(i))
                .filter(myCustomer::equals)
//                .map(i -> i.getClass())
//                .map(Customer::getClass)
                .count();
        System.out.println(result);


        // Q. customers 의 각각의 bonusPoint를 얻어라.
        List<Integer> resultPoint = customers.stream()
//                .map(i -> i.getBonusPoint())
                .map(Customer::getBonusPoint)
                .collect(Collectors.toList());

        System.out.println(resultPoint);






    }
}
