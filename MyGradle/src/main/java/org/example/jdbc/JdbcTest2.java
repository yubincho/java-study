package org.example.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class JdbcTest2 {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/chapter_80?useUnicode=true&characterEncoding=UTF-8";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";

    public static void main(String[] args) throws SQLException {

        String sqlQuery1 = "select user_id, user_name, like_travel_place" +
                " from users" +
                " where user_name = ? ";
        String sqlQuery2 = "select ticket_type, departure_loc, arrival_loc, departure_at, return_at, total_price" +
                " from airline_ticket" +
                " where departure_loc = '서울' and ticket_type = '왕복' and arrival_loc = ?" +
                " order by total_price; ";

        System.out.println("유저 이름을 입력해 주세요~");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        try(Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery1);
            PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery2);
        ) {

            preparedStatement1.setString(1, userName);
            ResultSet resultSet = preparedStatement1.executeQuery();

            String place = null;
            if (resultSet.next()) {
                place = resultSet.getNString("like_travel_place");
            }
            System.out.println(place);
            // username 으로 선호하는 곳 동적으로 질의하기

            Optional<String> likeTravelPlace = Optional.ofNullable(place);
            String likePlace = likeTravelPlace.orElseThrow(() -> new RuntimeException());
            System.out.println("선호하는 곳은 '" + likePlace + "' ");

            // 얻어낸 likePlace 로 항공권 동적으로 질의하기
            preparedStatement2.setString(1, likePlace);
            ResultSet resultSet2 = preparedStatement2.executeQuery();

            while(resultSet2.next()) {
                String ticketType = resultSet2.getNString("ticket_type");
                String departureLoc = resultSet2.getNString("departure_loc");
                LocalDate departureAt = resultSet2.getDate("departure_at").toLocalDate();
                String arrivalLoc = resultSet2.getNString("arrival_loc");
                LocalDate arriveAt = resultSet2.getDate("arrival_at").toLocalDate();

                System.out.println(" "+ ticketType + " "+ departureLoc +  " "+ departureAt + " "+ arrivalLoc +  " "+ arriveAt);
            }




        }

    }
}
