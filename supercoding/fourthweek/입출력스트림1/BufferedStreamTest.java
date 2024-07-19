package supercoding.fourthweek.입출력스트림1;

import java.io.*;

public class BufferedStreamTest {

    public static void main(String[] rags) {

        try(FileReader fis = new FileReader("C:\\Users\\user\\Documents\\codingTest\\supercoding\\fourthweek\\입출력스트림1\\연습.txt");
            FileWriter fws = new FileWriter("C:\\Users\\user\\Documents\\codingTest\\supercoding\\fourthweek\\입출력스트림1\\long.txt")
        ) {

            long start = System.currentTimeMillis();

            int data;
            while ((data = fis.read()) != -1) {
                fws.write((char) data);
            }

            long end = System.currentTimeMillis();

            System.out.println("Buffered 사용 전, 파일 복사하는 데, " + (end - start) + "ms 가 걸렸습니다.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        ///////////////////////////////////////
        // BufferedReader % BufferedWriter 가 훨씬 빠르다 !!!

        try(BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\codingTest\\supercoding\\fourthweek\\입출력스트림1\\연습.txt"));
            BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Documents\\codingTest\\supercoding\\fourthweek\\입출력스트림1\\long.txt"))
        ) {

            long start = System.currentTimeMillis();

            int data;
            while ((data = bfr.read()) != -1) {
                bfw.write((char) data);
            }

            long end = System.currentTimeMillis();

            System.out.println("Buffered 사용 전, 파일 복사하는 데, " + (end - start) + "ms 가 걸렸습니다.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
