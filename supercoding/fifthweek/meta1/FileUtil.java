package supercoding.fifthweek.meta1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileUtil {

    /**
     * @param filename 읽을 파일 이름
     * @return String 파일을 읽은 결과값
     * @throws IOException
     */
    public static String readFile(String filename) throws IOException {

        StringBuilder sb = new StringBuilder();
        try (FileReader fis = new FileReader("")){
            int data;
            while((data = fis.read()) != -1) {
                sb.append((char) data);
            }
        }
        return sb.toString();
    }
}
