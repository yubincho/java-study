package supercoding.fourthweek.스레드소켓;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class RequestHandler implements Runnable{

    private Socket clientSocket;
    private List<Customer> customerList;

    public RequestHandler(Socket clientSocket, List<Customer> customerList) {
        this.clientSocket = clientSocket;
        this.customerList = customerList;
    }

    @Override
    public void run() {

        try {
            // 클라이언트로부터 데이터를 받기 위한 InputStream  생성
            InputStream clientInputStream = clientSocket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(clientInputStream);

            // 클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

            //
            Customer customer = (Customer) objectInputStream.readObject();

            ListUtil.addList(customerList, customer); // 임계영역 설정

            System.out.println("Thread " + Thread.currentThread().getName() + ": " + customer + "가 대기명단에 추가되었습니다");

            // 클라이언트에게 응답을 보냄
            printWriter.println("현재 고객대기명단은: " + customerList);

            clientSocket.close();

        } catch (Exception e) {
           e.printStackTrace();
        }

    }
}
