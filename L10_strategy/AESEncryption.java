public class AESEncryption implements EncryptionStrategy {
    public String encrypt(String message) {
        System.out.println("Encrypting message using AES");
        return message;
    }
}