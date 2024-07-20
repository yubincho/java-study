package assignment4week_정답아님.fourthDay;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    public static void main(String[] args) {

        // 유저 대기리스트
        List<User> userList = new ArrayList<>();

        // 1. 서버 소켓 생성
        try(ServerSocket serverSocket = new ServerSocket(1234)){
            System.out.println("서버가 시작되었습니다.");

            while(true) {
                // TODO: 유저 Server 연결 필요합니다.
                try (Socket clientSocket = serverSocket.accept();) {
                    System.out.println("클라이언트가 연결되었습니다.");

                    // TODO: 클라이언트로부터 전송된 UserDTO 수신
                    InputStream clientInputStream = clientSocket.getInputStream();
                    ObjectInputStream objectInputStream = new ObjectInputStream(clientInputStream);

                    // TODO: UserDTO를 User 객체로 변환
                    UserDTO userDTO = (UserDTO) objectInputStream.readObject();
                    User user = userDTO.toUser();

                    // TODO: 유저등록
                    userList.add(user);
                    System.out.println("새로운 유저가 등록되었습니다. " + userList);

                    // TODO: Client로 출력한 PrintWriter를 이용한 ServerOutputStream 출력
                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

                    // TODO: Client 에 응답 출력
                    printWriter.println("현재 고객대기명단은: " + userList);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
