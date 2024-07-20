package supercoding.fourthweek.디자인패턴.싱글톤;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSingleton {

    private static FileWriterSingleton instance = null;
    private FileWriter fileWriter;


    public FileWriterSingleton() {
        try {
            this.fileWriter = new FileWriter("C:\\Users\\user\\Documents\\codingTest\\supercoding\\fourthweek\\디자인패턴\\싱글톤\\text.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized static FileWriterSingleton getInstance() {  // 자기 자신 호출, 임계영역 설정
        if (instance == null) {
            instance = new FileWriterSingleton();
        }
        return instance;
    }

    public void writeToFile(String message) {
        try {
            fileWriter.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFile() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
