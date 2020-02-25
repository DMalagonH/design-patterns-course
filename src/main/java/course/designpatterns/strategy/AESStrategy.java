package course.designpatterns.strategy;

import java.security.*;
import javax.crypto.*;

// Concrete strategy
public class AESStrategy implements EncryptionStrategy {

    private KeyGenerator generator;
    private Key key;
    private Cipher cipher;

    @Override
    public byte[] encrypt(String text) {
        byte[] result = null;
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key);
            result = cipher.doFinal(text.getBytes());
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return result;
    }

    @Override
    public String decrypt(byte[] textToDecrypt) {
        String result = null;
        try {
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decrypted = cipher.doFinal(textToDecrypt);
            result = new String(decrypted);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return result;
    }

    @Override
    public boolean init() {
        boolean result = false;
        try {
            generator = KeyGenerator.getInstance("AES");
            generator.init(128);
            key = generator.generateKey();
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            result = true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return  result;
    }
}
