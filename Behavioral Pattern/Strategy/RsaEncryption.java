package Strategy;

public class RsaEncryption implements EncryptionStrategy {
    @Override
    public String encrypt(String text) {
        return "RSA(" + text + ")";
    }
}
