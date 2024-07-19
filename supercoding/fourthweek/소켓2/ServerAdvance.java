package supercoding.fourthweek.소켓2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {

    // 종단없이 무한으로 만들기
    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();  // 고객 대기 명단

        try (ServerSocket serverSocket = new ServerSocket(1234);) {
            System.out.println("서버가 시작되었습니다.");

            while (true) {
                try(Socket clientSocket = serverSocket.accept();) {// 클라이언트 접속 대기) {
                    // 클라이언트로부터 데이터를 받기 위한 InputStream  생성
                    InputStream clientInputStream = clientSocket.getInputStream();
                    BufferedReader clientBufferedReader = new BufferedReader(new InputStreamReader(clientInputStream));

                    // 클라이언트로 데이터를 보내기 위한 OutputStream 생성
                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

                    // inputLine
                    String inputLine;

                    // 클라이언트로부터 데이터를 읽고 화면에 출력
                    while((inputLine = clientBufferedReader.readLine()) != null) {
                        System.out.println("클라이언트에서 온 요청은 " + inputLine);

                        String[] strs = inputLine.split(","); // "A,B,C" -> ["A", "B", "C"]
                        String ID = strs[0];
                        String name = strs[1];
                        Customer customer = new Customer(ID, name);

                        customerList.add(customer);

                        // 클라이언트에게 응답을 보냄
                        printWriter.println("현재 고객대기명단은: " + customerList);
                    }
                } catch (IOException e) {
                e.printStackTrace();
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
