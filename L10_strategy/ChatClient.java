public class ChatClient {
    private EncryptionStrategy encryptionAlgorithm;

    public ChatClient(EncryptionStrategy encryptionAlgorithm) {
        this.setEncryptionStrategy(encryptionAlgorithm);
    }

    public void setEncryptionStrategy(EncryptionStrategy encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        this.encryptionAlgorithm.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
