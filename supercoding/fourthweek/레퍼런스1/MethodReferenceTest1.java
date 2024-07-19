package supercoding.fourthweek.레퍼런스1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest1 {

    public static void main(String[] args) {

        // static method
        // Consumer 반환이 void 라서 printSomething 메소드가 적용된 것임 (printSomething 도 반환이 void)
        Consumer<String> ex1 = (str) -> Printer.printSomething(str);
        Consumer<String> ex2 = Printer::printSomething;

        ex1.accept("Lambda 식 사용");
        ex2.accept("Method Reference 사용");

        // 생성자 호출
        Supplier<Customer> ex3 = () -> new Customer();
        Supplier<Customer> ex4 = Customer::new;

        System.out.println(ex3.get());  // null 로 반환됨 : 인자값이 없이 생성됐지 때문(default 생성자) 
        System.out.println(ex4.get());  // null 로 반환됨 : 인자값이 없이 생성됐지 때문(default 생성자로 적용됨) 

        Function<String, Customer> ex5 = (str) -> new Customer(str);
        Function<String, Customer> ex6 = Customer::new;

        System.out.println(ex5.apply("이순신"));
        System.out.println(ex6.apply("아이유"));






    }
}
