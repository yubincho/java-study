package org.example.base;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.salt.SaltGenerator;
import org.jasypt.salt.StringFixedSaltGenerator;


public class JasyptConfigDES {

    public static String jasyptEncrypt(String value) {
        String key = "12341234"; //암호화에 사용할 키
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES"); // 알고리즘 설정
        pbeEnc.setPassword(key);

        // Salt Generator 설정
        String fixedSalt = "someFixedSalt";
        SaltGenerator saltGenerator = new StringFixedSaltGenerator(fixedSalt);
        pbeEnc.setSaltGenerator(saltGenerator);

        return pbeEnc.encrypt(value);
    }
    public static String jasyptDecrypt(String encryptedValue) {
        String key = "12341234"; // 복호화에 사용할 키
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES"); // 알고리즘 설정
        pbeEnc.setPassword(key);

        // Salt Generator 설정
        String fixedSalt = "someFixedSalt";
        SaltGenerator saltGenerator = new StringFixedSaltGenerator(fixedSalt);
        pbeEnc.setSaltGenerator(saltGenerator);

        return pbeEnc.decrypt(encryptedValue); // 주어진 암호화된 문자열을 복호화하여 반환
    }
}
