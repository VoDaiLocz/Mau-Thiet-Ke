package Strategy;

import java.util.Base64;

public class Base64Encryption implements EncryptionStrategy {
    @Override
    public String encrypt(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
