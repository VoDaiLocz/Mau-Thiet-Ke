package Strategy;

public class Encryptor {
    private EncryptionStrategy encryptionStrategy;

    public void setEncryptionStrategy(EncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }

    public void encrypt(String text) {
        if (encryptionStrategy == null) {
            System.out.println("No encryption strategy selected");
            return;
        }
        System.out.println(encryptionStrategy.encrypt(text));
    }
}
