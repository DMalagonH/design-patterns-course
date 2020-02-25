package course.designpatterns.strategy;

public class StrategyClient {

    public static void main(String[] args) {
        String original = "Diego Malagon";

        EncryptionStrategy strategy = new CaesarStrategy();
        StrategyContext context = new StrategyContext(strategy);

        byte[] encrypted = context.encryptText(original);
        String decrypted = context.decryptText(encrypted);

        System.out.println("Ceasar: " + original);
        System.out.println("Ceasar: " + encrypted.toString());
        System.out.println("Ceasar: " + decrypted);

        strategy = new AESStrategy();
        context.setStrategy(strategy);

        encrypted = context.encryptText(original);
        decrypted = context.decryptText(encrypted);

        System.out.println("AES: " + original);
        System.out.println("AES: " + encrypted.toString());
        System.out.println("AES: " + decrypted);
    }
}
