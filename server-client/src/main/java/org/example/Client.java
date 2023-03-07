package org.example;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9000);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            String request = "Hello";
            System.out.println("User: " + request);
            writer.write(request);
            writer.newLine();
            writer.flush();
            String response = reader.readLine();
            System.out.println("Your answer: " + response);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

