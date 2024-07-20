package supercoding.fourthweek.스레드소켓;

import java.util.List;

public class ListUtil {

    public synchronized static void addList(List<Customer> customerList, Customer newCustomer) {
        customerList.add(newCustomer);
    }
}
