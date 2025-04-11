package warm_up;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            // Create server socket and listen
            int port = 99;
            ServerSocket ss = new ServerSocket(port);

            // Accept socket from client
            Socket clientSocket = ss.accept();

            // Communication
            Thread.sleep(5000);

            // Off connection
            clientSocket.close();
            ss.close();

        } catch(Exception e)

        {
            e.printStackTrace();
        }
    }
}
