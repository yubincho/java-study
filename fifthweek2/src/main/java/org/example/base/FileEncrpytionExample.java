package org.example.base;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileEncrpytionExample {

    public static void main(String[] args) throws IOException {
        String encryptedOutputFilePath = "C:\\Users\\user\\Documents\\codingTest\\fifthweek2\\src\\main\\java\\org\\example\\base\\encrypted_abc.txt";
        String decryptedOutputFilePath = "decrypted_abc.txt";

        //
        String fileRead = readTextFile(encryptedOutputFilePath);
        String decodedFile = JasyptConfigDES.jasyptDecrypt(fileRead);
        try(FileOutputStream fos = new FileOutputStream(decryptedOutputFilePath);){
            byte[] bytes = decodedFile.getBytes();
            fos.write(bytes);
            System.out.println("Decryption completed successfully." + decodedFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String readTextFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
