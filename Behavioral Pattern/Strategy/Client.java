package Strategy;

public class Client {
    public static void main(String[] args) {
        Encryptor encryptor = new Encryptor();

        encryptor.setEncryptionStrategy(new AesEncryption());
        encryptor.encrypt("design-pattern");

        encryptor.setEncryptionStrategy(new RsaEncryption());
        encryptor.encrypt("design-pattern");

        encryptor.setEncryptionStrategy(new Base64Encryption());
        encryptor.encrypt("design-pattern");
    }
}
