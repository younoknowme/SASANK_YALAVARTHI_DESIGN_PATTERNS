public class Client {
    public static void main(String[] args){

        ClubEntry entry = new ProxyEntry(new StringBuilder("Sasank"));
        entry.grantEntry();

    }
}
