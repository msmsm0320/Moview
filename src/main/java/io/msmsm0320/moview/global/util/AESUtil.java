package io.msmsm0320.moview.global.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESUtil {

    private static final String ALGORITHM = "AES";

    private static final String AES_KEY = "";

    public static String encrypt(String plainText){
        try{
            SecretKeySpec secretKey = new SecretKeySpec(AES_KEY.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encrypted = cipher.doFinal(plainText.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e){
            throw new RuntimeException("AES 암호화 실패",e);
        }
    }

    public static String decrypt(String encryptedText){
        try{
            SecretKeySpec secretKey = new SecretKeySpec(AES_KEY.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
            return new String(decrypted);
        } catch (Exception e){
            throw new RuntimeException("AES 복호화 실패", e);
        }
    }
}
