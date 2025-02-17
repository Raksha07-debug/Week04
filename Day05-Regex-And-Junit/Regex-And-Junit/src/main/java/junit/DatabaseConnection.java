package junit;

public class DatabaseConnection {
    private boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected");
    }

    public boolean isConnected() {
        return connected;
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();

        System.out.println("Checking initial connection status " + db.isConnected());

        db.connect();
        System.out.println("Checking connection status after connect() " + db.isConnected());

        db.disconnect();
        System.out.println("Checking connection status after disconnect() " + db.isConnected());

    }
}
