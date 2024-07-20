package supercoding.fourthweek.스레드소켓;

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
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + "서버가 시작되었습니다.");

            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();  // 클라이언트 접속 대기

                    Thread request = new Thread(new RequestHandler(clientSocket, customerList));
                    request.start();


                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}