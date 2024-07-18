package supercoding.thirdweek.예외처리3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptionTest {

    public static void main(String[] args) {

        try {
            printFile("C:\\Users\\user\\Documents\\codingTest\\supercoding\\예외처리1\\연습.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void printFile(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fs = getFileStream(fileName);

        int i;

        while ((i=fs.read()) != -1) {
            System.out.write(i);
        }
    }

    static FileInputStream getFileStream(String fileName) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream(fileName);
        return fs;
    }
}
