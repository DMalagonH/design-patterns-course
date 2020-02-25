package course.designpatterns.strategy;

public class StrategyContext {

    private EncryptionStrategy strategy;

    public StrategyContext(EncryptionStrategy strategy) {
        this.setStrategy(strategy);
    }

    public byte[] encryptText(String text) {
        byte[] result = strategy.encrypt(text);
        return result;
    }

    public String decryptText(byte[] text) {
        String result = strategy.decrypt(text);
        return result;
    }

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
        this.strategy.init();
    }
}
