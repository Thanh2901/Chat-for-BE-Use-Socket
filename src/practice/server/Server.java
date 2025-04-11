package practice.server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            // Create server socket and listen
            int port = 99;
            ServerSocket ss = new ServerSocket(port);

            // Accept socket from clients
            while (true) {
                Socket clientSocket = ss.accept();
                MyProcess myProcess = new MyProcess(clientSocket);
                myProcess.start();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
