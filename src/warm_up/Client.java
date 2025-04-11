package warm_up;

import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to server
            int port = 99;
            Socket socket = new Socket("localhost", port);
            while(true) {System.out.println("Connect successfully to server" + "port: " + port);}

        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Cant connect to server");
        }
    }
}
