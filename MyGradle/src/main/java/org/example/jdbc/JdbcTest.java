package org.example.jdbc;

import java.sql.*;

public class JdbcTest {

    /**
     * 1000원 이상 산 group singer 를 구하는 SELECT 문을 JDBC로 실행해보자.
     * group singer에 새로운 singer "르세라핌"을 넣어 Insert 문을 JDBC로 실행해보자.
     */
    // RDB, mySql 접근 정보
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chapter_76?useUnicode=true&characterEncoding=UTF-8";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";


    public static void main(String[] args) {
        // connection 만들기
        try(Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement()
        ) {
            // 1000원 이상 산 group singer 를 구하기
//            String stringSQL = "SELECT *" +
//                    " FROM group_singer g" +
//                    " JOIN buy_history b" +
//                    " ON b.mem_id = g.mem_id" +
//                    " WHERE b.price > 1000; ";
            connection.setAutoCommit(false);

            String stringSQL = "SELECT *" +
                    " FROM group_singer g; ";

            ResultSet resultSet = statement.executeQuery(stringSQL);

            while (resultSet.next()) {
                String memId = resultSet.getString("mem_id");
                String memName = resultSet.getString("mem_name");
//                long price = resultSet.getLong("price");

//                System.out.println("mem_id : " + memId + " mem_name: " + memName + " price: " + price);
                System.out.println("mem_id : " + memId + " mem_name: " + memName );
            }

            // group singer에 새로운 singer "르세라핌"을 넣어보자.
//            String stringSql2 = "INSERT INTO group_singer(mem_id, mem_name, mem_number, addr, phone, height, debut_date)" +
//                    " VALUES ('M12000', '아이유그룹', 5, '서울', '0101231234', 160, '2022-12-06'); ";
//
//            statement.executeUpdate(stringSql2); // update는 executeUpdate 또는 execute 를 사용해야 함

            connection.commit();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
