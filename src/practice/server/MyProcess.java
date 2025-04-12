package practice.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyProcess extends Thread {
    private Socket socket;

    public MyProcess(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
           // TODO process later ...
            // Create buffer to read
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Create print writer to write
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            String message;
            while (true) {
                // Receive message
                System.out.println("Listening... wait for client");
                message=reader.readLine();
                System.out.println("Client: " + message);
                // Send message
                System.out.println("Server: ");
                message = scanner.nextLine();
                writer.println(message);
                writer.flush();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
