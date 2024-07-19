package supercoding.fourthweek.직렬화역직3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {

    // 종단없이 무한으로 만들기
    public static void main(String[] args) throws IOException {

        List<Customer> customerList = new ArrayList<>();  // 고객 대기 명단

        try (ServerSocket serverSocket = new ServerSocket(1234);) {
            System.out.println("서버가 시작되었습니다.");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();) { // 클라이언트 접속 대기)
                    // 클라이언트로부터 데이터를 받기 위한 InputStream  생성
                    InputStream clientInputStream = clientSocket.getInputStream();
                    ObjectInputStream objectInputStream = new ObjectInputStream(clientInputStream);

                    // 클라이언트로 데이터를 보내기 위한 OutputStream 생성
                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

                    //
                    Customer customer = (Customer) objectInputStream.readObject();

                    customerList.add(customer);
                    System.out.println(customer + "가 대기명단에 추가되었습니다");

                    // 클라이언트에게 응답을 보냄
                    printWriter.println("현재 고객대기명단은: " + customerList);

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}