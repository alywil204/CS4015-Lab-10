public class DESEncryption implements EncryptionStrategy {
    public String encrypt(String message) {
        System.out.println("Encrypting message using DES");
        return message;
    }
}