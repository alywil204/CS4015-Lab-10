public class Demo {
    public static void main(String[] args) {
        ChatClient client = new ChatClient(new DESEncryption());
        client.send("message");
        client.setEncryptionStrategy(new AESEncryption());
        client.send("message");
    }
}