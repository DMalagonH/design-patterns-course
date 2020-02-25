package course.designpatterns.strategy;

import java.util.Random;


// Concrete strategy
public class CaesarStrategy implements EncryptionStrategy {

    private static String ALPHABET = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ ,.-";
    private int shift;

    @Override
    public byte[] encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (int index = 0; index < text.length(); index++) {
            int charPosition = ALPHABET.indexOf(text.charAt(index));
            int newCharacterPosition = (shift + charPosition) % ALPHABET.length();
            char newCharacter = ALPHABET.charAt(newCharacterPosition);
            encryptedText.append(newCharacter);
        }

        byte[] result = encryptedText.toString().getBytes();
        return result;
    }

    @Override
    public String decrypt(byte[] textToDecrypt) {
        String encryptedText = new String(textToDecrypt);
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < encryptedText.length(); index ++) {
            int alphabetPosition = ALPHABET.indexOf(encryptedText.charAt(index));
            int newCharacterPosition = (alphabetPosition - shift) % ALPHABET.length();
            if (newCharacterPosition < 0) {
                newCharacterPosition = ALPHABET.length() + newCharacterPosition;
            }
            char newCharacter = ALPHABET.charAt(newCharacterPosition);
            result.append(newCharacter);
        }
        return result.toString();
    }

    @Override
    public boolean init() {
        Random random = new Random();
        shift = random.nextInt(ALPHABET.length());
        return true;
    }
}
