package Strategy;

public class AesEncryption implements EncryptionStrategy {
    @Override
    public String encrypt(String text) {
        return "AES(" + text + ")";
    }
}
