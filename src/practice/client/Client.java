package practice.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to server
            int port = 99;
            Socket socket = new Socket("localhost", port);
            System.out.println("Connect successfully to server" + "port: " + port);
            // Create buffer to read
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Create print writer to write
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            // General
            Scanner scanner = new Scanner(System.in);
            String message;
            while (true) {
                // Send message
                System.out.println("Client: ");
                message = scanner.nextLine();
                writer.println(message);
                writer.flush();

                // Receive message
                System.out.println("Listening... wait for server");
                message=reader.readLine();
                System.out.println("Server: " + message);
            }
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Cant connect to server");
        }
    }
}
