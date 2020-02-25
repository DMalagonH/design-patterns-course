package course.designpatterns.strategy;

// Strategy
public interface EncryptionStrategy {

    byte[] encrypt(String text);

    String decrypt(byte[] textToDecrypt);

    boolean init();
}
